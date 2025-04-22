package hh_inheritanceFurtherDetails.dd_composition;

public class DriverVehicleUnit implements MobileI, PersonI {
	private final PersonI personDelegate ;
	private final MobileI carDelegate ;

	DriverVehicleUnit( int age ) {
		personDelegate = new PersonImpl( age ) ;
		carDelegate = new Car() ;
	}
	
	@Override
	public void move() {
		carDelegate.move();
	}
	@Override
	public int getDriverAge() {
		return personDelegate.getDriverAge();
	}
}
