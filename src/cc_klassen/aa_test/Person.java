package cc_klassen.aa_test;

class Person {
	private int age ;
	private String lastName ;
	private boolean havingDrivingLicense ;
	
	void initializePerson( Param parameterObject) {
		this.age = parameterObject.getAge() ;
		this.lastName = parameterObject.getLastName() ;
		this.havingDrivingLicense = parameterObject.isHasDrivingLic() ;
	}
	
	void incAge() {
		age = age + 1 ;
	}
	
	void printAllInformation() {
		System.out.println( " age: " + age + " lastName: " 
				+ lastName + " drivLic: " + havingDrivingLicense ) ;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int tmp) {
		this.age = tmp;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isHavingDrivingLicense() {
		return havingDrivingLicense;
	}

	public void setHavingDrivingLicense(boolean havingDrivingLicense) {
		this.havingDrivingLicense = havingDrivingLicense;
	}
	
}
