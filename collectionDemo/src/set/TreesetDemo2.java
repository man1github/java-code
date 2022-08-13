package set;

import java.util.TreeSet;

public class TreesetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * pollFirst - retrieve and remove the first element
		 * pollLast - retrieve and remove the last element
		 * first - retrieve the first element
		 * last - retrieve the last element
		 */
		
		TreeSet<String> biscuit = new TreeSet<>();
		biscuit.add("Good day");
		biscuit.add("Happy happy");
		biscuit.add("Mariegold");
		biscuit.add("Sunfeast");
		biscuit.add("Bourbon");
		biscuit.add("Vita mariegold");
		
		for (String s : biscuit) {
			System.out.println(s);
		}
		
		System.out.println("******************************");
		
		String name = biscuit.pollFirst();
		biscuit.pollLast();
		
		System.out.println(" using pollfirst method - " + name);
		
		for (String s : biscuit) {
			System.out.println(s);
		}

		System.out.println("******************************");
		
		boolean name1 =biscuit.remove("Asus");
		System.out.println(" using boolean method - " + name1);
		
		for (String s : biscuit) {
			System.out.println(s);
		}
	
		System.out.println("******************************");

		System.out.println(" using first method - " + biscuit.first());
		System.out.println(" using first method - " + biscuit.last());
		
		for (String s : biscuit) {
			System.out.println(s);
		}
		
		

	}

}
