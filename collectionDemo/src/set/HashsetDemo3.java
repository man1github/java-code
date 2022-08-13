package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object>  dress = new HashSet <>();
		dress.add("shirt");
		dress.add("double side shirt");
		dress.add("jeans");
		dress.add("t shirt");
		dress.add("trouser");
		dress.add("pant");
		
		for(Object menswear : dress) {
			System.out.println(menswear);
		}

		System.out.println("---------------------");
		
		HashSet<Object>  schooldress = new HashSet <>();
		schooldress.add("uniform shirt");
		schooldress.add("uniform pant");
		schooldress.add("shoe");
		
		
		for(Object school : schooldress) {
			System.out.println(school);
		}

		System.out.println("---------------------");

		dress.removeAll(schooldress);
		
		Iterator<Object> hs1 = dress.iterator();
		while (hs1.hasNext()) {
			System.out.println(hs1.next());
		}

	}

}
