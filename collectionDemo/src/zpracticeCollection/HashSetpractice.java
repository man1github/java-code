package zpracticeCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		set<Object> s = new HashSet<>();
		HashSet<Object> s = new HashSet<>();
		s.add("aaa");
		s.add(12);
		s.add("bbb");
		s.add("ccc");
		s.add(45);
				
		System.out.println(s);
		
		s.remove("bbb");

		s.forEach(d->{			
		System.out.println(d);		
		});
		
		System.out.println("-------for each--------");
		
		Set<Object> s1 = new HashSet<>();
		s1.add("man");
		s1.add(100);
		
		s.addAll(s1);
		
		for (Object fe : s) {
			System.out.println(fe);
		}
		
		System.out.println("-------for each--------");
	
		s.add(45);
		
		Iterator<Object> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------while--------");

	}

}
