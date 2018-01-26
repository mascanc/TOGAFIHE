/**
 * generated by Xtext 2.12.0
 */
package com.spirit.xtext.architecture.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.spirit.xtext.architecture.TgfiRuntimeModule;
import com.spirit.xtext.architecture.TgfiStandaloneSetup;
import com.spirit.xtext.architecture.ide.TgfiIdeModule;
import com.spirit.xtext.architecture.web.TgfiWebModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class TgfiWebSetup extends TgfiStandaloneSetup {
  @Override
  public Injector createInjector() {
    TgfiRuntimeModule _tgfiRuntimeModule = new TgfiRuntimeModule();
    TgfiIdeModule _tgfiIdeModule = new TgfiIdeModule();
    TgfiWebModule _tgfiWebModule = new TgfiWebModule();
    return Guice.createInjector(Modules2.mixin(_tgfiRuntimeModule, _tgfiIdeModule, _tgfiWebModule));
  }
}