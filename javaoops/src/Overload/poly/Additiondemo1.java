package Overload.poly;

public class Additiondemo1 {
	
	 void add (int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	 static void add(int n1, int n2, int n3) {
		 System.out.println(n1 + n2 + n3);
	}

	 static double add(double n1, double n2) {
		return (n1 + n2);
	}
	
	public static void main(String[] args) {
		
		add(10, 20, 30);
		
		double value = add(10.5,20.5);
		System.out.println(value);
		
		Additiondemo1 obj = new Additiondemo1();
		obj.add(100, 200);

	}

}
