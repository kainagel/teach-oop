package hh_generics.ee_subTypesWildCards;

import java.util.* ;


class MyUtils {

//	public static <E> void update ( Collection<E> ii ) {
//		for ( E ee : ii ) {
//			ee.update() ;
//		}
//	}
//	// does not work

	public static <E extends Person> void update ( Collection<E> ii ) {
		for ( E ee : ii ) {
			ee.update() ;
		}
	}
	// works

//	public static void update ( Collection<Person> ii ) {
//		for ( Person ee : ii ) {
//			ee.update() ;
//		}
//	}
//	// does not work

//	public static void update ( Collection<? extends Person> ii ) {
//		for ( Person ee : ii ) {
//			ee.update() ;
//		}
//	}
//	// works


}