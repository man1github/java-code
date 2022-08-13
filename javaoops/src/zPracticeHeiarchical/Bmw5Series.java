package zPracticeHeiarchical;

public class Bmw5Series extends Bmw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw5Series b5s  = new Bmw5Series();
		b5s.carpats();
		b5s.fueleconomy();
		b5s.ai();
		
  	}

	@Override
	public void fueleconomy() {
		System.out.println("Bmw5Series fueleconomy = 22km/l");
		super.fueleconomy();
	}

	@Override
	public void carpats() {
		System.out.println("Bmw5Series carpats = gold color painted");
		super.carpats();
	}
	public void ai() {
		System.out.println("Bmw5Series ai = using last model");
		
	}

}
