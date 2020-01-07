package ffCollections.mm_StringBuilder;
class StringBuilderMain {

	public static void main ( String[] args ) 
	{
		System.out.println( " start " ) ;

//		String str = "" ;
//		for ( int ii=1 ; ii<100000; ii++ ) {
//			str += "ab\n" ;
//		}
//		System.out.println ( " str  : " + str ) ;

		StringBuilder strb = new StringBuilder() ;
		for ( int ii=1 ; ii<100000 ; ii++ ) {
			strb.append ( "ab\n" ) ;
		}
		System.out.println ( " strb: " + strb ) ;

	}

}
