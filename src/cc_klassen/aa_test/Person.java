package cc_klassen.aa_test;

class Person {
	int age ;
	String lastName ;
	boolean havingDrivingLicense ;
	
	void incAge() {
		age = age + 1 ;
	}
	
	void printAllInformation() {
		System.out.println( " age: " + age + " lastName: " 
				+ lastName + " drivLic: " + havingDrivingLicense ) ;
	}

	
}
