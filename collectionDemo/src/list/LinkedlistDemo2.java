package list;

import java.util.LinkedList;

public class LinkedlistDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Object> colorpencil = new LinkedList<>();		
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

		LinkedList<Object> colormarker = new LinkedList<>();
		colormarker.add("Orange");
		colormarker.add("Brown");
		colormarker.add("Pink");
		colormarker.add("Black");
		colormarker.add("Blue");
		colormarker.add("Red");
		colormarker.add("White");
		
		for (Object box : colormarker) {
			System.out.println(box);
		}
		
		System.out.println("---------------------");
		
		colorpencil.addAll(0, colormarker);
		
		for (Object bag : colorpencil) {
			System.out.println(bag);
		}
		
	}

}
