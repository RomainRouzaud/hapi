/**
 */
package som.swagger.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.swagger.core.Info#getTitle <em>Title</em>}</li>
 *   <li>{@link som.swagger.core.Info#getDescription <em>Description</em>}</li>
 *   <li>{@link som.swagger.core.Info#getTermsOfServices <em>Terms Of Services</em>}</li>
 *   <li>{@link som.swagger.core.Info#getContact <em>Contact</em>}</li>
 *   <li>{@link som.swagger.core.Info#getLicense <em>License</em>}</li>
 *   <li>{@link som.swagger.core.Info#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see som.swagger.core.CorePackage#getInfo()
 * @model
 * @generated
 */
public interface Info extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see som.swagger.core.CorePackage#getInfo_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link som.swagger.core.Info#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see som.swagger.core.CorePackage#getInfo_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link som.swagger.core.Info#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Terms Of Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Of Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Of Services</em>' attribute.
	 * @see #setTermsOfServices(String)
	 * @see som.swagger.core.CorePackage#getInfo_TermsOfServices()
	 * @model
	 * @generated
	 */
	String getTermsOfServices();

	/**
	 * Sets the value of the '{@link som.swagger.core.Info#getTermsOfServices <em>Terms Of Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Of Services</em>' attribute.
	 * @see #getTermsOfServices()
	 * @generated
	 */
	void setTermsOfServices(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(Contact)
	 * @see som.swagger.core.CorePackage#getInfo_Contact()
	 * @model containment="true"
	 * @generated
	 */
	Contact getContact();

	/**
	 * Sets the value of the '{@link som.swagger.core.Info#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(Contact value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(License)
	 * @see som.swagger.core.CorePackage#getInfo_License()
	 * @model containment="true"
	 * @generated
	 */
	License getLicense();

	/**
	 * Sets the value of the '{@link som.swagger.core.Info#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(License value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see som.swagger.core.CorePackage#getInfo_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link som.swagger.core.Info#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Info