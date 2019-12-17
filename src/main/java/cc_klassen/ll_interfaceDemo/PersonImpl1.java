package cc_klassen.ll_interfaceDemo;

public class PersonImpl1 implements Person{
	
	private int age ;
	
	PersonImpl1( int tmpAge ) {
		age = tmpAge ;
	}

	@Override
	public int getAge() {
		return age;
	}
	
}
