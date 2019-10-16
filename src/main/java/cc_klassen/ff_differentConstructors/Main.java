package cc_klassen.ff_differentConstructors;

public class Main {
	public static void main( String[] args ) {
		Person schmitt = new Person() ;
		
		schmitt.setAge(21) ;
		schmitt.setLastName("Schmitt") ;
		schmitt.setHavingDrivingLicense(true) ;
		
		schmitt.printAllInformation() ;
		
		schmitt.incAge();
		
		schmitt.printAllInformation() ;

	}
}
