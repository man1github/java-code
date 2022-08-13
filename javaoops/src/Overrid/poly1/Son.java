package Overrid.poly1;

public class Son extends Parents {
	
	@Override
	public void marraige() {
		System.out.println("My marraige my rules");
	}
	
	public void vehicle() {
		System.out.println("I have right to sell the vehicle");
		
	}

	public static void main(String[] args) {
		// parent class reference = object child class
		
		Parents parents = new Son();
		parents.marraige();
		parents.property();
		parents.vehicle();

	}

}
