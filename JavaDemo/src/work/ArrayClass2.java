package work;

public class ArrayClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] ma = {{5,6},{3,4}};
		int[][] ma = new int[2][3]; 
		ma[0][0] = 2;
		ma[0][1] = 3;
		ma[0][2] = 4;
		ma[1][0] = 5;
		ma[1][1] = 6;
		ma[1][2] = 7;
		
		for(int[] a : ma) {
			for(int aa : a) {
				System.out.print(aa + " ");
			}
			System.out.println(" ");
		}
		
	}

}
