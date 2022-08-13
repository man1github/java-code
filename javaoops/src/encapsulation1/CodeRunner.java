package encapsulation1;

public class CodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setId(111111);
		e.setName("manoj");
		e.setDesignation("QA software test engineer");
		e.setSalary(40000);
		e.setLocation("sirkali");

		System.out.println("Employee id - " + e.getId());
		System.out.println("Employee name - " + e.getName());
		System.out.println("Employee designation - " + e.getDesignation());
		System.out.println("Employee salary - " + e.getSalary());
		System.out.println("Employee location - " + e.getLocation());
		
		
        
	}

}
