package hh_inheritanceFurtherDetails.aa_PolymorphWInheritance;

class Adult extends Person {
	
	private String employer ;

	Adult( int age, String employer ) {
		this.employer = employer;
	}
	
	@Override
	public String toString() {
		return super.toString() + " employer=" + employer ;
	}

	void setEmployer( String employer ) { 
		this.employer = employer ;
	}
	
	String getEmployer() { 
		return this.employer ; 
	}
	
//	int getAgeInMonth() {
//		return 12 * age; // does not compile if age is private
//		return 12 * getAge();
//	}
	
	@Override int getAgeAsInt() {
		System.out.println( "calling ADULT getAge() method" );
		return 0;
	}
	
//	@Override
//	void aMethod() {
//		System.out.println("Calling aMethod in Adult");
//		this.aMethod();
//	}
	
//	Adult( int age, String emp ) {
//		super(age);
//		this.employer = emp ;
//	}
//	
//	Adult( int age ) {
//		this( age, null ) ;
//	}
//	
//	Adult(){
//		super();
//	}
	
//	@Override
//	public String toString() {
//		return super.toString() + " employer=" + employer;
//	}
	
}

