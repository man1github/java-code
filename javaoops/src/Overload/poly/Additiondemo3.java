package Overload.poly;

public class Additiondemo3 {

	void sub() {
		int a = 5;
		int b = 4;
		int c = a + b;

		System.out.println("sub method is = " + c);
	}

	int calculation() {
		int a = 4;
		int b = 4;
		int c = a + b;
		return c;
	}

	static int calculationmethod() {
		int a = 4;
		int b = 4;
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		System.out.println("calculation method is " + calculationmethod());

		Additiondemo3 obj = new Additiondemo3();
		obj.sub();
		System.out.println("calculation value is " + obj.calculation());

	}
}
