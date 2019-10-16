package cc_klassen.ii_callByValueVsReference;
class ComplexNumber {
	double real ;
	double imag ;
}
class Test {
//	static void add( double aa, double bb ) {
//		System.out.println( " aa: " + aa ) ;
//		aa += bb ;
//		System.out.println( " aa: " + aa ) ;
//	}
	
	static void add( ComplexNumber aa, ComplexNumber bb ) {
		System.out.println( " aa.real: " + aa.real ) ;
		aa.real += bb.real ;
		aa.imag += bb.imag ;
		System.out.println( " aa.real: " + aa.real ) ;
	}
	
	static void exchange ( ComplexNumber aa, ComplexNumber bb ) {
		ComplexNumber tmp = aa ;
		aa = bb ;
		bb = tmp ;
	}
	
	public static void main  ( String[] args ) {
//		double cc = 5. ;
//		double dd = 6. ;

//		add( cc, dd ) ;
//		System.out.println( " cc: " + cc ) ;
		
		ComplexNumber ccc = new ComplexNumber() ;
		ccc.real = 5. ; ccc.imag=-1 ;
		
		ComplexNumber ddd = new ComplexNumber() ;
		ddd.real = 6. ; ddd.imag = +100 ;
		
		add( ccc, ddd ) ;
		System.out.println ( " ccc.real: " + ccc.real ) ;
		
	}
}