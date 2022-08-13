package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>  tree = new ArrayList <>();
		tree.add("neem tree");
		tree.add("palm tree");
		tree.add("mango tree");
		tree.add("coconut tree");
		
		for(String estate : tree) {
			System.out.println(estate);
		}
		
		tree.add(0, "apple tree");
		tree.add(5, "teak tree");
		
		for(int i =0; i<tree.size(); i++) {
			System.out.println(tree.get(i));
		}
		
		System.out.println("---------------------");
		
		ArrayList<String>  tree1 = new ArrayList <>();
		tree1.add("lemon tree");
		tree1.add("lime tree");
		
		Iterator<String> total = tree1.iterator();
		while(total.hasNext()) {
			System.out.println(total.next());
		}
		
		tree.addAll(0, tree1);
		
		ListIterator<String> totaltree = tree.listIterator();
		while (totaltree.hasNext()) { 
			System.out.println(totaltree.next());
		}

		System.out.println("---------------------");

		
		while(totaltree.hasPrevious()) {
			System.out.println(totaltree.previous());
		}

	}

}
