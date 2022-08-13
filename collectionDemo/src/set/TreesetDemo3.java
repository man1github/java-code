package set;

import java.util.TreeSet;

public class TreesetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		System.out.println(biscuit.descendingSet());
		System.out.println(biscuit.headSet("Mariegold"));
		System.out.println(biscuit.headSet("Mariegold", true));
		System.out.println(biscuit.tailSet("Mariegold"));
		System.out.println(biscuit.tailSet("Mariegold", false));
		System.out.println(biscuit.subSet("Happy happy", "Vita mariegold"));
		System.out.println(biscuit.subSet("Happy happy", false, "Vita mariegold", true));

		System.out.println("******************************");

		for (String s : biscuit) {
			System.out.println(s);
		}
		
		System.out.println("******************************");
		
		biscuit.clear();
		
		for (String s : biscuit) {
			System.out.println(s);
		}

	
	}

}
