package cc_klassen.ll_interfaceDemo;
class Test {
	public static void main  ( String[] args ) {
		
		PersonI father =  new PersonImpl4();
		
		System.out.println("here10") ;
		
		System.out.println( " age: " + father.getAge() ) ;
		
		System.out.println("here20") ;
	}
}