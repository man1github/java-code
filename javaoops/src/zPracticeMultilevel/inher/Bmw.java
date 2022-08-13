package zPracticeMultilevel.inher;

public class Bmw extends Car{

	public static void main(String[] args) {
		
		Bmw bmw = new Bmw();
		bmw.fueleconomy();
		bmw.engine();
		bmw.carpats();

	}
	
	public  void fueleconomy() {
		System.out.println("bmw fuel power = 15km/l");
		super.fueleconomy();
	}
	
	public void carpats() {
		System.out.println("bmw carparts = it is made up of high quality aluminum");
	}

}
