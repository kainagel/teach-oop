package cc_klassen.aa_test;

public class Main {
	public static void main( String[] args ) {
		Person schmitt = new Person() ;
		
		Param parameterObject = new Param(22, "Schmitt", true);
		schmitt.initializePerson(parameterObject ) ;
		
		schmitt.printAllInformation() ;
		
	}
}
