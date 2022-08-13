package zpracticeCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylisttypes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> a = new ArrayList<>();
		a.add(21);
		a.add("hello world");
		a.add(22);
		a.add("hai");
		
		System.out.println("before removing =" +a);
		
		a.remove(0);
		a.remove("hai");
		
		System.out.println("after removing = "+a);
		
		ArrayList<Object> ab = new ArrayList<>();
		
		ab.add("second arraylist");
		ab.addAll(a);
		ab.set(2, "end");
		
		System.out.println("all together =" + ab);
		System.out.println("all together size = " +ab.size());
		
		System.out.println("-----");
		
		for (int i = 0; i < ab.size(); i++) {
			System.out.println(ab.get(i));
		}
		System.out.println("-----using for loop");

		
		for (Object object : ab) {
			System.out.println(object);
		}
		System.out.println("-----using for each loop");
		
		ab.forEach(fe -> {
			System.out.println(fe);
		});

		System.out.println("-----using foreach loop(using arraylist object) ");
		
		Iterator<Object> ite = ab.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("-----using for while loop");

		ListIterator<Object> lite = ab.listIterator();
		while(lite.hasNext()) {
			System.out.println(lite.next());
		}
		
		System.out.println("-----using listiterator for while ");
		
		while (lite.hasPrevious()) {
			System.out.println(lite.previous());
		}

		System.out.println("-----using listiterator for while and it is previous order ");

	}

}
