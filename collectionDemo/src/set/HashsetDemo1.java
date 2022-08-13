package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> parts = new HashSet<>();
		parts.add("monitor");
		parts.add("mouse");
		parts.add("keyboard");
		parts.add("printer");
		parts.add("broadband");
		parts.add("CPU");
		parts.add("CPU");
		
		for (String s : parts) {
			System.out.println(s);
		}
		
		System.out.println("---using iterator in hashset---");
		
		parts.add("charger");
		parts.add("HDMI cable");
		parts.add("TV");
		
		for (String s : parts) {
			System.out.println(s);
		}
		
		System.out.println("******************************");

		parts.remove("CPU");
		parts.remove("printer");
		
		Iterator<String> hs1 = parts.iterator();
		while (hs1.hasNext()) {
			System.out.println(hs1.next());
		}
		

	}

}
