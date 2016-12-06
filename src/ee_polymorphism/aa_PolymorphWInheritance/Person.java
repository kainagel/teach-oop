package ee_polymorphism.aa_PolymorphWInheritance;

class Person {

	private int age ;
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		System.out.println( "calling PERSON getAge() method" );
		return age ; 
	}
	
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

