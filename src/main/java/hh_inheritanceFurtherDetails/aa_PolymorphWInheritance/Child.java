package hh_inheritanceFurtherDetails.aa_PolymorphWInheritance;
final class Child extends Person {
	
	private String school ;

	Child( int age, String school ) {
		this.school = school;
		this.setAge( age );
	}

	void setSchool( String school ) {
		this.school = school ;
	}
	
	final String getSchool() { 
		return this.school ; 
	}
	
}

