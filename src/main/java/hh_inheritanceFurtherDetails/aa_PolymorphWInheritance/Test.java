package hh_inheritanceFurtherDetails.aa_PolymorphWInheritance;

class Test {
	public static void main  ( String[] args ) {

		Person person = new Person();

		System.out.println( person.toString() );

//		List<Person> persons = new ArrayList<>();
//
//		{
//			Person person = new Person();
//			person.setAge( 22 );
//			persons.add( person );
//		}
//		{
//			Child child = new Child();
//			child.setAge( 7 );
//			child.setSchool( "Grundschule der Dreckspatzen" );
//			persons.add( child );
//		}
//		{
//			Adult adult = new Adult();
//			adult.setAge( 35 );
//			adult.setEmployer( "TU Berlin" );
//			persons.add( adult );
//		}
//
//		for( Person person : persons ){
//			System.out.println( person.getAgeAsInt() );
//		}



//		System.out.println( "person.getAge:" + person.getAAge() );
//		System.out.println( "child.getAge:" + child.getAAge() );
//		System.out.println( "adult.getAge:" + adult.getAAge() );

//		System.out.println( "adult.toString():" + adult.toString() ) ;
		
//		System.out.println( "age=" + adult.getAge() + "; employer=" + adult.getEmployer() );
//		System.out.println( "age=" + child.getAge() + "; school=" + child.getSchool() );
////		System.out.println( adult.getAgeInMonth() );
		
//		// folgendes geht nicht:
//		System.out.println("Mutter ging frueher zur " + adult.getSchool() );
//		System.out.println("Tochter will spaeter zu " + child.getEmployer() );
		
//		adult.aMethod();
		
//		System.out.println( adult.toString() );
	}
}
