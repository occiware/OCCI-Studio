/*******************************************************************************
 * Copyright (c) 2015-2017 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.connector.jocci.services;

import cz.cesnet.cloud.occi.Model;
import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.EntityBuilder;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.api.exception.EntityBuildingException;
import cz.cesnet.cloud.occi.core.ActionInstance;
import cz.cesnet.cloud.occi.exception.InvalidAttributeValueException;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.connector.jocci.Activator;
import org.eclipse.cmf.occi.core.connector.jocci.dialogs.OcciActionDialog;
import org.eclipse.cmf.occi.core.connector.jocci.dialogs.OcciServerDialog;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;



public class DesignServices {

	// TODO: add a location attribute to the Configuration class.
	private Client jocciClient;

	/**
	 * Report an exception.
	 * @param throwable the exception to report.
	 */
	private static void reportException(Throwable throwable)
	{
		Shell shell = Display.getCurrent().getActiveShell();
		Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, null, throwable);
		ErrorDialog.openError(shell, null, throwable.getMessage(), status);
		throwable.printStackTrace(System.err);
	}

	/**
	 * Get the jOCCI client.
	 * It is created the first time.
	 * @return the jOCCI client.
	 */
	private Client getJocciClient()
	{
		if(jocciClient == null) {
			Shell shell = Display.getCurrent().getActiveShell();
			OcciServerDialog occiServerDialog = new OcciServerDialog(shell);
			occiServerDialog.create();
			if (occiServerDialog.open() == Window.OK) {
				String occiServerUrl = occiServerDialog.getOcciServerUrl();
				if(occiServerUrl == null || occiServerUrl.isEmpty()) {
					return null;
				}
				try {
					// Create a jOCCI client.
					jocciClient = Importer.newJocciClient(occiServerUrl);
				} catch(CommunicationException ce) {
					reportException(ce);
					jocciClient = null;
				}
			}
		}
		return jocciClient;
	}

	/**
	 * Get the jOCCI client.
	 * It is created the first time.
	 * @param entity
	 * @return the jOCCI client.
	 */
	private Client getJocciClient(Entity entity)
	{
		if(jocciClient == null) {
			try {
				// Create a jOCCI client.
				jocciClient = Importer.newJocciClient(OcciHelper.getConfiguration(entity).getLocation());
			} catch(CommunicationException ce) {
				reportException(ce);
				jocciClient = null;
			}
		}
		return jocciClient;
	}

	/**
	 * Get the identifier for a given category.
	 * @param category the given category.
	 * @return its identifier, aka scheme + term.
	 */
	private static String getIdentifier(org.eclipse.cmf.occi.core.Category category)
	{
		return category.getScheme() + category.getTerm();
	}

	/**
	 * Create an URI for a given category.
	 * @param category the given category.
	 * @return the created URI.
	 */
	private static URI createURI(org.eclipse.cmf.occi.core.Category category)
	{
		return URI.create(getIdentifier(category));
	}

	/**
	 * Get the location of a given entity.
	 * @param entity the given entity.
	 * @return its location inside the OCCI server.
	 */
	private String getLocation(Entity entity)
	{
		org.eclipse.cmf.occi.core.Kind entityKind = entity.getKind();
		cz.cesnet.cloud.occi.core.Kind jocciKind = jocciClient.getModel().findKind(createURI(entityKind));
		if(jocciKind == null) {
			reportException(new Error("Kind " + entityKind.getScheme() + entityKind.getTerm() + " not found!"));
			return null;
		}
		return jocciKind.getLocation().toString() + entity.getId();
	}

	/**
	 * Create a jOCCI entity from an OCCIware entity.
	 * @param entity the OCCIware entity.
	 * @return the jOCCI entity.
	 */
	private cz.cesnet.cloud.occi.core.Entity newJocciEntity(org.eclipse.cmf.occi.core.Entity entity)
	{
		// Get the jOCCI model.
        Model jocciModel = jocciClient.getModel();
        // Get an jOCCI entity builder.
        EntityBuilder eb = new EntityBuilder(jocciModel);

        // The jOCCI entity to create.
        cz.cesnet.cloud.occi.core.Entity jocciEntity = null;

        if(entity instanceof org.eclipse.cmf.occi.core.Resource) {
        	try {
        		// Create an jOCCI resource.
        		jocciEntity = eb.getResource(createURI(entity.getKind()));
        	} catch (EntityBuildingException ebe) {
				reportException(ebe);
        		return null;
        	}
        } else if(entity instanceof org.eclipse.cmf.occi.core.Link) {
        	org.eclipse.cmf.occi.core.Link link = (org.eclipse.cmf.occi.core.Link)entity;
        	cz.cesnet.cloud.occi.core.Link jocciLink = null;
        	try {
        		// Create an jOCCI link.
        		jocciLink = eb.getLink(createURI(entity.getKind()));
        		jocciEntity = jocciLink;
        	} catch (EntityBuildingException ebe) {
				reportException(ebe);
        		return null;
        	}
        	try {
				jocciLink.setSource(getLocation(link.getSource()));
			} catch (InvalidAttributeValueException iave) {
				reportException(iave);
				return null;
			}
        	try {
				jocciLink.setTarget(getLocation(link.getTarget()));
			} catch (InvalidAttributeValueException iave) {
				reportException(iave);
				return null;
			}
        } else {
        	// Should never happen!
        	reportException(new Error("Must be a Resource or a Link"));
        	return null;
        }

        // Iterate over all entity's mixins.
        for(org.eclipse.cmf.occi.core.Mixin mixin : entity.getMixins()) {
        	cz.cesnet.cloud.occi.core.Mixin jocciMixin = jocciModel.findMixin(createURI(mixin));
        	jocciEntity.addMixin(jocciMixin);
        }

        // Iterate over all entity's attributes.
        for(org.eclipse.cmf.occi.core.AttributeState as : entity.getAttributes()) {
        	try {
        		jocciEntity.addAttribute(as.getName(), as.getValue());
			} catch (InvalidAttributeValueException iave) {
				reportException(iave);
			}
        }

        return jocciEntity;
	}

	private void convertJocciEntity2Entity(
					cz.cesnet.cloud.occi.core.Entity source, 
					org.eclipse.cmf.occi.core.Entity target)
	{
		// Set the target entity's id.
		target.setId(source.getId());
		// Set the target entity's kind.
		String sourceKindIdentifier = source.getKind().getIdentifier();
		if(sourceKindIdentifier.equals(getIdentifier(target.getKind()))) {
			// Nothing to do as the kind has not been changed.
		} else {
			// TODO: implement it
			System.err.println("Entity's kind has been changed to " + sourceKindIdentifier);
//			org.occiware.clouddesigner.occi.Kind targetKind = searchKind(configuration, source.getKind());
//			if(targetKind != null) {
//				target.setKind(targetKind);
//			} else {
				// TODO: Use Eclipse error report.
//				System.err.println("Kind " + sourceKindIdentifier + " unknown!");
//			}
		}
		// TODO: implement it
		// Set target entity's mixins.
// 		List<org.occiware.clouddesigner.occi.Mixin> targetMixins = target.getMixins();
//		for(cz.cesnet.cloud.occi.core.Mixin mixin : source.getMixins()) {
//			String mixinIdentifier = mixin.getIdentifier();
//			org.occiware.clouddesigner.occi.Mixin targetMixin = searchMixin(configuration, mixin);
//			if(targetMixin != null) {
//				targetMixins.add(targetMixin);
//			} else {
				// TODO: Use Eclipse error report.
//				System.err.println("Mixin " + mixinIdentifier + " unknown!");
//			}
//		}
		// Create all target entity's attributes.
		List<org.eclipse.cmf.occi.core.AttributeState> targetAttributes = target.getAttributes();
		targetAttributes.clear();
		for(Map.Entry<cz.cesnet.cloud.occi.core.Attribute, String> sourceAttribute : source.getAttributes().entrySet()) {
			String attributeName = sourceAttribute.getKey().getName();
			if(!Importer.attributesToOmit.contains(attributeName)) {
				org.eclipse.cmf.occi.core.AttributeState targetAttribute = org.eclipse.cmf.occi.core.OCCIFactory.eINSTANCE.createAttributeState();
				targetAttributes.add(targetAttribute);
				targetAttribute.setName(sourceAttribute.getKey().getName());
				targetAttribute.setValue(sourceAttribute.getValue());
			}
		}
		if(source instanceof cz.cesnet.cloud.occi.core.Link) {
			// TODO: deal with Link
			System.err.println("TODO: Deal with a Link instance");
		}
	}

	/**
	 * Import into a configuration.
	 * @param configuration
	 */
	public void importConfiguration(Configuration configuration) {
		Client jocciClient = getJocciClient();
		if(jocciClient != null) {
			try {
				Importer.importFromOcciServer(configuration, jocciClient);
			} catch(Throwable throwable) {
				reportException(throwable);
			}
		}
	}

	/**
	 * Create an OCCI entity.
	 * @param entity the entity to create.
	 */
	public void createEntity(Entity entity)
	{
		// Get the jOCCI client to interact with an OCCI server.
		Client jocciClient = getJocciClient(entity);
		if(jocciClient == null) {
			return;
		}

        // Create the jOCCI entity.
        cz.cesnet.cloud.occi.core.Entity jocciEntity = newJocciEntity(entity);
        if(jocciEntity == null) {
        	return;
        }

        URI location = null;
        try {
        	// Create the OCCI resource.
        	location = jocciClient.create(jocciEntity);
        } catch (CommunicationException ce) {
        	reportException(ce);
        	return;
        }
        // Update the ID of the entity.
        String path = location.getPath();
        String id = path.substring(path.lastIndexOf('/') + 1);
        entity.setId(id);

        MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Create OCCI Entity", "Entity " + location.toString() + " created");
	}

	/**
	 * Retrieve an OCCI entity.
	 * @param entity the entity to retrieve.
	 */
	public void retrieveEntity(Entity entity)
	{
		Client jocciClient = getJocciClient(entity);
		if(jocciClient == null) {
			return;
		}

		// Retrieve the jOCCI entity.
		cz.cesnet.cloud.occi.core.Entity jocciEntity = null;
		try {
			jocciEntity = jocciClient.describe(URI.create(getLocation(entity))).get(0);
		} catch (CommunicationException ce) {
			reportException(ce);
			return;
		}

		convertJocciEntity2Entity(jocciEntity, entity);

        MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Retrieve OCCI Entity", "Entity " + getLocation(entity) + " retrieved");
	}

	/**
	 * Update an OCCI entity.
	 * @param entity the entity to update.
	 */
	public void updateEntity(Entity entity)
	{
		Client jocciClient = getJocciClient(entity);
		if(jocciClient == null) {
			return;
		}

        // Create the jOCCI entity.
        cz.cesnet.cloud.occi.core.Entity jocciEntity = newJocciEntity(entity);
        if(jocciEntity == null) {
        	return;
        }
        try {
			jocciEntity.setId(entity.getId());
		} catch (InvalidAttributeValueException iave) {
			reportException(iave);
			return;
		}

        try {
        	// Update the OCCI resource.
        	boolean updated = jocciClient.update(jocciEntity);
        	if(updated) {
              MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Update OCCI Entity", "Entity " + getLocation(entity) + " updated");
        	} else {
              MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Update OCCI Entity", "Entity " + getLocation(entity) + " not updated");
        	}
        } catch (CommunicationException ce) {
        	reportException(ce);
        	return;
        }
	}

	/**
	 * Execute an OCCI action on an OCCI entity.
	 * @param entity the entity on which an OCCI action will be executed.
	 */
	public void executeAction(Entity entity)
	{
		Client jocciClient = getJocciClient(entity);
		if(jocciClient == null) {
			return;
		}

		// Get all actions of the entity.
		List<Action> actions = new ArrayList<Action>();
		addActions(entity, actions);

		// Display the OCCI action dialog.
		Shell shell = Display.getCurrent().getActiveShell();
		OcciActionDialog occiActionDialog = new OcciActionDialog(shell, actions.toArray(new Action[actions.size()]));
		occiActionDialog.create();
		if (occiActionDialog.open() != Window.OK) {
			return;
		}
		String selectedAction = occiActionDialog.getSelectedAction();
		if(selectedAction == null || selectedAction.isEmpty()) {
			return;
		}

		// Get an jOCCI entity builder.
        EntityBuilder eb = new EntityBuilder(jocciClient.getModel());
        
        // Create a jOCCI action instance.
		ActionInstance actionInstance;
		try {
			actionInstance = eb.getActionInstance(URI.create(selectedAction));
		} catch (EntityBuildingException ebe) {
			reportException(ebe);
			return;
		}

		// TODO: add action's parameters.

		// Execute the OCCI action.
        try {
        	boolean status = jocciClient.trigger(URI.create(getLocation(entity)), actionInstance);
        	if(status) {
                MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Execute OCCI Action", "Action " + selectedAction + " on " + getLocation(entity) + " executed");
          	} else {
                MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Execute OCCI Action", "Action " + selectedAction + " on " + getLocation(entity) + " failed");
          	}
		} catch (CommunicationException ce) {
			reportException(ce);
			return;
		}
	}

	private static void addActions(org.eclipse.cmf.occi.core.Entity entity, List<Action> actions)
	{
		addActions(entity.getKind(), actions);
		for(org.eclipse.cmf.occi.core.Mixin mixin : entity.getMixins()) {
			addActions(mixin, actions);
		}
	}

	private static void addActions(org.eclipse.cmf.occi.core.Kind kind, List<Action> actions)
	{
		if(kind == null) { return; }
		addActions(kind.getParent(), actions);
		actions.addAll(kind.getActions());
	}

	private static void addActions(org.eclipse.cmf.occi.core.Mixin mixin, List<Action> actions)
	{
		for(org.eclipse.cmf.occi.core.Mixin depend : mixin.getDepends()) {
			addActions(depend, actions);
		}
		actions.addAll(mixin.getActions());
	}

	/**
	 * Delete an OCCI entity.
	 * @param entity the entity to delete.
	 */
	public void deleteEntity(Entity entity)
	{
		Client jocciClient = getJocciClient(entity);
		if(jocciClient == null) {
			return;
		}
		
		boolean deleted = false;
		try {
			deleted = jocciClient.delete(URI.create(getLocation(entity)));
		} catch (CommunicationException ce) {
			reportException(ce);
			return;
		}

    	if(deleted) {
            MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Delete OCCI Entity", "Entity " + getLocation(entity) + " deleted");
      	} else {
            MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Delete OCCI Entity", "Entity " + getLocation(entity) + " not deleted");
			return;
      	}

		if(entity instanceof org.eclipse.cmf.occi.core.Resource) {
			Configuration configuration = (Configuration)entity.eContainer();
			configuration.getResources().remove(entity);
		} else if(entity instanceof org.eclipse.cmf.occi.core.Link) {
			org.eclipse.cmf.occi.core.Link link = (org.eclipse.cmf.occi.core.Link)entity;
			link.getSource().getLinks().remove(link);
		} else {
			// Should never happen!
			reportException(new Error("Must be a Resource or a Link"));
			return;
		}
	}
}
