package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> a = new LinkedList<>();
		a.add(21);
		a.add("hello world");
		a.add(22);
		a.add("hai");
		
		for (Object object : a) {
			System.out.println(object);
		}
		
		System.out.println("---------------------");
		
		a.set(2, "23 value");
		a.addFirst("first");
		a.addLast("final");
		
		for(int i =0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}	
		
		System.out.println("---------------------");
		
		a.remove("23 value");
		a.removeFirst();
		a.removeLast();
		
		System.out.println("total number of elements = " + a.size());
		
		Iterator<Object> total = a.iterator();
		while(total.hasNext()) {
			System.out.println(total.next());
		}
		
	}

}
