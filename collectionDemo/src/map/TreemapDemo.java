package map;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        TreeMap<String, Integer> shop = new TreeMap<>();
		
		shop.put("Note", 1);
		shop.put("Book", 2);
		shop.put("Pen", 3);
		shop.put("Pencil", 4);
		shop.put("Bag", 5);
		
		for (Map.Entry<String, Integer> map : shop.entrySet()) {
			System.out.println(map);
		}
		
		System.out.println("------------------");

		for (Map.Entry<String, Integer> mq : shop.entrySet()) {		
			System.out.println(mq.getKey()+ " " +mq.getValue());
		}

		System.out.println("------------------");

		for (Map.Entry<String, Integer> mm : shop.entrySet()){
            System.out.println(mm.getKey());
   		}
		
		System.out.println("------------------");

		for (Map.Entry<String, Integer> mm : shop.entrySet()){
            System.out.println(mm.getValue());
   		}
		
        System.out.println("------------------");
		
		System.out.println(shop.keySet());
		System.out.println(shop.values());
		System.out.println(shop.containsKey("Pen"));
		System.out.println(shop.containsValue(6));
		System.out.println(shop.get("Pen"));	
		
		


	}

}
