package cc_klassen.gg_accessRestr;

import cc_klassen.gg_accessRestr.other_package.*;

class Test {
	public static void main  ( String[] args ) {
		PersonRecord meier = new PersonRecord( 30 ) ;
		PersonRecord schmitz = new PersonRecord( 40 ) ;
		
		meier.aMethod( schmitz ) ;
		
		System.out.println( " age of schmitz is: " + schmitz.getAge() ) ;
		
	}
}