package map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> aadhar = new TreeMap<>();

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
	
		TreeMap<Integer, String> aadhar1 = new TreeMap<>();
		
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
