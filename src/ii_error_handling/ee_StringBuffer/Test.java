package ii_error_handling.ee_StringBuffer;
class Test {

    public static void main ( String[] args ) 
    {

	String str = "" ;
	for ( int ii=1 ; ii<100000; ii++ ) {
	    str += "ab" ;
	}
	System.out.println ( " str: " + str ) ;

// 	StringBuffer strb = new StringBuffer() ;
// 	for ( int ii=1 ; ii<100000 ; ii++ ) {
// 	    strb.append ( "ab" ) ;
// 	}
// 	System.out.println ( " strb: " + strb ) ;

    }

}
