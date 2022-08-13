package map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> insurance = new TreeMap<>();

		insurance.put(1001, "manoj");
		insurance.put(1010, "absal");
		insurance.put(1023, "babu");
		insurance.put(1083, "david");
		insurance.put(1173, "fahad");
		insurance.put(1053, "arjun");
		insurance.put(1033, "imran khan");
		
		for (Map.Entry<Integer, String> s : insurance.entrySet()) {
			System.out.println(s);
		}	
		
		System.out.println("-----------------------");

		System.out.println(insurance.pollFirstEntry());
		System.out.println(insurance.pollLastEntry());

		System.out.println("-----------------------");

		Map<Integer, String> name = insurance.descendingMap();
		System.out.println(name);
	
		System.out.println("-----------------------");

		System.out.println(insurance.firstKey());
		System.out.println(insurance.lastKey());
		
	
	}

}
