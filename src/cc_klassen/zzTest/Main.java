package cc_klassen.zzTest;

class Main {

	public static void main(String[] args) {

		Person meier = new Person() ;
		Person mueller = new Person() ;
		
		meier.setAge(10.5) ;
		mueller.setAge( 14.5 );
		
		meier.walk();
		
		System.out.println( " meier.age: " + meier.getAge() );
		System.out.println( " mueller.age: " + mueller.getAge() );
		
	}

}
