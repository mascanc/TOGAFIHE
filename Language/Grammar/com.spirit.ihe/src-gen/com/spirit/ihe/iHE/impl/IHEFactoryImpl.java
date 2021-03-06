/**
 * generated by Xtext 2.17.1
 */
package com.spirit.ihe.iHE.impl;

import com.spirit.ihe.iHE.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IHEFactoryImpl extends EFactoryImpl implements IHEFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IHEFactory init()
  {
    try
    {
      IHEFactory theIHEFactory = (IHEFactory)EPackage.Registry.INSTANCE.getEFactory(IHEPackage.eNS_URI);
      if (theIHEFactory != null)
      {
        return theIHEFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IHEFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IHEFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IHEPackage.IHE: return createIHE();
      case IHEPackage.IMPORT: return createImport();
      case IHEPackage.MAIN_TGF: return createMainTgf();
      case IHEPackage.PROFILE: return createProfile();
      case IHEPackage.SEC_REQUIREMENTS: return createSecRequirements();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IHE createIHE()
  {
    IHEImpl ihe = new IHEImpl();
    return ihe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainTgf createMainTgf()
  {
    MainTgfImpl mainTgf = new MainTgfImpl();
    return mainTgf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Profile createProfile()
  {
    ProfileImpl profile = new ProfileImpl();
    return profile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SecRequirements createSecRequirements()
  {
    SecRequirementsImpl secRequirements = new SecRequirementsImpl();
    return secRequirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IHEPackage getIHEPackage()
  {
    return (IHEPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IHEPackage getPackage()
  {
    return IHEPackage.eINSTANCE;
  }

} //IHEFactoryImpl
