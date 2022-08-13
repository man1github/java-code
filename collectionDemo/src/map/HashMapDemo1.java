package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
						
		HashMap<Integer, String> voterid = new  HashMap<>();
		voterid.put(1, "bharath");
		voterid.put(2, "absal");
		voterid.put(3, "dinesh");
		voterid.put(4, "eshwar");
		
		for (Map.Entry<Integer, String> map : voterid.entrySet()) {
			System.out.println(map);
		}
		
		System.out.println("------------------");

		for (Map.Entry<Integer, String> mq : voterid.entrySet()) {		
			System.out.println(mq.getKey()+ " " +mq.getValue());
		}

		System.out.println("------------------");

		for (Map.Entry<Integer, String> mm : voterid.entrySet()){
            System.out.println(mm.getKey());
   		}
		
		System.out.println("------------------");

		for (Map.Entry<Integer, String> mm : voterid.entrySet()){
            System.out.println(mm.getValue());
   		}
		
		System.out.println("------------------");
		
		System.out.println(voterid.keySet());
		System.out.println(voterid.values());
		System.out.println(voterid.containsKey(3));
		System.out.println(voterid.containsValue("absal"));
		System.out.println(voterid.get(1));	

	}
}
