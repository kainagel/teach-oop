package hh_inheritanceFurtherDetails.zz_Upcast;

class Test {

	public void run ( BasicClass bclass ) {
		ExtendedClass eclass = (ExtendedClass) bclass ;
		eclass.name = "abc" ;
	}

	public static void main( String[] args ) 
	{

		BasicClass bclass = new ExtendedClass() ;

		Test test = new Test() ;
		test.run ( bclass ) ;
	}

}
