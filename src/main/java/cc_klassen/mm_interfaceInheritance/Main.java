package cc_klassen.mm_interfaceInheritance;

import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		List<PersonI> persons = new ArrayList<>();

		{
			PersonImpl1 p1 = new PersonImpl1();
			p1.setLastName( "Nagel");
			persons.add( p1 );
		}
		{
			PersonImpl2 p2 = new PersonImpl2( 12);
			persons.add( p2 );
		}
		{
			PersonImpl1 p2 = new PersonImpl1( );
			p2.setLastName( "Gao" );
			persons.add( p2 );
		}

		for( PersonI person : persons ){
			System.out.println( "personName=" + person.getLastName() ) ;
		}

	}

}
