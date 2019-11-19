package cc_klassen.yyCallbackPattern.usercode;

import cc_klassen.yyCallbackPattern.framework.Framework;

class Main{

	public static void main( String[] args ){

		Framework framework = new Framework() ;

		framework.add( new MyAgent("Nagel") ) ;
		framework.add( new MyAgent("Schmitz") ) ;

		framework.run() ;

	}

}
