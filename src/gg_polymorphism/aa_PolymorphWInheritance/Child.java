package gg_polymorphism.aa_PolymorphWInheritance;
final class Child extends Person {
	
	private String school ;

	void setSchool( String school ) {
		this.school = school ;
	}
	
	final String getSchool() { 
		return this.school ; 
	}
	
}

