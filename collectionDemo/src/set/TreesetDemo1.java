package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> laptop = new TreeSet<>();
		laptop.add("Lenovo");
		laptop.add("HP");
		laptop.add("Apple");
		laptop.add("Dell");
		laptop.add("Acer");
		laptop.add("Asus");
		laptop.add("Samsung");
		
		
		for (String s : laptop) {
			System.out.println(s);
		}
		
		System.out.println("---using iterator ---");
		
		laptop.add("Sony");
		laptop.add("Microsoft");
			
		Iterator<String> brand = laptop.iterator();
		while (brand.hasNext()) {
			System.out.println(brand.next());
		}
	
		System.out.println("******************************");

		
		laptop.remove("Samsung");
		laptop.remove("Microsoft");
		
		for (String s : laptop) {
			System.out.println(s);
		}

	}

}
