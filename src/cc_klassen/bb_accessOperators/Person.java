package cc_klassen.bb_accessOperators;

class Person {
	private long age ;
	private String name ;
	private boolean havingDrivingLicense ;
	private double income ;
	
	boolean job_available ;
	
//	Person() {
//		System.out.println("calling default ctor") ;
//	}
	
//	Person( String tmp ) {
//		System.out.println("calling 2nd ctor") ;
//		name = tmp ;
//	}
	
	void walk() {
		System.out.println( " calling the walk method yet again") ;
	}
	
	void aMethod(){
		if ( job_available ) {
			income = 30000 ;
		} else {
			income = 0 ;
		}
	}
	
	void addToAge( int tmp ) {
		age += tmp ;
	}
	
	long getAge() {
		return age ;
	}
	void setAge( long tmp ) {
		age = tmp ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHavingDrivingLicense() {
		return havingDrivingLicense;
	}

	public void setHavingDrivingLicense(boolean havingDrivingLicense) {
		this.havingDrivingLicense = havingDrivingLicense;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

}
