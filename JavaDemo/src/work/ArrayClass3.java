package work;

public class ArrayClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][] letter = new String[4][2];
		letter[0][0] = "abc";
		letter[0][1] = "def";
		letter[1][0] = "ghi";
		letter[1][1] = "jkl";
		letter[2][0] = "mno";
		letter[2][1] = "pqr";
		letter[3][0] = "stu";
		letter[3][1] = "wxy";

		
		for (String[] s : letter) {
			for(String s1 : s ) {
				System.out.print(s1 + " ");
			}
			System.out.println();
		}
		
	}

}
