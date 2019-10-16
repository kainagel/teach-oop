package bb_methods_classes_intro.ee_StaticVariable;

public class Main {
	   static int cnt = 0 ;
	   static void addOne() {
	      cnt += 1 ;
	   }
	   static void addTwo() {
	      cnt += 2 ;
	   }
	   public static void main ( String[] args ) {
	     addOne() ;
	     addTwo() ;
	     System.out.println("cnt=" + cnt ) ;
	   }
}
