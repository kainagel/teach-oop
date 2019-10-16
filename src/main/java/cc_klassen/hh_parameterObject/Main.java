package cc_klassen.hh_parameterObject;

public class Main {
	
	public static void main ( String [] args ) {
		long ll = 3 ;
		double dd = 5. ;
		MyObject obj = new MyObject( "abc" ) ;
		aMethod( ll,dd,obj ) ;
		System.out.println( ll ) ;
		System.out.println( dd ) ;
		System.out.println( obj.getStr()  ) ;
	}
	
	private static void aMethod( long ii, double dd, MyObject obj ) {
		System.out.println( ii+dd );
		obj.setStr("def");	
	}

	static class MyObject {
		private String str ;
		MyObject( String val ) {
			str = val ;
		}
		String getStr() {
			return str ;
		}
		void setStr( String val ) {
			str = val ;
		}
	
	}

}
