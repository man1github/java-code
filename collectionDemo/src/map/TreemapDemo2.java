package map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> color = new TreeMap<>();
		color.put("chair", "blue");
		color.put("phone", "grey");
		color.put("pen", "green");
		color.put("laptop", "black");
		color.put("shirt", "red");
		
		for(Map.Entry<String, String> s : color.entrySet()) {
			System.out.println(s);
		}

		System.out.println("------------------");
	
		TreeMap<String, String> color1 = new TreeMap<>();
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
