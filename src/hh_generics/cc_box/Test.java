package hh_generics.cc_box;


public class Test {
    public static void main(String[] args) {

 	Box<String> box1 = new Box<String>() ;
	box1.add ( "Meier" ) ;

	Box<Integer> box2 = new Box<Integer>() ;
	box2.add ( new Integer(1) ) ;
	
//	Box<Double> box3 = new Box<Double>() ;

	String str = box1.get() ;
	Integer iii = box2.get() ;

    }

}














