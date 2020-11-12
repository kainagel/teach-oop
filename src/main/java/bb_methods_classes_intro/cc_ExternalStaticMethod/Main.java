package bb_methods_classes_intro.cc_ExternalStaticMethod;

class Main{
	public static void main  ( String[] args ) {
		double aa = 15. ;
		double bb = 30. ;
		double cc = MyUtils.max( aa, bb );
		System.out.println ( " max: " + cc ) ;
	}
}
