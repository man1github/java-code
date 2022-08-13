package work;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		int[] arr1 = { 1, 2, 2, 3, 3, 4 };
		arr[0] = 20;
		arr[1] = 25;
		arr[2] = 30;
		arr[3] = 35;
		arr[4] = 40;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
		}
		
		for (int x : arr ) {
			System.out.println(x);
		}
		
		
	}

}
