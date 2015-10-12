package hh_generics.ee_subTypesWildCards;

import java.util.* ;

public class Test {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>() ;
		Person aPerson = new Person() ;
		persons.add ( aPerson ) ;
		Person bPerson = new Person() ;
		persons.add ( bPerson ) ;

		List<Child> children = new ArrayList<Child>() ;
		Child aChild = new Child() ;
		children.add ( aChild ) ;

		MyUtils.update ( persons ) ;
		MyUtils.update ( children ) ;

//		List<String> strings = new ArrayList<String>() ;
//		strings.add("meier") ;
//		strings.add("mueller") ;
//		MyUtils.update ( strings) ;

	}

}














