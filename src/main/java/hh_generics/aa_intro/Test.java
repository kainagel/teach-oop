package hh_generics.aa_intro;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>() ;
		for ( int ii=0 ; ii<5 ; ii++ ) {
			Person aPerson = new Person( Integer.toString( 10+ii ) ) ;
			persons.add( aPerson ) ;
		}

//		persons.add( new String("abc") );

//		Person result = (Person) persons.get( 3 );

//		for( Object person : persons ){
//			System.out.println( "name=" + person.getName() );
//		}


	}


}
