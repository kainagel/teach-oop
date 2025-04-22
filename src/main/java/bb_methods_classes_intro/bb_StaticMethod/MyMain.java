package bb_methods_classes_intro.bb_StaticMethod;

class MyMain{
	public static void main  ( String[] args ) {

		double aa = 45 ; int bb = 30 ;

//		double cc1 = Math.max( aa, bb );
		final double cc1 = MyMath.myMax( aa, bb );

		final int cc2 = MyMath.myMax( 0, 2 );

		System.out.println( " cc: " + cc1 ) ;

	}

}
