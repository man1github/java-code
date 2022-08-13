package Single.inher;

public class Bmw extends Car {
	
	public void fueleconomy() {
		System.out.println("BMW fuel economy : 15 km/l");
	}
	
	public void wheelpower() {
		System.out.println("BMW : it gives four wheel power");
	}
	
	public void hatchbag() {
		System.out.println("BMW : it has big hatchbag");
	}
	
	public void quaterglass() {
		System.out.println("BMW : it has stylish quater glass");
	}
	
	public static void main(String[] args) {
		Bmw B = new Bmw();
		B.fueleconomy();
		B.wheelpower();
		B.hatchbag();
		B.quaterglass();
		
	} 
	
}
