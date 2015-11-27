package dd_simpleObjects.ee_StringTest;
public class Test {
    public static void main(String args[]) {
    	
//    	double d1=3., d2=4. ;
//    	d1.equals(d2);
    	
    	String s1 = "   Hello  lskdfj";
    	String s2 = new String("Hello") ;
    	
    	System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
    	System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    	
//    	System.out.println( " index: " + s1.indexOf('o') ) ;
    	
    	System.out.println( " info:  |" + s1.trim() + "|" ) ;
    	
//    	String str3 = s1 + s2 ;
//    	System.out.println( " str3: " + str3 ) ;
//    	
//    	System.out.println( " length: " + str3.length() ) ;
//    	System.out.println( " char(4): " + str3.charAt(4) ) ;
//    	
//    	if ( "test".equals( str ) ) {
//    		// ...
//    	}
    	
    }
}
