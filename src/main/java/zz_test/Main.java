package zz_test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>() ; 
		list . add ( "A" ) ;		
		list . add ( "B" ) ;
		list . add ( "C" ) ; 
		list.set(2, "d"); 
		list.add(2, "E");
		list . add ( "f" ) ;
		System . out . println ( list ) ;

	}

}
