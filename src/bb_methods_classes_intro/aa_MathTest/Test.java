package bb_methods_classes_intro.aa_MathTest;

//import static java.lang.Math.* ;
class Test {
	public static void main  ( String[] args ) {
		double aa=0.3 ;
		double bb = Math.sin(aa)*Math.sin(aa) + Math.cos(1.-aa)*Math.cos(1.-aa) ;

		System.out.println ( " bb: " + bb ) ;

	}
}