package cc_klassen.ll_interfaceDemo;

public class PersonImpl3 implements PersonI {

	private int age;

	public int getAge() {
		System.out.println( "calling getAge of impl3");
		return age ;
	}
}
