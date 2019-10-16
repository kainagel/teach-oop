package bb_methods_classes_intro.dd_RefactoringExample;

public class Main {

	public static void main(String[] args) {

		long aa = 26 ;
		
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
