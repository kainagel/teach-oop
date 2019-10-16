package hh_generics.dd_genericMethod;
class ClassInspector {
//     public <T> void inspect ( T tt ) {
    public void inspect ( Object tt ) {
	System.out.println ( " instance of class: " + tt.getClass().getName() ) ;
    }
}