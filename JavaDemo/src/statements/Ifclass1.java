package statements;

public class Ifclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;

		if (age < 18) {
			System.out.println("not elegible to vote - " + age);
		}
		else if (age == 18) {
			System.out.println("apply voter id and then you can elegible to vote - " + age);
		}
		else {
			System.out.println("elegible to vote - " + age);
		}

	}

}
