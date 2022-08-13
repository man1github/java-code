package zpracticeCollection;

import java.util.LinkedList;

public class LinkedlistTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Object> a = new LinkedList<>();
		LinkedList<Object> a = new LinkedList<>();
		a.add(21);
		a.add("hello world");
		a.add(22);
		a.add("hai");
		
		LinkedList<String> s = new LinkedList<>();
		s.add("second step");
		s.add(null);
		
		a.addAll(s);
		a.set(2, "23 value");
		a.addAll(0, s);
		a.addFirst("first");
		a.addLast("final");
		
		System.out.println("before removing =" +a);
		
		a.remove("23 value");
		a.removeFirst();
		a.removeLast();
		
		System.out.println("after removing =" +a);
		System.out.println("after removing =" +a.size());
		
		for (Object object : a) {
			System.out.println(object);
		}
	}

}
