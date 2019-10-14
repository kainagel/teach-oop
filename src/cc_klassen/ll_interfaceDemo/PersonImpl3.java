package cc_klassen.ll_interfaceDemo;

final class PersonImpl3 implements PersonI {

	private final int age;
	
	PersonImpl3( int age ) {
		this.age = age ;
	}

	@Override
	public int getAge() {
		return this.age ;
	}

}
