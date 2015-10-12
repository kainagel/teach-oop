package hh_generics.dd_genericMethod;

class BoxFiller {

    public static <T> void fillBox ( Box<T> box, T element ) {
	box.add( element ) ;
    }
    
}