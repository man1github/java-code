package zpracticeCollection;

import java.util.ArrayList;

public class Arraylisttypes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> a = new ArrayList<>();
		a.add(21);
		a.add("hello world");
		a.add(22);
		a.add("hai");
		
		System.out.println("before removing =" +a);
		
		a.remove(0);
		a.remove("hai");
		
		System.out.println("after removing = "+a);
		
		ArrayList<Object> ab = new ArrayList<>();
		
		ab.add("second arraylist");
		ab.addAll(a);
		ab.set(2, "end");
		
		System.out.println("all together =" + ab);
		System.out.println("all together size = " +ab.size());

		
		
		for (Object object : ab) {
			System.out.println(object);
		}
		
		
		

	}

}
