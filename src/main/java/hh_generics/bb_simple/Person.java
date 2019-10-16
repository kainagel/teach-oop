package hh_generics.bb_simple;
class Person {

	private final String name_ ;
	
	Person( String name ) {
		name_ = name ;
	}
	
//	public void setName( String nm ) {
//		name_ = nm ;
//	}
	
	public String getName ( ) {
		return name_ ;
	}

	@Override
	public String toString ( ) {
		return " person " + getName() ;
	}

}