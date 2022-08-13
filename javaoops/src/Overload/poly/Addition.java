package Overload.poly;

public class Addition {
	
	int add (int n1,int n2) {
		return (n1+n2);
	}
	
	int add(int n1, int n2, int n3) {
		return (n1 + n2 + n3);
	}

	float add(float n1, float n2) {
		return (n1 + n2);
	}
	
	public static void main (String[] args) {
		
		Addition obj = new Addition();
		
		int value = obj.add(22,20);
		int value1 = obj.add(10,20,30);
		float value2 = obj.add(2.1f,1.9f);
		
		System.out.println("the first value is :" + value);
		System.out.println("the second value is :" + value1);
		System.out.println("the third value is :" + value2);

	}

}
