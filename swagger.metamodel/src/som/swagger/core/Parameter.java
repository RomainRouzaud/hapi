/**
 */
package som.swagger.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.swagger.core.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getIn <em>In</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#isRequired <em>Required</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getFormat <em>Format</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#isAllowEmplyValue <em>Allow Emply Value</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getItems <em>Items</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#isExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#isExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getPattern <em>Pattern</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#isUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getSchema <em>Schema</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getEnum <em>Enum</em>}</li>
 *   <li>{@link som.swagger.core.Parameter#getGlobalName <em>Global Name</em>}</li>
 * </ul>
 *
 * @see som.swagger.core.CorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see som.swagger.core.CorePackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * The literals are from the enumeration {@link som.swagger.core.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see som.swagger.core.ParameterLocation
	 * @see #setIn(ParameterLocation)
	 * @see som.swagger.core.CorePackage#getParameter_In()
	 * @model
	 * @generated
	 */
	ParameterLocation getIn();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see som.swagger.core.ParameterLocation
	 * @see #getIn()
	 * @generated
	 */
	void setIn(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see som.swagger.core.CorePackage#getParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see som.swagger.core.CorePackage#getParameter_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link som.swagger.core.JsonDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see som.swagger.core.JsonDataType
	 * @see #setType(JsonDataType)
	 * @see som.swagger.core.CorePackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	JsonDataType getType();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see som.swagger.core.JsonDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(JsonDataType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see som.swagger.core.CorePackage#getParameter_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Allow Emply Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Emply Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #setAllowEmplyValue(boolean)
	 * @see som.swagger.core.CorePackage#getParameter_AllowEmplyValue()
	 * @model
	 * @generated
	 */
	boolean isAllowEmplyValue();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#isAllowEmplyValue <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #isAllowEmplyValue()
	 * @generated
	 */
	void setAllowEmplyValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Items)
	 * @see som.swagger.core.CorePackage#getParameter_Items()
	 * @model containment="true"
	 * @generated
	 */
	Items getItems();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Items value);

	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link som.swagger.core.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see som.swagger.core.CollectionFormat
	 * @see #setCollectionFormat(CollectionFormat)
	 * @see som.swagger.core.CorePackage#getParameter_CollectionFormat()
	 * @model
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see som.swagger.core.CollectionFormat
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see som.swagger.core.CorePackage#getParameter_Maximum()
	 * @model
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #setExclusiveMaximum(boolean)
	 * @see som.swagger.core.CorePackage#getParameter_ExclusiveMaximum()
	 * @model
	 * @generated
	 */
	boolean isExclusiveMaximum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#isExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #isExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see som.swagger.core.CorePackage#getParameter_Minimum()
	 * @model
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #setExclusiveMinimum(boolean)
	 * @see som.swagger.core.CorePackage#getParameter_ExclusiveMinimum()
	 * @model
	 * @generated
	 */
	boolean isExclusiveMinimum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#isExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #isExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see som.swagger.core.CorePackage#getParameter_MaxLength()
	 * @model
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see som.swagger.core.CorePackage#getParameter_MinLength()
	 * @model
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see som.swagger.core.CorePackage#getParameter_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(int)
	 * @see som.swagger.core.CorePackage#getParameter_MaxItems()
	 * @model
	 * @generated
	 */
	int getMaxItems();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(int value);

	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(int)
	 * @see som.swagger.core.CorePackage#getParameter_MinItems()
	 * @model
	 * @generated
	 */
	int getMinItems();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(int value);

	/**
	 * Returns the value of the '<em><b>Unique Items</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Items</em>' attribute.
	 * @see #setUniqueItems(boolean)
	 * @see som.swagger.core.CorePackage#getParameter_UniqueItems()
	 * @model default="false"
	 * @generated
	 */
	boolean isUniqueItems();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#isUniqueItems <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Items</em>' attribute.
	 * @see #isUniqueItems()
	 * @generated
	 */
	void setUniqueItems(boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Of</em>' attribute.
	 * @see #setMultipleOf(int)
	 * @see som.swagger.core.CorePackage#getParameter_MultipleOf()
	 * @model
	 * @generated
	 */
	int getMultipleOf();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(int value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(Schema)
	 * @see som.swagger.core.CorePackage#getParameter_Schema()
	 * @model containment="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see som.swagger.core.CorePackage#getParameter_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @see som.swagger.core.CorePackage#getParameter_Enum()
	 * @model
	 * @generated
	 */
	EList<String> getEnum();

	/**
	 * Returns the value of the '<em><b>Global Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Name</em>' attribute.
	 * @see #setGlobalName(String)
	 * @see som.swagger.core.CorePackage#getParameter_GlobalName()
	 * @model
	 * @generated
	 */
	String getGlobalName();

	/**
	 * Sets the value of the '{@link som.swagger.core.Parameter#getGlobalName <em>Global Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Name</em>' attribute.
	 * @see #getGlobalName()
	 * @generated
	 */
	void setGlobalName(String value);

} // Parameter