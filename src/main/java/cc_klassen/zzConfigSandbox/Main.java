package cc_klassen.zzConfigSandbox;

class Main{

	public static void main( String[] args ){

		// create the config:
		Config config = new Config();

		// modify the config:
		config.controller().setLastIteration(1 );

		config.network().setFile( "scenario/equil/network.xml.gz" );

		// continue with scenario:
		//...
	}

}
