/*
 * generated by Xtext 2.15.0
 */
package pucrs.lp.scheme


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SchemeStandaloneSetup extends SchemeStandaloneSetupGenerated {

	def static void doSetup() {
		new SchemeStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
