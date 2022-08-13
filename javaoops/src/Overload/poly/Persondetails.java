package Overload.poly;

public class Persondetails {
	
	String persondetails (String name,String locaction) {
		return (name + locaction);
	}
	
	Object persondetails(int id, String designation, String district) {
		return (id + designation + district);
	}
	
	Object persondetails(long contact, String bloodgroup) {
		return (contact + bloodgroup);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persondetails obj = new Persondetails();
		
		System.out.println("person details is :" +obj.persondetails("manoj", " sirkali"));
		System.out.println("person details is :" +obj.persondetails(10," engineer", " mayiladuthurai"));
		System.out.println("person details is :" +obj.persondetails(9876543210L, " A+"));
 

	}

}
