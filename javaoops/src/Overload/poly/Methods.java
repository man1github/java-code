package Overload.poly;

public class Methods {

	public static void main(String[] args) {

		// class 29/3/22
		

		Methods md = new Methods();
		md.Sum();
		md.Sum(20, 30);


		double z;
		z = Sum(11.0, 9.12345678);
		System.out.println("with return :" + z);
		
		float u;
		u = sum1(1.12345678f, 2.0f);
		System.out.println(u);
	}
	static double Sum(double x, double y) {
		double z = 0.0;
		z = x + y;
		return z;
	}
	 void Sum() {
		int x = 5;
		int y = 10;
		int z = 0;
		z = x + y;
		System.out.println("with out param :" + z);
	}

	void Sum(int x, int y) {
		int z = 0;
		z = x + y;
		System.out.println("with param :" + z);
	}

	
	
	static float sum1(float x,float y) {
		float u;
		u=x+y;
		return u;
	}

}
