package hh_generics.dd_genericMethod;
import java.util.List;

class MyUtils {

//	public static <E> void myAdd ( List<E> ll , E el ) {
//		ll.add(el) ;
//		System.out.println ( "\nPrinting the List: " ) ;
//		for ( E ee : ll ) {
//			System.out.println ( ee ) ;
//		}
//	}

	public static void myAdd ( List<String> ll , String el ) {
		ll.add(el) ;
		System.out.println ( "\nPrinting the List: " ) ;
		for ( Object ee : ll ) {
			System.out.println ( ee ) ;
		}
	}

}