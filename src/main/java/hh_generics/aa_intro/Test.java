package hh_generics.aa_intro;

import java.util.*;

public class Test {

	public static void main(String[] args) {
	     List<Person> persons = new ArrayList<>() ;
	     for ( int ii=0 ; ii<5 ; ii++ ) {
	         Person aPerson = new Person( 10+Integer.toString(ii) ) ;
	         persons.add( aPerson ) ;
	     }
	     
//	     Person pp = persons.get(5) ; // (#)
//	     System.out.println( "name: " + pp.getName() );

		for ( Person qq : persons ) { // (##)
	    	 	System.out.println( "name: " + qq.getName() );
//	    	 	if ( qq instanceof Runnable ) {
	    	 		Runnable rr = ( Runnable ) qq ;
	    	 		rr.run() ;
//	    	 	} 	     
	    	 		}


	}

}
