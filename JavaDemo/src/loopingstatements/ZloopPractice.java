package loopingstatements;

public class ZloopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=10; i = i+2) {
			System.out.println(i);
		}
		
		System.out.println("---------");
		
		int j = 2;
		while (j<=10) {
			System.out.println(j);
		    j = j+2;
		}
		
		System.out.println("---------");

		int k = 12;
		do {
			System.out.println(k);
		    k= k+2;
		}while (k<=10);
		
		System.out.println("---------");

		for (int x=1; x<=10; x++) {
			System.out.println("9" +"*"+ x + "=" + (9*x) );
		}

		System.out.println("---------");
		
		int y=1;
		while (y<=10) {
			System.out.println(y);
			y++;
		}
	}

}
