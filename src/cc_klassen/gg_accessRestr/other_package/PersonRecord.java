package cc_klassen.gg_accessRestr.other_package;
public class PersonRecord {
	private int age ;

	public int getAge() { return age ; }

	public PersonRecord( int tmp ) {
		age = tmp ;
		System.out.println( " getAge: " + getAge() ) ;
	}

	public void aMethod( PersonRecord otherPerson ) {
		otherPerson.age = -20 ;
	}

}