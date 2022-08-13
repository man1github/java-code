package zpracticeCollection;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedhashsetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Object> s = new LinkedHashSet<>();
		s.add("aaa");
		s.add(12);
		s.add("bbb");
		s.add("ccc");
		s.add(45);
		
		for (Object fe : s) {
			System.out.println(fe);
		}

		System.out.println("-------for each--------");
	
		s.remove("bbb");

		s.forEach(d->{			
		System.out.println(d);		
		});
		
		System.out.println("-------for each--------");
		
		LinkedHashSet<Object> s1 = new LinkedHashSet<>();
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
