package work;

public class ZArrayPractice1 {

	public static void main(String[] args) {
			
	// 	int[] array = {1,2,3,4,5,6};
		int[] array = new int[5];
		array[0] = 5;
		array[1] = 6;
		array[2] = 7;
		array[3] = 8;
		array[4] = 3;
		
		for(int j=0; j<array.length; j++) {
			System.out.println(array[j]);
		}
		
		System.out.println("###############################");
		
		for(int x : array) {
			System.out.println(x);
		}
				
	}

}
