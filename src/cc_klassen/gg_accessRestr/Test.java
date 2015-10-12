package cc_klassen.gg_accessRestr;

import cc_klassen.gg_accessRestr.other_package.*;


class Test {
	public static void main  ( String[] args ) {
		Person meier = new Person( 30 ) ;
		Person schmitz = new Person( 40 ) ;

		meier.aMethod( schmitz ) ;
		
		System.out.println( " age of schmitz is: " + schmitz.getAge() ) ;
		
	}
}