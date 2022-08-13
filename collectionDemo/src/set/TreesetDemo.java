package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {

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
		
		System.out.println("-------using iterator -------");
		
		Iterator<String> hs1 = laptop.iterator();
		while (hs1.hasNext()) {
			System.out.println(hs1.next());
		}
		
		System.out.println("-------using descending Iterator -------");
		
		Iterator<String> brand = laptop.descendingIterator();
		while (brand.hasNext()) {
			System.out.println(brand.next());
		}

	}

}
