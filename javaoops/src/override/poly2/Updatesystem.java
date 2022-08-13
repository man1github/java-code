package override.poly2;

public class Updatesystem extends Systemdemo {
	
	public void hardDisk() {
		System.out.println("It contain 1TB space");
	}
	
	public void ram() {
		System.out.println("it has 8GB RAM");
	}
	
	public void keyboard() {
		System.out.println("light effect keyboard");
		
	}

	public static void main(String[] args) {
		
		Updatesystem newsystem = new Updatesystem();
		newsystem.hardDisk();
		newsystem.ram();
		newsystem.keyboard();

	}

}
