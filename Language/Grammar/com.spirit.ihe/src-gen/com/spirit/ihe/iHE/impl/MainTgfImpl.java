/**
 * generated by Xtext 2.17.1
 */
package com.spirit.ihe.iHE.impl;

import com.spirit.ihe.iHE.IHEPackage;
import com.spirit.ihe.iHE.MainTgf;
import com.spirit.ihe.iHE.Profile;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Tgf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getSatName <em>Sat Name</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getStatusName <em>Status Name</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getObjectiveName <em>Objective Name</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getHlfunctionName <em>Hlfunction Name</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.MainTgfImpl#getProf <em>Prof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainTgfImpl extends MinimalEObjectImpl.Container implements MainTgf
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getGenPackage() <em>Gen Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenPackage()
   * @generated
   * @ordered
   */
  protected static final String GEN_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenPackage() <em>Gen Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenPackage()
   * @generated
   * @ordered
   */
  protected String genPackage = GEN_PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getSatName() <em>Sat Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatName()
   * @generated
   * @ordered
   */
  protected static final String SAT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSatName() <em>Sat Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatName()
   * @generated
   * @ordered
   */
  protected String satName = SAT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionName()
   * @generated
   * @ordered
   */
  protected static final String VERSION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionName()
   * @generated
   * @ordered
   */
  protected String versionName = VERSION_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getStatusName() <em>Status Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatusName()
   * @generated
   * @ordered
   */
  protected static final String STATUS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatusName() <em>Status Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatusName()
   * @generated
   * @ordered
   */
  protected String statusName = STATUS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getObjectiveName() <em>Objective Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectiveName()
   * @generated
   * @ordered
   */
  protected static final String OBJECTIVE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectiveName() <em>Objective Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectiveName()
   * @generated
   * @ordered
   */
  protected String objectiveName = OBJECTIVE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHlfunctionName() <em>Hlfunction Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHlfunctionName()
   * @generated
   * @ordered
   */
  protected static final String HLFUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHlfunctionName() <em>Hlfunction Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHlfunctionName()
   * @generated
   * @ordered
   */
  protected String hlfunctionName = HLFUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<String> rules;

  /**
   * The cached value of the '{@link #getProf() <em>Prof</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProf()
   * @generated
   * @ordered
   */
  protected EList<Profile> prof;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainTgfImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IHEPackage.Literals.MAIN_TGF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.MAIN_TGF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGenPackage()
  {
    return genPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGenPackage(String newGenPackage)
  {
    String oldGenPackage = genPackage;
    genPackage = newGenPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.MAIN_TGF__GEN_PACKAGE, oldGenPackage, genPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSatName()
  {
    return satName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSatName(String newSatName)
  {
    String oldSatName = satName;
    satName = newSatName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.MAIN_TGF__SAT_NAME, oldSatName, satName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersionName()
  {
    return versionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersionName(String newVersionName)
  {
    String oldVersionName = versionName;
    versionName = newVersionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.MAIN_TGF__VERSION_NAME, oldVersionName, versionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStatusName()
  {
    return statusName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStatusName(String newStatusName)
  {
    String oldStatusName = statusName;
    statusName = newStatusName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.MAIN_TGF__STATUS_NAME, oldStatusName, statusName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObjectiveName()
  {
    return objectiveName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjectiveName(String newObjectiveName)
  {
    String oldObjectiveName = objectiveName;
    objectiveName = newObjectiveName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.MAIN_TGF__OBJECTIVE_NAME, oldObjectiveName, objectiveName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHlfunctionName()
  {
    return hlfunctionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHlfunctionName(String newHlfunctionName)
  {
    String oldHlfunctionName = hlfunctionName;
    hlfunctionName = newHlfunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.MAIN_TGF__HLFUNCTION_NAME, oldHlfunctionName, hlfunctionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getRules()
  {
    if (rules == null)
    {
      rules = new EDataTypeEList<String>(String.class, this, IHEPackage.MAIN_TGF__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Profile> getProf()
  {
    if (prof == null)
    {
      prof = new EObjectContainmentEList<Profile>(Profile.class, this, IHEPackage.MAIN_TGF__PROF);
    }
    return prof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IHEPackage.MAIN_TGF__PROF:
        return ((InternalEList<?>)getProf()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IHEPackage.MAIN_TGF__NAME:
        return getName();
      case IHEPackage.MAIN_TGF__GEN_PACKAGE:
        return getGenPackage();
      case IHEPackage.MAIN_TGF__SAT_NAME:
        return getSatName();
      case IHEPackage.MAIN_TGF__VERSION_NAME:
        return getVersionName();
      case IHEPackage.MAIN_TGF__STATUS_NAME:
        return getStatusName();
      case IHEPackage.MAIN_TGF__OBJECTIVE_NAME:
        return getObjectiveName();
      case IHEPackage.MAIN_TGF__HLFUNCTION_NAME:
        return getHlfunctionName();
      case IHEPackage.MAIN_TGF__RULES:
        return getRules();
      case IHEPackage.MAIN_TGF__PROF:
        return getProf();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IHEPackage.MAIN_TGF__NAME:
        setName((String)newValue);
        return;
      case IHEPackage.MAIN_TGF__GEN_PACKAGE:
        setGenPackage((String)newValue);
        return;
      case IHEPackage.MAIN_TGF__SAT_NAME:
        setSatName((String)newValue);
        return;
      case IHEPackage.MAIN_TGF__VERSION_NAME:
        setVersionName((String)newValue);
        return;
      case IHEPackage.MAIN_TGF__STATUS_NAME:
        setStatusName((String)newValue);
        return;
      case IHEPackage.MAIN_TGF__OBJECTIVE_NAME:
        setObjectiveName((String)newValue);
        return;
      case IHEPackage.MAIN_TGF__HLFUNCTION_NAME:
        setHlfunctionName((String)newValue);
        return;
      case IHEPackage.MAIN_TGF__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends String>)newValue);
        return;
      case IHEPackage.MAIN_TGF__PROF:
        getProf().clear();
        getProf().addAll((Collection<? extends Profile>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IHEPackage.MAIN_TGF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IHEPackage.MAIN_TGF__GEN_PACKAGE:
        setGenPackage(GEN_PACKAGE_EDEFAULT);
        return;
      case IHEPackage.MAIN_TGF__SAT_NAME:
        setSatName(SAT_NAME_EDEFAULT);
        return;
      case IHEPackage.MAIN_TGF__VERSION_NAME:
        setVersionName(VERSION_NAME_EDEFAULT);
        return;
      case IHEPackage.MAIN_TGF__STATUS_NAME:
        setStatusName(STATUS_NAME_EDEFAULT);
        return;
      case IHEPackage.MAIN_TGF__OBJECTIVE_NAME:
        setObjectiveName(OBJECTIVE_NAME_EDEFAULT);
        return;
      case IHEPackage.MAIN_TGF__HLFUNCTION_NAME:
        setHlfunctionName(HLFUNCTION_NAME_EDEFAULT);
        return;
      case IHEPackage.MAIN_TGF__RULES:
        getRules().clear();
        return;
      case IHEPackage.MAIN_TGF__PROF:
        getProf().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IHEPackage.MAIN_TGF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IHEPackage.MAIN_TGF__GEN_PACKAGE:
        return GEN_PACKAGE_EDEFAULT == null ? genPackage != null : !GEN_PACKAGE_EDEFAULT.equals(genPackage);
      case IHEPackage.MAIN_TGF__SAT_NAME:
        return SAT_NAME_EDEFAULT == null ? satName != null : !SAT_NAME_EDEFAULT.equals(satName);
      case IHEPackage.MAIN_TGF__VERSION_NAME:
        return VERSION_NAME_EDEFAULT == null ? versionName != null : !VERSION_NAME_EDEFAULT.equals(versionName);
      case IHEPackage.MAIN_TGF__STATUS_NAME:
        return STATUS_NAME_EDEFAULT == null ? statusName != null : !STATUS_NAME_EDEFAULT.equals(statusName);
      case IHEPackage.MAIN_TGF__OBJECTIVE_NAME:
        return OBJECTIVE_NAME_EDEFAULT == null ? objectiveName != null : !OBJECTIVE_NAME_EDEFAULT.equals(objectiveName);
      case IHEPackage.MAIN_TGF__HLFUNCTION_NAME:
        return HLFUNCTION_NAME_EDEFAULT == null ? hlfunctionName != null : !HLFUNCTION_NAME_EDEFAULT.equals(hlfunctionName);
      case IHEPackage.MAIN_TGF__RULES:
        return rules != null && !rules.isEmpty();
      case IHEPackage.MAIN_TGF__PROF:
        return prof != null && !prof.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", genPackage: ");
    result.append(genPackage);
    result.append(", satName: ");
    result.append(satName);
    result.append(", versionName: ");
    result.append(versionName);
    result.append(", statusName: ");
    result.append(statusName);
    result.append(", objectiveName: ");
    result.append(objectiveName);
    result.append(", hlfunctionName: ");
    result.append(hlfunctionName);
    result.append(", rules: ");
    result.append(rules);
    result.append(')');
    return result.toString();
  }

} //MainTgfImpl
