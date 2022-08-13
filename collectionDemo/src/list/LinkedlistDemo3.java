package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Object> soap = new LinkedList<>();		
		soap.add("pears");
		soap.add("hamam");
		soap.add("lux");
		soap.add("medimix");
		soap.add("dettol");
		soap.add("margo");
		soap.add("cinthol");
		
		Iterator<Object> company = soap.iterator();
		while (company.hasNext()) {
			System.out.println(company.next());
		}
		
		System.out.println("---------------------");

		LinkedList<Object> washingsoap = new LinkedList<>();		
		washingsoap.add("rin");
		washingsoap.add("surfexcel");
		washingsoap.add("power");
		washingsoap.add("challenge");
		washingsoap.add("ponvandu");
	
		Iterator<Object> brands = washingsoap.iterator();
		while(brands.hasNext()) {
			System.out.println(brands.next());

		}

	}

}
