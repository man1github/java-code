package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	      
	public static void main(String[] args) {
		
		map();
		
		System.out.println("------------------");
		
		HashMap<Integer, String> stationary = new HashMap<>();
	
		stationary.put(1, "Note");
		stationary.put(2, "Book");
		stationary.put(3, "Pen");
		stationary.put(4, "Pencil");
		stationary.put(5, "Bag");
						
		for (Map.Entry<Integer, String> s : stationary.entrySet()) {
			System.out.println(s);
		}	

	}
	
	public static void map() {
		
		HashMap<String, Integer> stationary = new HashMap<>();
		
		stationary.put("Note", 1);
		stationary.put("Book", 2);
		stationary.put("Pen", 3);
		stationary.put("Pencil", 4);
		stationary.put("Bag", 5);
		
		for (Map.Entry<String, Integer> s : stationary.entrySet()) {
			System.out.println(s.getKey() + "=" + s.getValue());
		}

	}

}
