package hh_generics.cc_box;

class Box <T> {
	private T element_ ;
	public void add ( T tmp ) {
		element_ = tmp ;
	}
	public T get ( ) {
		return element_ ;
	}
}
