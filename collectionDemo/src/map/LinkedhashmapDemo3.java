package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		System.out.println("------------------");
	
		LinkedHashMap<Integer, String> aadhar1 = new LinkedHashMap<>();
		
		aadhar1.put(200, "ragu");
		aadhar1.put(201, "saran");
		aadhar1.put(205, "jackson");
		aadhar1.put(204, "darwin");
		aadhar1.put(203, "steve jobs");
		
		for (Map.Entry<Integer, String> s : aadhar1.entrySet()) {
			System.out.println(s);
		}
	
		System.out.println("------------------");

		aadhar1.clear();
		
		System.out.println("aadhar1 datas " + aadhar1);
		
	}

}
