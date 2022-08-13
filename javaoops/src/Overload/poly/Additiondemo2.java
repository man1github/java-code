package Overload.poly;

public class Additiondemo2  {

	public static void add(int a, int b) {
		
		int z=a+b;
		System.out.println(z);
	}
	public static void add(String a, String b, int c) {
		
		System.out.println(a+" "+b+" "+c);
			
	}
	static Object  add(String a, int b){
		return(a+b);
	}
	static double add(double a, double b) {
		double z;
		z=a+b;
		return (z);
	}
	
	static float add(float a,float b) {
		float z;
		z=a-b;
		return(z);
	}
	public static  void add(int a, String b) {
		System.out.println(a+b);
		
	}
	
	
	public static void main(String[] args) {
		
		add(10, 10);
		add("manoj", "guru", 10);
		System.out.println(add("value", 20));
		System.out.println(add(1.1, 2.2));
		System.out.println(add(2.2f, 1.2f));
		add(0, "null");

	}

}
