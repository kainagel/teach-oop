package aa_basics.gg_scope;

public class ScopeTest {

	public static void main(String[] args) {
        int aa = 3 ;
        {
            int bb = 5 ;
            bb = bb + aa ;
            aa = bb + aa ;
        }
        System.out.println ( " aa: " + aa ) ; // ok
//		System.out.println ( " bb: " + bb ) ; // not ok
        
        for ( int ii=1 ; ii<20 ; ii++ ) {
        	System.out.println( " ii: " + ii ) ;
        }
//        System.out.println( " ii: " + ii ) ; // not ok
	}

}
