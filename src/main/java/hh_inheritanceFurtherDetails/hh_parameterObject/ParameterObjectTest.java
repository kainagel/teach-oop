package hh_inheritanceFurtherDetails.hh_parameterObject;

class ParameterObjectTest {
	
	static PersonCharacteristics test () {
		PersonCharacteristics pc = new PersonCharacteristics() ;
		pc.setAge(20) ;
		pc.setHeight(13.) ;
		pc.setIncome(20000.) ;
		return pc ;
	}

	public static void main(String[] args) {
		
		PersonCharacteristics pc = test() ;
		System.out.println( pc.getAge() ) ;
		
	}

}
