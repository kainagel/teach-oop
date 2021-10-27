package cc_klassen.ff_differentConstructors;

public class Main {
	public static void main( String[] args ) {

		Person schmitt = new Person("Schmitt") ;

//		Person schmitt = new Person( 21 ) ;

		schmitt.setAge( 21 );
		schmitt.setHavingDrivingLicense( true );

		System.out.println( "age=" + schmitt.getAge() );
		
//		schmitt.setAge(21) ;
//		schmitt.setLastName("Schmitt") ;
//		schmitt.setHavingDrivingLicense(true) ;
		
		schmitt.printAllInformation() ;
		
		schmitt.incAge();
		
		schmitt.printAllInformation() ;

	}
}
