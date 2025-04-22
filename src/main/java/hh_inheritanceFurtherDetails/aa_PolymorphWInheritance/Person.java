package hh_inheritanceFurtherDetails.aa_PolymorphWInheritance;

class Person extends Object {
	
	private int age ;
//	Person( int age ) {
//		this.age = age;
//	}

	void setAge(int age) {
		this.age = age;
	}
	
	int getAgeAsInt() {
		System.out.println( "calling PERSON getAge() method" );
		return age ; 
	}
	
//	@Override
//	public String toString() {
//		return " age=" + age ;
//	}
	
//	void aMethod() {
//		System.out.println("Calling aMethod in Person");
//	}
//	
//	Person( int age ){
//		this.age = age ;
//	}
//	
//	public Person() {
//	}
	
//	@Override
//	public String toString() {
//		return "age=" + this.age;
//	}

}

