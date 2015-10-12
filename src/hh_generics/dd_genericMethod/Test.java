package hh_generics.dd_genericMethod;
import java.util.*;

public class Test {
    public static void main(String[] args) {

	List<String> myList = new ArrayList<String>() ;

	MyUtils.myAdd ( myList , "Meier" ) ;
	MyUtils.myAdd ( myList , "Schmidt" ) ;
	MyUtils.myAdd ( myList , "Mustermann" ) ;
	MyUtils.myAdd ( myList , "Doe" ) ;
//	MyUtils.myAdd ( myList , new Double(25.) ) ;

// 	List<Double> myNewList = new LinkedList<Double>() ;
// 
// 	MyUtils.myAdd ( myNewList , new Double(5.) ) ;
// 	MyUtils.myAdd ( myNewList , new Double(10.) ) ;
// 	MyUtils.myAdd ( myNewList , new Double(15.) ) ;
// 	MyUtils.myAdd ( myNewList , new Double(20.) ) ;
// 	MyUtils.myAdd ( myNewList , new Double(25.) ) ;

	

    }

}














