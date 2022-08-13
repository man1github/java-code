package set;

import java.util.HashSet;

public class HashsetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> colorpencil = new HashSet<>();		
		colorpencil.add("Blue");
		colorpencil.add("Red");
		colorpencil.add("White");
		colorpencil.add("Orange");
		colorpencil.add("Brown");
		colorpencil.add("Pink");
		colorpencil.add("Black");
		
		for (Object box : colorpencil) {
			System.out.println(box);
		}
		
		System.out.println("---------------------");

		HashSet<Object> colormarker = new HashSet<>();
		colormarker.add("Orange");
		colormarker.add("Brown");
		colormarker.add("Pink");
		colormarker.add("Black");
		colormarker.add("Blue");
		colormarker.add("Red");
		colormarker.add("White");
		colormarker.add("VIOLET");
		
		for (Object box : colormarker) {
			System.out.println(box);
		}
		
		System.out.println("---------------------");
		
		colorpencil.addAll(colormarker);
			
		for (Object bag : colorpencil) {
			System.out.println(bag);
		}
		

	}

}
