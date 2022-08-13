package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> bike = new LinkedHashSet<>();
		bike.add("Yamaha");
		bike.add("Hero");
		bike.add("Honda");
		bike.add("Suzuki");
		bike.add("KTM");
		bike.add("Royal Enfield");

		for (Object showroom : bike) {
			System.out.println(showroom);
		}
		
		System.out.println("---using iterator in LinkedHashSet---");
		
		bike.add("bmw");
		bike.add("Tvs");
		bike.add("bajaj");
		
		for (Object showroom : bike) {
			System.out.println(showroom);
		}
				
		System.out.println("******************************");
		
		bike.remove("bmw");
		bike.remove("KTM");
		bike.remove("Tvs");
		
		Iterator<Object> showroom = bike.iterator();
		while (showroom.hasNext()) {
			System.out.println(showroom.next());
		}
		
	}	
}
