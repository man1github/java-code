package abstraction4;

public class BmwOffice extends Car implements Upcomingprojrcts, Atm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new BmwOffice();
		car.companyvault();
		car.enginesecret();
		car.fueltype();
		
		Atm works = new BmwOffice();
		works.audioRecord();
		works.videoRecord();
		works.depositMachine();
		works.passBookPrintingMachine();
		works.withdrawMachine();
		works.airConditioner();
		
		Upcomingprojrcts fresh = new BmwOffice();
		fresh.offRoadCar();
		fresh.luxuryCar();
		fresh.electricCar();
		
	}

	@Override
	public void enginesecret() {
		// TODO Auto-generated method stub
		System.out.println("bmw - powerful engine");
	}

	@Override
	public void companyvault() {
		// TODO Auto-generated method stub
		System.out.println("bmw - safest company vault");
	}

	@Override
	public void videoRecord() {
		// TODO Auto-generated method stub
		System.out.println("CCTV - HD video quality");	
	}

	@Override
	public void audioRecord() {
		// TODO Auto-generated method stub
		System.out.println("CCTV - HD audio quality");
	}

	@Override
	public void depositMachine() {
		// TODO Auto-generated method stub
		System.out.println("depositMachine for cash deposit");
	}

	@Override
	public void withdrawMachine() {
		// TODO Auto-generated method stub
		System.out.println("withdrawMachine for cash");
	}

	@Override
	public void airConditioner() {
		// TODO Auto-generated method stub
		System.out.println("airConditioner - it has 2ton capacity");
	}

	@Override
	public void passBookPrintingMachine() {
		// TODO Auto-generated method stub
		System.out.println("to print passbook entry");	
	}

	@Override
	public void luxuryCar() {
		// TODO Auto-generated method stub
		System.out.println("luxuryCar for billionars");
		System.out.println("color is - " + color);
	}

	@Override
	public void offRoadCar() {
		// TODO Auto-generated method stub
		System.out.println("offRoadCar - powerful performance for offroads");
		System.out.println("color is - " + color);
	}

	@Override
	public void electricCar() {
		// TODO Auto-generated method stub
		System.out.println("electric car - 500km/charge");
	}

}
