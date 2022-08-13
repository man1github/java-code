package work;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "hello world";
		String reverse = "";
		for (int i=name1.length()-1; i>= 0; i--) {
			reverse = reverse + name1.charAt(i);
		}
		System.out.println(reverse);

		System.out.println("-----------------------");

		String name = "manoj";
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());
		
 
		
		
		
	}
}
