package loopingstatements;

public class Looptable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  print tables using loop
		
				int table = 9;
				for (int i=1; i<=10; i++) {
					System.out.println(table + (" * ") + i + (" = ") + (table * i));		
				}
				
				int table1 = 10;
				int j=1;
				while(j<=10) {
					System.out.println(table1 + " * " + j + " = " + (j*table1));
					j++;
				}
				
				int table2 = 11;
				int k=1;
				do {
					System.out.println(table2 + " * " + k + " = " + (table2*k));
					k++;
				}while (k<=10);
				

	}

}
