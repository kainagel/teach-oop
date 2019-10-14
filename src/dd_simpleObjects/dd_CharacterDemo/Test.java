package dd_simpleObjects.dd_CharacterDemo;
public class Test {
    /**
     * @param args
     */
    public static void main(String args[]) {
//    	System.out.println( " num val of a: " + Character.getNumericValue('a') ) ;
//    	System.out.println( " num val of A: " + Character.getNumericValue('A') ) ;
//    	System.out.println( " num val of b: " + Character.getNumericValue('b') ) ;
    	
    	
        Character myCharacter = new Character('b');
        Character a2 = new Character('b');
        
        if ( myCharacter.equals(a2) ) {
//        if ( myCharacter == a2 ) {
            System.out.println ( " equal " ) ;
        } else {
            System.out.println ( " NOT equal " ) ;
        }

//        char bbb = 'g' ;
//        
//        Character aaa = new Character('a');
//        int difference = aaa.compareTo(bbb) ;
//        System.out.println( " difference: " + difference ) ;
//        if (difference == 0) {
//            System.out.println("a is equal to b.");
//        } else if (difference < 0) {
//            System.out.println("a is less than b.");
//        } else if (difference > 0) {
//            System.out.println("a is greater than b.");
//        }
    }
}
