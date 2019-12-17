package cc_klassen.ll_interfaceDemo;

public class PersonImpl2 implements Person{
	
	private double age ;

	public PersonImpl2(int i) {
		this.age = i ;
	}

	@Override
	public int getAge() {
		return (int) age ;
	}

}
