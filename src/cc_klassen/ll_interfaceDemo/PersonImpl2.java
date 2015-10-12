package cc_klassen.ll_interfaceDemo;

public class PersonImpl2 implements PersonI, MobileI {
	
	private double age ;

	public PersonImpl2(int i) {
		this.age = i ;
	}

	public int getAge() {
		return (int) age ;
	}

	@Override
	public void move() {
		System.exit(-1);
	}

}
