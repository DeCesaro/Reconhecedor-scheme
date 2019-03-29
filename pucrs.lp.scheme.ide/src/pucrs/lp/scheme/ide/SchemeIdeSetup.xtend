/*
 * generated by Xtext 2.15.0
 */
package pucrs.lp.scheme.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import pucrs.lp.scheme.SchemeRuntimeModule
import pucrs.lp.scheme.SchemeStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SchemeIdeSetup extends SchemeStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SchemeRuntimeModule, new SchemeIdeModule))
	}
	
}
