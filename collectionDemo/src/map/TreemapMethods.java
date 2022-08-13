package map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapMethods {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tenthclass = new TreeMap<>();
		tenthclass.put("hari", 1);
		tenthclass.put("akilan", 2);
		tenthclass.put("rasheeth", 3);
		tenthclass.put("parthipan", 4);
		tenthclass.put("praveen", 5);
		
		for (Map.Entry<String, Integer> entry : tenthclass.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("-----------------------");
		System.out.println(tenthclass.firstKey());
		System.out.println(tenthclass.lastKey());
		System.out.println(tenthclass.firstEntry());
		System.out.println(tenthclass.lastEntry());
		System.out.println(tenthclass.pollFirstEntry());
		System.out.println(tenthclass.pollLastEntry());
		System.out.println(tenthclass);
		System.out.println(tenthclass.replace("parthipan", 4, 9));
		System.out.println(tenthclass);
		System.out.println(tenthclass.containsKey("rasheeth"));
		System.out.println(tenthclass.containsValue(5));
		System.out.println(tenthclass.size());


	}

}
