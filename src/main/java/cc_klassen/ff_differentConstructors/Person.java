package cc_klassen.ff_differentConstructors;

class Person {
	private int age ;
	private final String lastName;
	private boolean havingDrivingLicense ;

	Person( String lastName ) {
		this.lastName = lastName;
	}

	void incAge() {
		setAge(getAge() + 1) ;
	}
	
	void printAllInformation() {
		System.out.println( " age: " + getAge() + " lastName: " + lastName + " drivLic: " + havingDrivingLicense ) ;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getLastName() {
		return lastName;
	}

//	void setLastName(String lastName) {
//		this.lastName = lastName;
//	}

	boolean isHavingDrivingLicense() {
		return havingDrivingLicense;
	}

	void setHavingDrivingLicense(boolean havingDrivingLicense) {
		this.havingDrivingLicense = havingDrivingLicense;
	}

	
}
