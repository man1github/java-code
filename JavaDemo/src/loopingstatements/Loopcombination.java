package loopingstatements;

public class Loopcombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		System.out.println("####################");
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}

	}

}
