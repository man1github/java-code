package override.poly3;

public class NewHouse extends Oldhouse {
	
	public void tv(String name) {
		System.out.println("our tv size is 55 inch - " + name);
	}
	
	public void airConditioner(String name) {
		System.out.println("we have 2TON AC - " + name);
	}
	
	public void washingmachine(String name) {
		System.out.println("we have top load machine - " + name);
		
	}

	public static void main(String[] args) {
		
		NewHouse things = new NewHouse();
		things.tv("sony");
		things.airConditioner("HP");
		things.washingmachine("samsung");

	}

}
