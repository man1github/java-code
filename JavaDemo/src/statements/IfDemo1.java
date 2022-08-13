package statements;

public class IfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 60;
		char grade;

		if (marks >= 80) {
			grade = 'A';
		} else if (marks >= 70) {
			grade = 'B';
		} else if (marks >= 60) {
			grade = 'C';
		} else if (marks >= 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Grade = " + grade);

	}

}
