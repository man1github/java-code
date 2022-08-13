package multiple.inher;

public class Bmw implements Bmw3series, Bmw5series {
	
	@Override
	public void engine() {
		System.out.println("Bmw engine : 2.0L 4-Cylinder");
	}
	
	@Override
	public void fueleconomy() {
		System.out.println("Bmw fueleconomy : 17 km/l");
	}
	
	@Override
	public void wheelpower() {
		System.out.println("BMW wheelpower - it gives two front wheel power");
	}
	
	@Override
	public void hatchbag() {
		System.out.println("BMW hatchbag - it has hatchbag");
	}

	@Override
	public void speedometer() {
		System.out.println("BMW speedometer - it has digital meter");
	}

	@Override
	public void totalseating() {
		System.out.println("BMW - it has 5 seating");
	}

	@Override
	public void spareTire() {
		System.out.println("BMW - it has spareTire");
	}
	
}
