package map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map();

		System.out.println("------------------");

		TreeMap<Integer, String> rationcard = new TreeMap<>();

		rationcard.put(100, "manoj");
		rationcard.put(101, "absal");
		rationcard.put(102, "babu");
		rationcard.put(109, "david");
		rationcard.put(110, "fahad");
		rationcard.put(105, "arjun");
		rationcard.put(106, "imran khan");
		
		for (Map.Entry<Integer, String> s : rationcard.entrySet()) {
			System.out.println(s);
		}	

	}
	
	public static void map() {
		
		TreeMap<Integer, String> rationcard = new TreeMap<>();
		
		rationcard.put(200, "ragu");
		rationcard.put(201, "saran");
		rationcard.put(205, "jackson");
		rationcard.put(204, "darwin");
		rationcard.put(203, "steve jobs");
		
		for (Map.Entry<Integer, String> s : rationcard.entrySet()) {
			System.out.println(s.getKey() + "=" + s.getValue());
		}
		

	}

}
