/**
 * generated by Xtext 2.17.1
 */
package com.spirit.ihe.iHE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.spirit.ihe.iHE.IHEFactory
 * @model kind="package"
 * @generated
 */
public interface IHEPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "iHE";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.spirit.com/ihe/IHE";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "iHE";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IHEPackage eINSTANCE = com.spirit.ihe.iHE.impl.IHEPackageImpl.init();

  /**
   * The meta object id for the '{@link com.spirit.ihe.iHE.impl.IHEImpl <em>IHE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.ihe.iHE.impl.IHEImpl
   * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getIHE()
   * @generated
   */
  int IHE = 0;

  /**
   * The feature id for the '<em><b>Import El</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHE__IMPORT_EL = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHE__MAIN = 1;

  /**
   * The number of structural features of the '<em>IHE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IHE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.spirit.ihe.iHE.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.ihe.iHE.impl.ImportImpl
   * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.spirit.ihe.iHE.impl.MainTgfImpl <em>Main Tgf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.ihe.iHE.impl.MainTgfImpl
   * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getMainTgf()
   * @generated
   */
  int MAIN_TGF = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__NAME = 0;

  /**
   * The feature id for the '<em><b>Gen Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__GEN_PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Sat Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__SAT_NAME = 2;

  /**
   * The feature id for the '<em><b>Version Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__VERSION_NAME = 3;

  /**
   * The feature id for the '<em><b>Status Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__STATUS_NAME = 4;

  /**
   * The feature id for the '<em><b>Objective Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__OBJECTIVE_NAME = 5;

  /**
   * The feature id for the '<em><b>Hlfunction Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__HLFUNCTION_NAME = 6;

  /**
   * The feature id for the '<em><b>Rules</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__RULES = 7;

  /**
   * The feature id for the '<em><b>Prof</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF__PROF = 8;

  /**
   * The number of structural features of the '<em>Main Tgf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_TGF_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.spirit.ihe.iHE.impl.ProfileImpl <em>Profile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.ihe.iHE.impl.ProfileImpl
   * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getProfile()
   * @generated
   */
  int PROFILE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Prof Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__PROF_NAME = 1;

  /**
   * The feature id for the '<em><b>Descr Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__DESCR_NAME = 2;

  /**
   * The feature id for the '<em><b>Feat Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__FEAT_NAME = 3;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__FUNCTION_NAME = 4;

  /**
   * The feature id for the '<em><b>Actor</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__ACTOR = 5;

  /**
   * The feature id for the '<em><b>Transaction</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__TRANSACTION = 6;

  /**
   * The feature id for the '<em><b>Domain</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__DOMAIN = 7;

  /**
   * The feature id for the '<em><b>Qualityattr</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__QUALITYATTR = 8;

  /**
   * The feature id for the '<em><b>Secre</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE__SECRE = 9;

  /**
   * The number of structural features of the '<em>Profile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFILE_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl <em>Sec Requirements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.spirit.ihe.iHE.impl.SecRequirementsImpl
   * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getSecRequirements()
   * @generated
   */
  int SEC_REQUIREMENTS = 4;

  /**
   * The feature id for the '<em><b>Sec Re ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SEC_RE_ID = 0;

  /**
   * The feature id for the '<em><b>Secre Form</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SECRE_FORM = 1;

  /**
   * The feature id for the '<em><b>Secre Sensitivity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SECRE_SENSITIVITY = 2;

  /**
   * The feature id for the '<em><b>Secre Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SECRE_LOCATION = 3;

  /**
   * The feature id for the '<em><b>Secre State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SECRE_STATE = 4;

  /**
   * The feature id for the '<em><b>Secre Goal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SECRE_GOAL = 5;

  /**
   * The feature id for the '<em><b>Secre Countermeasure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SECRE_COUNTERMEASURE = 6;

  /**
   * The feature id for the '<em><b>Secre Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS__SECRE_CATEGORY = 7;

  /**
   * The number of structural features of the '<em>Sec Requirements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_REQUIREMENTS_FEATURE_COUNT = 8;


  /**
   * Returns the meta object for class '{@link com.spirit.ihe.iHE.IHE <em>IHE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IHE</em>'.
   * @see com.spirit.ihe.iHE.IHE
   * @generated
   */
  EClass getIHE();

  /**
   * Returns the meta object for the containment reference list '{@link com.spirit.ihe.iHE.IHE#getImportEl <em>Import El</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Import El</em>'.
   * @see com.spirit.ihe.iHE.IHE#getImportEl()
   * @see #getIHE()
   * @generated
   */
  EReference getIHE_ImportEl();

  /**
   * Returns the meta object for the containment reference '{@link com.spirit.ihe.iHE.IHE#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see com.spirit.ihe.iHE.IHE#getMain()
   * @see #getIHE()
   * @generated
   */
  EReference getIHE_Main();

  /**
   * Returns the meta object for class '{@link com.spirit.ihe.iHE.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.spirit.ihe.iHE.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.spirit.ihe.iHE.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link com.spirit.ihe.iHE.MainTgf <em>Main Tgf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Tgf</em>'.
   * @see com.spirit.ihe.iHE.MainTgf
   * @generated
   */
  EClass getMainTgf();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.MainTgf#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_Name();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.MainTgf#getGenPackage <em>Gen Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen Package</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getGenPackage()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_GenPackage();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.MainTgf#getSatName <em>Sat Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sat Name</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getSatName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_SatName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.MainTgf#getVersionName <em>Version Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Name</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getVersionName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_VersionName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.MainTgf#getStatusName <em>Status Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status Name</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getStatusName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_StatusName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.MainTgf#getObjectiveName <em>Objective Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Objective Name</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getObjectiveName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_ObjectiveName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.MainTgf#getHlfunctionName <em>Hlfunction Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hlfunction Name</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getHlfunctionName()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_HlfunctionName();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.ihe.iHE.MainTgf#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rules</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getRules()
   * @see #getMainTgf()
   * @generated
   */
  EAttribute getMainTgf_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link com.spirit.ihe.iHE.MainTgf#getProf <em>Prof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prof</em>'.
   * @see com.spirit.ihe.iHE.MainTgf#getProf()
   * @see #getMainTgf()
   * @generated
   */
  EReference getMainTgf_Prof();

  /**
   * Returns the meta object for class '{@link com.spirit.ihe.iHE.Profile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Profile</em>'.
   * @see com.spirit.ihe.iHE.Profile
   * @generated
   */
  EClass getProfile();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.Profile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.spirit.ihe.iHE.Profile#getName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Name();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.Profile#getProfName <em>Prof Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prof Name</em>'.
   * @see com.spirit.ihe.iHE.Profile#getProfName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_ProfName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.Profile#getDescrName <em>Descr Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descr Name</em>'.
   * @see com.spirit.ihe.iHE.Profile#getDescrName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_DescrName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.Profile#getFeatName <em>Feat Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feat Name</em>'.
   * @see com.spirit.ihe.iHE.Profile#getFeatName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_FeatName();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.Profile#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see com.spirit.ihe.iHE.Profile#getFunctionName()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_FunctionName();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.ihe.iHE.Profile#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Actor</em>'.
   * @see com.spirit.ihe.iHE.Profile#getActor()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Actor();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.ihe.iHE.Profile#getTransaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Transaction</em>'.
   * @see com.spirit.ihe.iHE.Profile#getTransaction()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Transaction();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.ihe.iHE.Profile#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Domain</em>'.
   * @see com.spirit.ihe.iHE.Profile#getDomain()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Domain();

  /**
   * Returns the meta object for the attribute list '{@link com.spirit.ihe.iHE.Profile#getQualityattr <em>Qualityattr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Qualityattr</em>'.
   * @see com.spirit.ihe.iHE.Profile#getQualityattr()
   * @see #getProfile()
   * @generated
   */
  EAttribute getProfile_Qualityattr();

  /**
   * Returns the meta object for the containment reference list '{@link com.spirit.ihe.iHE.Profile#getSecre <em>Secre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Secre</em>'.
   * @see com.spirit.ihe.iHE.Profile#getSecre()
   * @see #getProfile()
   * @generated
   */
  EReference getProfile_Secre();

  /**
   * Returns the meta object for class '{@link com.spirit.ihe.iHE.SecRequirements <em>Sec Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sec Requirements</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements
   * @generated
   */
  EClass getSecRequirements();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecReID <em>Sec Re ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sec Re ID</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecReID()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecReID();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecreForm <em>Secre Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secre Form</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecreForm()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecreForm();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecreSensitivity <em>Secre Sensitivity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secre Sensitivity</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecreSensitivity()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecreSensitivity();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecreLocation <em>Secre Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secre Location</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecreLocation()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecreLocation();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecreState <em>Secre State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secre State</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecreState()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecreState();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecreGoal <em>Secre Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secre Goal</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecreGoal()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecreGoal();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecreCountermeasure <em>Secre Countermeasure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secre Countermeasure</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecreCountermeasure()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecreCountermeasure();

  /**
   * Returns the meta object for the attribute '{@link com.spirit.ihe.iHE.SecRequirements#getSecreCategory <em>Secre Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secre Category</em>'.
   * @see com.spirit.ihe.iHE.SecRequirements#getSecreCategory()
   * @see #getSecRequirements()
   * @generated
   */
  EAttribute getSecRequirements_SecreCategory();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IHEFactory getIHEFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.spirit.ihe.iHE.impl.IHEImpl <em>IHE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.ihe.iHE.impl.IHEImpl
     * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getIHE()
     * @generated
     */
    EClass IHE = eINSTANCE.getIHE();

    /**
     * The meta object literal for the '<em><b>Import El</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IHE__IMPORT_EL = eINSTANCE.getIHE_ImportEl();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IHE__MAIN = eINSTANCE.getIHE_Main();

    /**
     * The meta object literal for the '{@link com.spirit.ihe.iHE.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.ihe.iHE.impl.ImportImpl
     * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link com.spirit.ihe.iHE.impl.MainTgfImpl <em>Main Tgf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.ihe.iHE.impl.MainTgfImpl
     * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getMainTgf()
     * @generated
     */
    EClass MAIN_TGF = eINSTANCE.getMainTgf();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__NAME = eINSTANCE.getMainTgf_Name();

    /**
     * The meta object literal for the '<em><b>Gen Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__GEN_PACKAGE = eINSTANCE.getMainTgf_GenPackage();

    /**
     * The meta object literal for the '<em><b>Sat Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__SAT_NAME = eINSTANCE.getMainTgf_SatName();

    /**
     * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__VERSION_NAME = eINSTANCE.getMainTgf_VersionName();

    /**
     * The meta object literal for the '<em><b>Status Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__STATUS_NAME = eINSTANCE.getMainTgf_StatusName();

    /**
     * The meta object literal for the '<em><b>Objective Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__OBJECTIVE_NAME = eINSTANCE.getMainTgf_ObjectiveName();

    /**
     * The meta object literal for the '<em><b>Hlfunction Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__HLFUNCTION_NAME = eINSTANCE.getMainTgf_HlfunctionName();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_TGF__RULES = eINSTANCE.getMainTgf_Rules();

    /**
     * The meta object literal for the '<em><b>Prof</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_TGF__PROF = eINSTANCE.getMainTgf_Prof();

    /**
     * The meta object literal for the '{@link com.spirit.ihe.iHE.impl.ProfileImpl <em>Profile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.ihe.iHE.impl.ProfileImpl
     * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getProfile()
     * @generated
     */
    EClass PROFILE = eINSTANCE.getProfile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__NAME = eINSTANCE.getProfile_Name();

    /**
     * The meta object literal for the '<em><b>Prof Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__PROF_NAME = eINSTANCE.getProfile_ProfName();

    /**
     * The meta object literal for the '<em><b>Descr Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__DESCR_NAME = eINSTANCE.getProfile_DescrName();

    /**
     * The meta object literal for the '<em><b>Feat Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__FEAT_NAME = eINSTANCE.getProfile_FeatName();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__FUNCTION_NAME = eINSTANCE.getProfile_FunctionName();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__ACTOR = eINSTANCE.getProfile_Actor();

    /**
     * The meta object literal for the '<em><b>Transaction</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__TRANSACTION = eINSTANCE.getProfile_Transaction();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__DOMAIN = eINSTANCE.getProfile_Domain();

    /**
     * The meta object literal for the '<em><b>Qualityattr</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROFILE__QUALITYATTR = eINSTANCE.getProfile_Qualityattr();

    /**
     * The meta object literal for the '<em><b>Secre</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROFILE__SECRE = eINSTANCE.getProfile_Secre();

    /**
     * The meta object literal for the '{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl <em>Sec Requirements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.spirit.ihe.iHE.impl.SecRequirementsImpl
     * @see com.spirit.ihe.iHE.impl.IHEPackageImpl#getSecRequirements()
     * @generated
     */
    EClass SEC_REQUIREMENTS = eINSTANCE.getSecRequirements();

    /**
     * The meta object literal for the '<em><b>Sec Re ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SEC_RE_ID = eINSTANCE.getSecRequirements_SecReID();

    /**
     * The meta object literal for the '<em><b>Secre Form</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SECRE_FORM = eINSTANCE.getSecRequirements_SecreForm();

    /**
     * The meta object literal for the '<em><b>Secre Sensitivity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SECRE_SENSITIVITY = eINSTANCE.getSecRequirements_SecreSensitivity();

    /**
     * The meta object literal for the '<em><b>Secre Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SECRE_LOCATION = eINSTANCE.getSecRequirements_SecreLocation();

    /**
     * The meta object literal for the '<em><b>Secre State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SECRE_STATE = eINSTANCE.getSecRequirements_SecreState();

    /**
     * The meta object literal for the '<em><b>Secre Goal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SECRE_GOAL = eINSTANCE.getSecRequirements_SecreGoal();

    /**
     * The meta object literal for the '<em><b>Secre Countermeasure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SECRE_COUNTERMEASURE = eINSTANCE.getSecRequirements_SecreCountermeasure();

    /**
     * The meta object literal for the '<em><b>Secre Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_REQUIREMENTS__SECRE_CATEGORY = eINSTANCE.getSecRequirements_SecreCategory();

  }

} //IHEPackage
