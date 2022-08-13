package hierarchical.inher;

public class Bmw5Series extends Bmw{
	
	public void  engine() {
	    System.out.println("Bmw 5 Series car engine : 3.0L 4-Cylinder");
	}
	public void  horsepower() {
	    System.out.println("Bmw 5 Series Horse power : 150 Kw");
	}
	
	
	public static void main(String[] args) {
		
		Bmw5Series BMW5 = new Bmw5Series();
        BMW5.engine();
        BMW5.horsepower();
        BMW5.fueleconomy();
  
	}

}
