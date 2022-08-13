package hybrid.inher;

public class Bmw3Series extends Bmw {
	
	public void fueleconomy() {
		System.out.println("Bmw 3 Series fuel economy : 16 km/l");
	}
	
	public void wheelpower() {
		System.out.println("Bmw 3 Series - it gives four front wheel power");
	}
	
	public void hatchbag() {
		System.out.println("Bmw 3 Series - it has stylish hatchbag");
	}
	
	public void seatcolor() {
		System.out.println("Bmw 3 Series - it has golden brown color");
	}
	
	public static void main(String[] args) {
		Bmw3Series a = new Bmw3Series();
		a.fueleconomy();
		a.wheelpower();
		a.hatchbag();
		a.seatcolor();
	}
}
