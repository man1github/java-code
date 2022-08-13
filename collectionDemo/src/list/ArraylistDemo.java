package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistDemo {

	public static void main(String[] args) {

		// various ways to get the output
		
		ArrayList<Object> mobile = new ArrayList<>();

		mobile.add("Realme");
		mobile.add("Redmi");
		mobile.add("oppo");
		mobile.add("micromax");
		mobile.add(45);

		for (Object p : mobile) {
			System.out.println(p);
		}
		
		System.out.println("-----for loop-----");
		
		for (int i = 0; i < mobile.size(); i++) {
			System.out.println(mobile.get(i));
		}

		System.out.println("-----By using iterator-----");

		Iterator<Object> lst1 = mobile.iterator();
		while (lst1.hasNext()) {
			System.out.println(lst1.next());
		}

		System.out.println("-----By using list iterator(next)-----");

		ListIterator<Object> lst2 = mobile.listIterator();
		while (lst2.hasNext()) {
			System.out.println(lst2.next());
		}

		System.out.println("-----By using list iterator(previous)-----");

//		ListIterator<Object> lst3 = lst.listIterator();
		while (lst2.hasPrevious()) {
			System.out.println(lst2.previous());
		}

	}

}
