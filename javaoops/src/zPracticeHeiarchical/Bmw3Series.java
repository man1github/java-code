package zPracticeHeiarchical;

public class Bmw3Series extends Bmw{

	public static void main(String[] args) {
		
		Bmw3Series b3s = new Bmw3Series();
		b3s.fueleconomy();
		b3s.carpats();
		b3s.foglight();
		b3s.engine();
		
	}
	
	public void fueleconomy() {
		System.out.println("Bmw3Series fueleconomy = 20km/l");
		super.fueleconomy();
	} 
	public void foglight() {
		System.out.println("Bmw3Series foglight = stylish design");
	}
	public void engine() {
	    System.out.println("Bmw3Series engine = v12 power engine");	
	}
	

}
