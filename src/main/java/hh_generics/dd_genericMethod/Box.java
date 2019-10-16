package hh_generics.dd_genericMethod;
class Box <T> {

    public void ini ( ) {
	System.out.println ( " calling the Box.ini() method " ) ;
    }

    T element_ ;

    public void add ( T tmp ) {
	element_ = tmp ;
    }

    public void wrap ( ) {
	System.out.println ( " calling the Box.wrap() method " ) ;
    }


}