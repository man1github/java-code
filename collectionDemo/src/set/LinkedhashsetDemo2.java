package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> book = new LinkedHashSet<>();
		book.add("Horror ");
		book.add("Science fiction ");
		book.add("Fantasy");
		book.add("Romance novel");
		book.add("Crime story");
		book.add("Historical fiction");

		for (Object genre : book) {
			System.out.println(genre);
		}
	
		System.out.println("******************************");

		LinkedHashSet<Object> movie = new LinkedHashSet<>();
		movie.add("love story");
		movie.add("emotional story");
		movie.add("loop story");
		movie.add("thriller story");
		movie.add("comedy story");

		for (Object genre : movie) {
			System.out.println(genre);
		}

		System.out.println("******************************");

		book.addAll(movie);
		
		Iterator<Object> showroom = book.iterator();
		while (showroom.hasNext()) {
			System.out.println(showroom.next());
		}
		
	}

}
