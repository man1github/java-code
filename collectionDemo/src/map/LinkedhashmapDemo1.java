package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map();

		System.out.println("------------------");

		LinkedHashMap<Integer, String> aadhar = new LinkedHashMap<>();

		aadhar.put(100, "manoj");
		aadhar.put(101, "absal");
		aadhar.put(102, "babu");
		aadhar.put(109, "david");
		aadhar.put(110, "fahad");
		aadhar.put(105, "arjun");
		aadhar.put(106, "imran khan");
		
		for (Map.Entry<Integer, String> s : aadhar.entrySet()) {
			System.out.println(s);
		}	

	}
	
	public static void map() {
		
		LinkedHashMap<Integer, String> aadhar = new LinkedHashMap<>();
		
		aadhar.put(200, "ragu");
		aadhar.put(201, "saran");
		aadhar.put(205, "jackson");
		aadhar.put(204, "darwin");
		aadhar.put(203, "steve jobs");
		
		for (Map.Entry<Integer, String> s : aadhar.entrySet()) {
			System.out.println(s.getKey() + "=" + s.getValue());
		}
				
	}	

}
