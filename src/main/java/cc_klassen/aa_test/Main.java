package cc_klassen.aa_test;

public class Main {
	public static void main( String[] args ) {

		double age = 20.;

		// ---

		Person nagel = new Person() ;
		nagel.age = 22 ;
		nagel.height=190. ;
		nagel.lastName = "Nagel" ;

		Person schmitz = new Person() ;
		schmitz.age=62 ;
		schmitz.height=33 ;
		schmitz.lastName="Schulze" ;

		nagel.printYourself();
		schmitz.printYourself();


	}
}
