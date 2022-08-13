package hybrid.inher;

public class BmwX3 extends Bmw {
	
	public void fueleconomy() {
		System.out.println("BmwX3 fuel economy : 17 km/l");
	}
	
	public void wheelpower() {
		System.out.println("BmwX3 - it gives four front wheel power");
	}
	
	public void hatchbag() {
		System.out.println("BmwX3 - it has stylish hatchbag");
	}
	
	public void seatcolor() {
		System.out.println("BmwX3 - it has golden brown color");
	}

	public static void main(String[] args) {
		BmwX3 c = new BmwX3();
		c.fueleconomy();
		c.wheelpower();
		c.hatchbag();
		c.seatcolor();
	}
}
