package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> bike = new LinkedHashSet<>();
		bike.add("yamaha");
		bike.add("hero");
		bike.add("honda");
		bike.add("suzuki");
		bike.add("bmw");
		bike.add("Tvs");
		bike.add("scooty");


		for (Object showroom : bike) {
			System.out.println(showroom);
		}
		
		System.out.println("---using iterator in LinkedHashSet---");		
		
		Iterator<Object> showroom = bike.iterator();
		while (showroom.hasNext()) {
			System.out.println(showroom.next());
		}
		
	}

}
