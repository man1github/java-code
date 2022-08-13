package multilevel.inher;

public class Bmw extends Car {
	
	public static void main(String[] args) {
	
		Bmw BMW = new Bmw();
        BMW.engine();
        BMW.carparts();
        BMW.wheelpower();
        BMW.fueleconomy();
	}
	
	public void engine() {
		System.out.println("BMW car engine : V6 power engine");
	}
	public void wheelpower() {
		System.out.println("BMW : it gives four wheel power");
		super.wheelpower();
	}
	public void carparts() {
		System.out.println("BMW parts : High Quality Alumininum and stylish design");
	}
	public void fueleconomy() {
		System.out.println("BMW fuel economy : 15 km/l");
	}
}
