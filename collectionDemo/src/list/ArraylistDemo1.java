package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> lst = new ArrayList<>();
		lst.add("Realme");
		lst.add("Redmi");
		lst.add("oppo");
		lst.add("micromax");
		lst.add(45);

		for (Object p : lst) {
			System.out.println(p);
		}
		System.out.println("***********************");

		System.out.println(lst.isEmpty());
		System.out.println(lst.subList(1, 4));

		lst.remove("Realme");
		lst.remove(3);
        lst.add(0, "nokia");
        lst.add("Redmi");
		
		System.out.println(lst.indexOf("nokia"));
		System.out.println(lst.lastIndexOf("Redmi"));
		;

		Iterator<Object> it = lst.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----another list-----");

		ArrayList<Object> lst1 = new ArrayList<>();
		lst1.add("samsung");
		
		lst.remove("Redmi");
		lst.addAll(lst1);
		lst.set(2, "micromax");
		
		for (Object p : lst) {
			System.out.println(p);
		}
	
		System.out.println("---------------------");

		lst.removeAll(lst1);
		
		for (Object p : lst) {
			System.out.println(p);
		}

	}

}
