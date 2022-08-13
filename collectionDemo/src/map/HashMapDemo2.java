package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> color = new HashMap<>();
		color.put("chair", "blue");
		color.put("phone", "grey");
		color.put("pen", "green");
		color.put("laptop", "black");
		color.put("shirt", "red");
		
		for(Map.Entry<String, String> s : color.entrySet()) {
			System.out.println(s);
		}

		System.out.println("------------------");
	
		HashMap<String, String> color1 = new HashMap<>();
		color1.put("bike", "black and grey");
		color1.put("water", "colorless");
		color1.put("tree", "brown");
		
		color.putAll(color1);
		
		for(Map.Entry<String, String> s : color1.entrySet()) {
			System.out.println(s);
		}
		System.out.println("------------------");

		for(Map.Entry<String, String> s : color.entrySet()) {
			System.out.println(s);
		}
		
		System.out.println("------------------");

		color.remove("chair");
		color.replace("bike", "black and grey", "orange");
		
		for(Map.Entry<String, String> s : color.entrySet()) {
			System.out.println(s);
		}
		

	}

}
