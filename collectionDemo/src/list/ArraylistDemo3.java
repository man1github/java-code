package list;

import java.util.ArrayList;

public class ArraylistDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object>  scale = new ArrayList <>();
		scale.add("15cm camlin scale");
		scale.add("30cm camlin scale");
		scale.add("15cm rubber scale");
		scale.add("30cm rubber scale");
		scale.add("15cm wooden scale");
		scale.add("30cm wooden scale");
		
		
		scale.forEach(a -> {
			System.out.println(a);
		});
	
		System.out.println("---------------------");

		scale.remove(1);
	    scale.set(0, "rolling scale");
	    
	    scale.forEach( b ->{
	    	
	    	System.out.println(b);
	    });
		
		

		

	}

}
