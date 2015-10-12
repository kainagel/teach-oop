package cc_klassen.ll_interfaceDemo;

public class PersonImpl1 implements MobilePersonI {
	
	private int age ;
	
	PersonImpl1( int tmpAge ) {
		age = tmpAge ;
	}

	public int getAge() {
		return age;
	}
	
	public void move() {
		System.out.println("not implemented") ;
	}

}
