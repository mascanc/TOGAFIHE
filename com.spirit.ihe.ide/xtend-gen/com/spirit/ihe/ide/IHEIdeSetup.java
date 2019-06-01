/**
 * generated by Xtext 2.17.0
 */
package com.spirit.ihe.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.spirit.ihe.IHERuntimeModule;
import com.spirit.ihe.IHEStandaloneSetup;
import com.spirit.ihe.ide.IHEIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class IHEIdeSetup extends IHEStandaloneSetup {
  @Override
  public Injector createInjector() {
    IHERuntimeModule _iHERuntimeModule = new IHERuntimeModule();
    IHEIdeModule _iHEIdeModule = new IHEIdeModule();
    return Guice.createInjector(Modules2.mixin(_iHERuntimeModule, _iHEIdeModule));
  }
}
