/**
 * Copyright (c) 2015-17 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 * 
 */
package org.eclipse.cmf.occi.core.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class provides some utility methods for the OCCI metamodel.
 *
 * @author Philippe Merle - Inria
 */
public final class OcciHelper {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(OcciRegistry.class);

	/**
	 * This class can not be instantiated.
	 */
	private OcciHelper() {
	}

	// ----------------------------------------------------------------------
	//
	// Related to EMF validation.
	//
	// ----------------------------------------------------------------------

	/**
	 * Validates a given OCCI object according to the EMF and OCL constraints of its
	 * metamodel.
	 * 
	 * @param occiObject
	 *            the given OCCI object.
	 */
	public static boolean validate(EObject occiObject) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(occiObject);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			StringBuffer stringBuffer = printDiagnostic(diagnostic, "", new StringBuffer());
			LOGGER.warn(stringBuffer.toString());
			return false;
		}
		return true;
	}

	/**
	 * Print an EMF validation diagnostic.
	 * 
	 * @param diagnostic
	 * @param indent
	 * @param stringBuffer
	 * @return
	 */
	private static StringBuffer printDiagnostic(Diagnostic diagnostic, String indent, StringBuffer stringBuffer) {
		stringBuffer.append(indent);
		stringBuffer.append(diagnostic.getMessage());
		stringBuffer.append("\n");
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ", stringBuffer);
		}
		return stringBuffer;
	}

	// ----------------------------------------------------------------------
	//
	// Related to loading OCCI files.
	//
	// ----------------------------------------------------------------------

	/**
	 * Load an OCCI extension.
	 * 
	 * @param extensionURI
	 *            URI of the extension to load.
	 * @return the loaded OCCI extension.
	 */
	public static Extension loadExtension(String extensionURI) {
		return (Extension) loadOCCI(extensionURI);
	}

	/**
	 * Load an OCCI configuration.
	 * 
	 * @param configurationURI
	 *            URI of the configuration to load.
	 * @return the loaded OCCI configuration.
	 */
	public static Configuration loadConfiguration(String configurationURI) {
		return (Configuration) loadOCCI(configurationURI);
	}

	/**
	 * Load an OCCI object.
	 * 
	 * @param uri
	 *            URI of the OCCI object to load.
	 * @return the loaded OCCI object.
	 */
	private static Object loadOCCI(String uri) {
		// Create a new resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Load the OCCI resource.
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		// Return the first element.
		return resource.getContents().get(0);
	}

	// ----------------------------------------------------------------------
	//
	// Related to Configuration.
	//
	// ----------------------------------------------------------------------

	/**
	 * Get the configuration containing a given entity.
	 * 
	 * @param entity
	 *            the given entity.
	 * @return the entity configuration.
	 * @throws java.lang.IllegalArgumentException
	 *             If the given entity is not a resource or a link.
	 */
	public static Configuration getConfiguration(final Entity entity) {
		if (entity instanceof Resource) {
			return (Configuration) entity.eContainer();
		} else if (entity instanceof Link) {
			EObject econtainer = entity.eContainer();
			return (econtainer == null) ? null : (Configuration) econtainer.eContainer();
		} else {
			throw new IllegalArgumentException(entity.toString() + " is not a resource or link!");
		}
	}

	public static Configuration getConfiguration(final MixinBase mixinBase) {
		if (mixinBase instanceof MixinBase) {
			return (Configuration) mixinBase.eContainer();
		} else {
			throw new IllegalArgumentException(mixinBase.toString() + " is not a resource or link!");
		}
	}

	// ----------------------------------------------------------------------
	//
	// Related to Kind.
	//
	// ----------------------------------------------------------------------

	/**
	 * Get a kind by its term.
	 * 
	 * @param extension
	 *            The extension where to search.
	 * @param kindTerm
	 *            The term of the kind to search.
	 * @return The found kind.
	 * @throws java.lang.IllegalArgumentException
	 *             If the term is not found into the given extension.
	 */
	public static Kind getKindByTerm(final Extension extension, final String kindTerm) {
		// Iterate over all kinds of the given extension.
		for (Kind kind : extension.getKinds()) {
			// If this kind has the same term that those searched then return this kind.
			if (kind.getTerm().equals(kindTerm)) {
				return kind;
			}
		}
		// Kind not found.
		throw new IllegalArgumentException(
				"term '" + kindTerm + "' is not found into extension '" + extension.getScheme() + "'!");
	}

	public static Mixin getMixinByTerm(final Extension extension, final String kindTerm) {
		// Iterate over all kinds of the given extension.
		for (Mixin mixin : extension.getMixins()) {
			// If this kind has the same term that those searched then return this kind.
			if (mixin.getTerm().equals(kindTerm)) {
				return mixin;
			}
		}
		// Kind not found.
		throw new IllegalArgumentException(
				"term '" + kindTerm + "' is not found into extension '" + extension.getScheme() + "'!");
	}

	public static Collection<Attribute> getAllAttributes(Kind kind) {
		List<Attribute> res = new ArrayList<Attribute>();
		res.addAll(kind.getAttributes());
		if (kind.getParent() != null) {
			res.addAll(getAllAttributes(kind.getParent()));
		}
		return res;
	}

	public static Collection<Attribute> getAllAttributes(Mixin mixin) {
		List<Attribute> res = new ArrayList<Attribute>();
		res.addAll(mixin.getAttributes());
		for (Mixin m : mixin.getDepends()) {
			res.addAll(getAllAttributes(m));
		}
		return res;
	}

	// ----------------------------------------------------------------------
	//
	// Related to Entity.
	//
	// ----------------------------------------------------------------------

	/**
	 * Get all the attributes of an Entity instance.
	 * 
	 * @param entity
	 *            the given Entity instance.
	 * @return all the attributes of the given instance.
	 */
	public static Collection<Attribute> getAllAttributes(final Entity entity) {
		List<Attribute> attributes = new ArrayList<Attribute>();
		Kind entityKind = entity.getKind();
		if (entityKind != null) {
			addAllAttributes(attributes, entityKind);
		}

		/* Removed after supporting mixins in OCCIware metamodel v2 */
		// for(Mixin mixin : entity.getMixins()) {
		// if(mixin != null)
		// addAllAttributes(attributes, mixin);
		// }
		return attributes;
	}

	/**
	 * Get all the attributes of an MixinBase instance.
	 * 
	 * @param mixinBase
	 *            the given MixinBase instance.
	 * @return all the attributes of the given instance.
	 */
	public static Collection<Attribute> getAllAttributes(final MixinBase mixinBase) {
		List<Attribute> attributes = new ArrayList<Attribute>();
		Mixin entityKind = mixinBase.getMixin();
		if (entityKind != null) {
			addAllAttributes(attributes, entityKind);
		}
		return attributes;
	}

	/**
	 * Get all the attributes of an Entity instance and of its different MixinBase instance.
	 * 
	 * @param entity
	 *            the given Entity instance.
	 * @return whole the attributes of the given instance.
	 */
	public static Collection<Attribute> getWholeAttributes(final Entity entity) {
		List<Attribute> attributes = new ArrayList<Attribute>();
		attributes.addAll(getAllAttributes(entity));
		for (MixinBase mb : entity.getParts()) {
			attributes.addAll(getAllAttributes(mb));
		}
		return attributes;
	}
	/**
	 * Add all the attributes of a given Kind instance and all its parent kinds.
	 *
	 * @param attributes
	 *            the collection where attributes will be added.
	 * @param kind
	 *            the given Kind instance.
	 */
	public static void addAllAttributes(final Collection<Attribute> attributes, final Kind kind) {
		Kind kindParent = kind.getParent();
		if (kindParent != null) {
			addAllAttributes(attributes, kindParent);
		}
		attributes.addAll(kind.getAttributes());
	}

	/**
	 * Add all the attributes of a given Mixin instance and all its depend mixins.
	 *
	 * @param attributes
	 *            the collection where attributes will be added.
	 * @param mixin
	 *            the given Mixin instance.
	 */
	public static void addAllAttributes(final Collection<Attribute> attributes, final Mixin mixin) {
		for (Mixin md : mixin.getDepends()) {
			addAllAttributes(attributes, md);
		}
		attributes.addAll(mixin.getAttributes());
	}

	/**
	 * Create an entity of a given kind.
	 * 
	 * @param kind
	 *            The kind of the entity to create.
	 * @return The created entity, else null.
	 */
	public static MixinBase createMixinBase(Entity entity, Mixin mixin) {
		MixinBase createdMixinBase = null;

		// Get the name space of the Ecore package for this mixin.
		String epackageNS = null;
		// If the mixin is a new mixin tag (doesnt exist on extension so, the method
		// eContainer() will return a Configuration object.
		EPackage epackage = null;
		if (mixin.eContainer() instanceof Extension) {
			// Establish that this is an extension.
			epackageNS = Occi2Ecore.convertOcciScheme2EcoreNamespace(((Extension) mixin.eContainer()).getScheme());
			// Get the Ecore package associated to the mixin.
			epackage = EPackage.Registry.INSTANCE.getEPackage(epackageNS);
		}
		// String epackageNS =
		// Occi2Ecore.convertOcciScheme2EcoreNamespace(((Extension)mixin.eContainer()).getScheme());
		if (epackage == null) {
			LOGGER.warn("EPackage " + epackageNS + " not found ! and this is a mixin tag");
		} else {
			String classname = Occi2Ecore.convertOcciCategoryTerm2EcoreClassName(mixin.getTerm());
			// Get the Ecore class associated to the mixin.
			EClass eclass = (EClass) epackage.getEClassifier(classname);
			if (eclass == null) {
				LOGGER.warn("EClass " + classname + " not found!");
			} else {
				// Get the Ecore factory associated to the mixinbase.
				EFactory efactory = EPackage.Registry.INSTANCE.getEFactory(epackageNS);
				if (efactory == null) {
					LOGGER.warn("EFactory " + epackageNS + " not found!");
				} else {
					// Create the EObject for this kind.
					createdMixinBase = (MixinBase) efactory.create(eclass);
				}
			}
		}
		if (createdMixinBase == null) {
			LOGGER.warn("Couldnt create mixin base for mixin : " + mixin.getScheme() + mixin.getTerm());
			createdMixinBase = OCCIFactory.eINSTANCE.createMixinBase();
		}
		createdMixinBase.setMixin(mixin);
		createdMixinBase.setEntity(entity);
		entity.getParts().add(createdMixinBase);

		LOGGER.debug("created MixinBase=" + createdMixinBase);
		// Return the new entity.
		return createdMixinBase;
	}

	/**
	 * Create an entity of a given kind.
	 * 
	 * @param kind
	 *            The kind of the entity to create.
	 * @return The created entity, else null.
	 */
	public static Entity createEntity(Kind kind) {
		Entity createdEntity = null;

		// Get the name space of the Ecore package for this kind.
		String epackageNS = Occi2Ecore.convertOcciScheme2EcoreNamespace(kind.getScheme());
		// Get the Ecore package associated to the kind.
		EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(epackageNS);
		if (epackage == null) {
			LOGGER.warn("EPackage " + epackageNS + " not found!");
		} else {
			String classname = Occi2Ecore.convertOcciCategoryTerm2EcoreClassName(kind.getTerm());
			// Get the Ecore class associated to the kind.
			EClass eclass = (EClass) epackage.getEClassifier(classname);
			if (eclass == null) {
				LOGGER.warn("EClass " + classname + " not found!");
			} else {
				// Get the Ecore factory associated to the kind.
				EFactory efactory = EPackage.Registry.INSTANCE.getEFactory(epackageNS);
				if (efactory == null) {
					LOGGER.warn("EFactory " + epackageNS + " not found!");
				} else {
					// Create the EObject for this kind.
					createdEntity = (Entity) efactory.create(eclass);
				}
			}
		}
		if (createdEntity == null) {
			LOGGER.warn("Create OCCI Core Resource!");
			createdEntity = OCCIFactory.eINSTANCE.createResource();
			createdEntity.setKind(kind);
		}

		LOGGER.debug("created entity=" + createdEntity);
		// Return the new entity.
		return createdEntity;
	}

	/**
	 * Set an attribute of an OCCI entity.
	 * 
	 * @param entity
	 *            the given entity.
	 * @param attributeName
	 *            the attribute name.
	 * @param attributeValue
	 *            the attribute value.
	 * @throws java.lang.IllegalArgumentException
	 *             Thrown when the attribute name is unknown or the attribute value
	 *             is invalid.
	 */
	public static void setAttribute(Entity entity, String attributeName, String attributeValue) {
		// Check that attribute name exists from this entity.
		getAttribute(entity, attributeName);

		// Search the Ecore structural feature associated to the OCCI attribute.
		String eAttributeName = Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attributeName);
		final EStructuralFeature eStructuralFeature = entity.eClass().getEStructuralFeature(eAttributeName);

		if (eStructuralFeature == null) {
			// Create the attribute state and update it, if none, create it.
			AttributeState attrState = getAttributeStateObject(entity, attributeName);
			if (attrState == null) {
				// Create the attribute.
				attrState = createAttributeState(attributeName, attributeValue);
				entity.getAttributes().add(attrState);
			}

			return;
			// throw new IllegalArgumentException("Ecore structural feature '" +
			// eAttributeName + "' not found!");
		}
		if (!(eStructuralFeature instanceof EAttribute)) {
			throw new IllegalArgumentException(
					"Ecore structural feature '" + eAttributeName + "' is not an Ecore attribute!");
		}

		// Obtain the attribute type.
		EDataType eAttributeType = ((EAttribute) eStructuralFeature).getEAttributeType();

		// Convert the attribute value according to the attribute type.
		Object eAttributeValue = eAttributeType.getEPackage().getEFactoryInstance().createFromString(eAttributeType,
				attributeValue);

		// Set the Ecore attribute.
		entity.eSet(eStructuralFeature, eAttributeValue);
	}

	/**
	 * Set an attribute of an OCCI entity.
	 * 
	 * @param mixinBase
	 *            the given entity.
	 * @param attributeName
	 *            the attribute name.
	 * @param attributeValue
	 *            the attribute value.
	 * @throws java.lang.IllegalArgumentException
	 *             Thrown when the attribute name is unknown or the attribute value
	 *             is invalid.
	 */
	public static void setAttribute(MixinBase mixinBase, String attributeName, String attributeValue) {
		// Check that attribute name exists from this entity.
		getAttribute(mixinBase, attributeName);

		// Search the Ecore structural feature associated to the OCCI attribute.
		String eAttributeName = Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attributeName);
		final EStructuralFeature eStructuralFeature = mixinBase.eClass().getEStructuralFeature(eAttributeName);

		if (eStructuralFeature == null) {
			// Create the attribute state and update it, if none, create it.
			AttributeState attrState = getAttributeStateObject(mixinBase, attributeName);
			if (attrState == null) {
				// Create the attribute.
				attrState = createAttributeState(attributeName, attributeValue);
				mixinBase.getAttributes().add(attrState);
			}

			return;
			// throw new IllegalArgumentException("Ecore structural feature '" +
			// eAttributeName + "' not found!");
		}
		if (!(eStructuralFeature instanceof EAttribute)) {
			throw new IllegalArgumentException(
					"Ecore structural feature '" + eAttributeName + "' is not an Ecore attribute!");
		}

		// Obtain the attribute type.
		EDataType eAttributeType = ((EAttribute) eStructuralFeature).getEAttributeType();

		// Convert the attribute value according to the attribute type.
		Object eAttributeValue = eAttributeType.getEPackage().getEFactoryInstance().createFromString(eAttributeType,
				attributeValue);

		// Set the Ecore attribute.
		mixinBase.eSet(eStructuralFeature, eAttributeValue);
	}

	/**
	 * Get an attribute of an OCCI entity.
	 * 
	 * @param entity
	 *            the given entity.
	 * @param attributeName
	 *            the attribute name.
	 * @throws java.lang.IllegalArgumentException
	 *             Thrown when the attribute name is unknown.
	 */
	public static Attribute getAttribute(Entity entity, String attributeName) {
		for (Attribute attribute : getAllAttributes(entity)) {
			if (attribute.getName().equals(attributeName)) {
				return attribute;
			}
		}
		throw new IllegalArgumentException("attribute '" + attributeName + "' is not found in " + entity + "!");
	}

	/**
	 * Get an attribute of an OCCI entity.
	 * 
	 * @param entity
	 *            the given entity.
	 * @param attributeName
	 *            the attribute name.
	 * @throws java.lang.IllegalArgumentException
	 *             Thrown when the attribute name is unknown.
	 */
	public static Attribute getAttribute(MixinBase mixinBase, String attributeName) {
		for (Attribute attribute : getAllAttributes(mixinBase)) {
			if (attribute.getName().equals(attributeName)) {
				return attribute;
			}
		}
		throw new IllegalArgumentException("attribute '" + attributeName + "' is not found in " + mixinBase + "!");
	}

	/**
	 * Execute an action on an OCCI entity.
	 * 
	 * @param entity
	 *            the given entity.
	 * @param actionName
	 *            the action name.
	 * @param parameters
	 *            the parameters.
	 * @throws IllegalArgumentException
	 *             Thrown when the action name is unknown or parameters are invalid.
	 * @throws InvocationTargetException
	 *             Thrown when the action throws an exception.
	 */
	public static void executeAction(Entity entity, String actionName, String... parameters)
			throws InvocationTargetException {
		// TODO: Check that actionName is an OCCI action.

		// Search the Ecore operation.
		EOperation eOperation = null;
		for (EOperation tmp : entity.eClass().getEAllOperations()) {
			if (tmp.getName().equals(actionName)) {
				eOperation = tmp;
				break;
			}
		}
		boolean onMixin = false;
		MixinBase mixinBase = null;
		if (eOperation == null) {
			EList<MixinBase> mixins = entity.getParts();
			for (MixinBase mixin : mixins) {
				for (EOperation tmp : mixin.eClass().getEAllOperations()) {
					if (tmp.getName().equals(actionName)) {
						onMixin = true;
						eOperation = tmp;
						mixinBase = mixin;
						break;
					}
				}
				if (eOperation != null) {
					break;
				}
			}
		}

		// Exception if operation not found.
		if (eOperation == null) {
			throw new IllegalArgumentException("Ecore operation '" + actionName + "' not found!");
		}

		// Check the number of parameters.
		EList<EParameter> eOperationParameters = eOperation.getEParameters();
		int nbParameters = eOperationParameters.size();
		if (parameters.length != nbParameters) {
			throw new IllegalArgumentException(
					"Bad number of parameters: " + parameters.length + " given when " + nbParameters + " expected!");
		}

		// Convert parameters according to the type of Ecore operation parameters.
		Object[] eParameters = new Object[nbParameters];
		Class<?>[] parameterClasses = new Class[nbParameters];
		for (int i = 0; i < nbParameters; i++) {
			EParameter eParameter = eOperationParameters.get(i);
			EDataType parameterType = (EDataType) eParameter.getEType();
			try {
				eParameters[i] = parameterType.getEPackage().getEFactoryInstance().createFromString(parameterType,
						parameters[i]);
			} catch (IllegalArgumentException e) {
				throw new IllegalArgumentException("Bad value for '" + eParameter.getName() + "' parameter!", e);
			}
			parameterClasses[i] = parameterType.getInstanceClass();
		}

		// Execute the Ecore operation.
		// FIXME: Does not work for Infrastructure metamodel!
		// entity.eInvoke(eOperation, null);

		// FIXME: Then use Java reflection invocation.
		try {
			if (!onMixin) {
				Method method = entity.getClass().getMethod(actionName, parameterClasses);
				method.invoke(entity, eParameters);
			} else {
				Method method = mixinBase.getClass().getMethod(actionName, parameterClasses);
				method.invoke(mixinBase, eParameters);
			}
		} catch (NoSuchMethodException e) {
			throw new IllegalArgumentException("Method '" + actionName + "' not found!", e);
		} catch (SecurityException e) {
			throw new IllegalArgumentException("Security exception on method '" + actionName + "'!", e);
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException("Illegal access exception on method '" + actionName + "'!", e);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Illegal argument exception on method '" + actionName + "'!", e);
		}
	}

	/**
	 * Create an attribute without add this to the entity object.
	 * 
	 * @param name
	 * @param value
	 * @return AttributeState object.
	 */
	private static AttributeState createAttributeState(final String name, final String value) {
		AttributeState attr = OCCIFactory.eINSTANCE.createAttributeState();
		attr.setName(name);
		attr.setValue(value);
		return attr;
	}

	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute does not exist, null value is
	 *         returned.
	 */
	private static AttributeState getAttributeStateObject(Entity entity, final String key) {
		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : entity.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}

	private static AttributeState getAttributeStateObject(MixinBase mixinBase, final String key) {
		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : mixinBase.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}

	public static EObject getRootElement(ResourceSet resourceSet, String path) {
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(URI.createURI(path), true);
		EcoreUtil.resolveAll(resource);
		return resource.getContents().get(0);
	}
	
	public static EObject getRootElement(ResourceSet resourceSet, IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		//System.out.println("file " + file.getFullPath().toString());
		//System.out.println("uri " + uri);
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resource);
		return resource.getContents().get(0);
	}
	
	/**
     * Get the mixin base instance tClass to apply on instance.
     * For example : Optional<User_data> optionalUserData = MixinUtils.getMixinBase(myresourcemodel.getParts(),User_data.class);
     */
    public static <T extends MixinBase> Optional<T> getMixinBase(EList<MixinBase> mixins, Class<T> tClass){
        List<MixinBase> mixinBase = mixins;
        return mixinBase.stream()
                .filter(mixinB -> tClass.isInstance(mixinB))
                .findFirst()
                .map(mixin -> (T) mixin);
    }

    /**
     * Get the mixin base instance tClass to apply on instance.
     * Same as getMixinBase with single class but with a list of classes.
     * The list of classes may be listed as the following : 
     * List<Class<T>> resourceTplList = new ArrayList<>();
     * resourceTplList.add((Class<T>) Small.class);
     * resourceTplList.add((Class<T>) Medium.class);
     * resourceTplList.add((Class<T>) Large.class);
     */
    public static <T extends MixinBase> Optional<T> getMixinBase(EList<MixinBase> mixins, List<Class<T>> tClasses){
        List<MixinBase> mixinBases = mixins;
        return mixinBases.stream()
                .filter(mixinB -> tClasses.stream()
                        .anyMatch(tClass -> tClass.isInstance(mixinB)))
                .findFirst()
                .map(mixin -> (T) mixin);
    }
	
}
