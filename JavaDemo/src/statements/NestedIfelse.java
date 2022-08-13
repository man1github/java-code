package statements;

public class NestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int english = 80;
		int tamil = 70;

		if(english >= 70)
		{
			if(tamil >= 80) {
				System.out.println("you are a leader");
			}
			else
				System.out.println("not eligible for leader position even you got qualified marks in english");
		}

		else 
			System.out.println("not eligible for leader position");

		
	}

}
