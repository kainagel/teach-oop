package cc_klassen.ll_interfaceDemo;

public class PersonImpl4 implements PersonI {
	private double age ;
	
	public int getAge() {
		System.out.println( "calling getAge of impl4");

		return (int) age ;
	}

}
