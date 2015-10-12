package cc_klassen.ff_differentConstructors;
class Person {

	public int age_ = -1  ;
	public String name_ ;
	
	void setAge(int tmp ) {
		age_ = tmp ;
	}
	
	void makePersonOlder() {
		age_ ++ ;
	}
	

	Person( ) {
	}
//
//	Person( int ii ) {
//		age_ = ii ;
//	}
//
//	Person( String str ) {
//		name_ = str ;
//	}
//	
	Person ( int ii, String str ) {
		name_ = str ;
		age_ = ii ;
	}

}