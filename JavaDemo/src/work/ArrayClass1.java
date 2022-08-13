package work;

public class ArrayClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = new String[5];
		array[0] = "manoj";
		array[1] = "hari";
		array[2] = "vignesh";
		array[3] = "sachin";
		array[4] = "dhoni";
		
		for (String y : array ) {
			System.out.println(y);
		}
	
		System.out.println("***********************");
		
		for (int k=0; k<array.length; k++) {
			System.out.println(array[k]);
		}
		

	}

}
