package encapsulation2;

public class CodeRunner {

	public static void main(String[] args) {
		
		//passing parameter in encapsulation
		
		Employee e = new Employee(111, "manoj", "sr.automation test engineer", 30000, "cdm");
        System.out.println("Employee id - " + e.getId());
        System.out.println("Employee name - " + e.getName());
        System.out.println("Employee designation - " + e.getDesignation());
        System.out.println("Employee salary - " + e.getSalary());
        System.out.println("Employee location - " + e.getLocation());
        
	}

}
