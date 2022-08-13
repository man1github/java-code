package statements;

public class Ifclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20;
		int y = 20;	
		int z = x+y;
		int k = x-y;
		
		if(x<y) {
			System.out.println("value of the z is : " + z);
		}
		else if(x == y){
			System.out.println("x and y are same value : " + "x=" + x + " " + "y=" + y);
		}
		else {
			System.out.println("value of the k is : " + k);
		}

	}

}
