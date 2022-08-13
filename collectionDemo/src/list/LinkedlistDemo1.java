package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> random = new LinkedList<>();
		random.add(21);
		random.add("hello world");
		random.add(22);
		random.add("hai");
		
		ListIterator<Object> totaltree = random.listIterator();
		while (totaltree.hasNext()) { 
			System.out.println(totaltree.next());
		}

		System.out.println("---------------------");

		LinkedList<String> random1 = new LinkedList<>();
		random1.add("second step");
		random1.add(null);
		random1.add(null);
	
		while (totaltree.hasPrevious()) {
			System.out.println(totaltree.previous());
		}
	
		System.out.println("---------------------");

		random.addAll(random1);
		random.set(2, "23 value");
		random.addAll(0, random1);
		random.addFirst("first");
		random.addLast("final");
		
		for (Object object : random) {
			System.out.println(object);
		}
	
		System.out.println("---------------------");
		
		random.remove("23 value");
		random.removeFirst();
		random.removeLast();
		
		System.out.println("total number of elements = " + random.size());
		
		for (Object object : random) {
			System.out.println(object);
		}
	}

}
