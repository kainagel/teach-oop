package ffCollections.mm_StringBuilder;
class StringBuilderMain {

	public static void main ( String[] args ) 
	{
		System.out.println( " start " ) ;

		StringBuilder str = new StringBuilder();
		for ( int ii=1 ; ii<1000000; ii++ ) {
			str.append( "ab\n" );
		}
		System.out.println ( " str  : " + str ) ;

//		StringBuilder strb = new StringBuilder() ;
//		for ( int ii=1 ; ii<1000000 ; ii++ ) {
//			strb.append ( "ab\n").append( "cd" ) ;
//		}
//		System.out.println ( " strb: " + strb ) ;

	}

}
