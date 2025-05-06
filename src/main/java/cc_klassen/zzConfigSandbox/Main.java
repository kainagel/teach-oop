package cc_klassen.zzConfigSandbox;

class Main{

	public static void main( String[] args ){

		// create the config:
		Config config = new Config();

		printStuff( config );

		// modify the config:
		config.controller().setLastIteration(1 );

		config.network().setFileName( "scenario/equil/network.xml.gz" );

		printStuff( config );

		// continue with scenario:
		//...
	}
	private static void printStuff( Config config ){
		final ControlerConfig controllerConfig = config.controller();
		System.out.println( "the last iteration is now set to: " + controllerConfig.getLastIteration() );
		System.out.println("the network file name is now set to: " + config.network().getFile() );
	}

}
