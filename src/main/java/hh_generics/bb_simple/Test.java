package hh_generics.bb_simple;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		List<Child> persons = new ArrayList<Child>() ;
		
//		Person mueller = new Person("Mueller") ;
//		persons.add(mueller) ;
		
		Child christiane = new Child("Christiane") ;
		christiane.setSchool("ABC-Schule") ;
		persons.add(christiane) ;

		Child emil = new Child("Emil") ;
		persons.add(emil) ;
		emil.setSchool("ABC-Schule") ;

//		for ( int ii=1 ; ii<10 ; ii++ ) {
//			String name = "Schmidt" + Integer.toString(ii) ;
//			Person aPerson = new Person( name ) ;
//			persons.add( aPerson) ;
//		}
		
		for ( Person pp : persons ) {
			System.out.println( " pp: " + pp.toString() ) ;
		}

//		String str = "Meier" ;
//		persons.add ( str ) ;
		
//		for ( Child cc : persons ) {
//			System.out.println(" cc: " + cc.toString() ) ;
//		}

//		{
//			Person person = (Person) persons.get(5) ;
//			System.out.println ( person.toString() ) ;
//		}

//		persons.add(new String("Musterfrau")) ;
//		for ( Iterator it = persons.iterator() ; it.hasNext() ; ) {
//			Person person = (Person) it.next() ;
//			System.out.println ( person.toString() ) ;
//		}

//		for ( Iterator it = persons.iterator() ; it.hasNext() ; ) {
//			Child child = (Child) it.next() ;
//			System.out.println ( child.toString() ) ;
//		}

//		for ( Object oo : persons ) {
//			Person pp = (Person) oo ;
//			System.out.println ( pp.toString() ) ;
//		}

	}

}














