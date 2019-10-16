package cc_klassen.kkStaticVsNonstaticVariables;

public class Printer {

	private static int printCnt = 0 ;

	private int timeInvoked = 0 ;

	void prettyPrint ( String str ) { 
		printCnt++ ;
		timeInvoked++ ;
		System.out.println( "printCnt=" + printCnt + "; timeInvoked=" + timeInvoked );
	}
	
}
