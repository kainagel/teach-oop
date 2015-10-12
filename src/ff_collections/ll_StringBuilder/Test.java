package ff_collections.ll_StringBuilder;
class Test {

	public static void main ( String[] args ) 
	{
		System.out.println( " start " ) ;
		final int len = 300000 ;

//		String str = "" ;
//		for ( int ii=1 ; ii<len; ii++ ) {
//			str += "ab" ;
//		}
//		System.out.println ( " str  : " + str ) ;

		StringBuilder strb = new StringBuilder() ;
		for ( int ii=1 ; ii<len ; ii++ ) {
			strb.append ( "ab" ) ;
		}
		System.out.println ( " strb: " + strb ) ;

	}

}
