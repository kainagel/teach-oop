package bb_methods_classes_intro.dd_RefactoringExample;

class Main {

	public static void main(String[] args) {

		long aa = 25;

		abc( aa );

	}
	private static void abc( long aa ){
		for ( int ii=0 ; ; ii++ ) {
			if ( ii*ii == aa ) {
				System.out.println( ii + " is sqrt of " + aa );
				break ;
			} else if ( ii * ii > aa ) {
				System.out.println( aa + " does not have an integer root" );
				break ;
			}
		}
	}


}
