package cc_klassen.aa_test;

public class Main {
	public static void main( String[] args ) {
		Person schmitt = new Person() ;
		
		schmitt.age = 21 ;
		schmitt.lastName = "Schmitt" ;
		schmitt.havingDrivingLicense = true ;
		
		schmitt.printAllInformation() ;
		
		schmitt.incAge();
		
		schmitt.printAllInformation() ;

	}
}
