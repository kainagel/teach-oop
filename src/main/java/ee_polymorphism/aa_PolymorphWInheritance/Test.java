package ee_polymorphism.aa_PolymorphWInheritance;

class Test {
	public static void main  ( String[] args ) {
		
		Person person = new Person() ;
		person.setAge(22);
		
		Child child = new Child();
		child.setAge(7);
		child.setSchool("Grundschule der Dreckspatzen");
		
		Adult adult = new Adult();
		adult.setAge(35);
		adult.setEmployer("TU Berlin");

		System.out.println( "person.getAge:" + person.getAAge() );
		System.out.println( "child.getAge:" + child.getAAge() );
		System.out.println( "adult.getAge:" + adult.getAAge() );

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
