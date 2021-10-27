package cc_klassen.gg_accessRestr.other_package;
public class Person {
	int age ;

	public int getAge() { return age ; }

	/* package private */
	public Person( int tmp ) {
		age = tmp ;
		System.out.println( " getAge: " + getAge() ) ;
	}

	public void aMethod( Person otherPerson ) {
		otherPerson.age = -20 ;
	}

}
