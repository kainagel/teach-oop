package cc_klassen.bb_accessOperators;

class PersonTest {

	public static void main(String[] args) {
		Person meier, mueller ;
		
		meier = new Person() ;
//		mueller = new Person("mueller");
//		mueller.setAge(35) ;
		
		meier.walk() ;
		
		meier.setAge(13) ;
		
		System.out.println( "meier's age is: " + meier.getAge() ) ;
		
		meier.addToAge(12) ;

		System.out.println( "meier's age is: " + meier.getAge() ) ;
		
		meier.job_available = true ;
		meier.aMethod() ;
		
	}

}
