package hi_inheritance_et_al.dd_composition;

public class DriverVehicleUnit implements MobileI, PersonI {
	PersonI personDelegate ;
	MobileI carDelegate ;

	DriverVehicleUnit( int age ) {
		personDelegate = new PersonImpl( age ) ;
		carDelegate = new Car() ;
	}
	
	@Override
	public void move() {
		carDelegate.move();
	}
	@Override
	public int getAge() {
		return personDelegate.getAge();
	}
}
