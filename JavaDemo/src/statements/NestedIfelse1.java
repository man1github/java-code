package statements;

public class NestedIfelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String communication = "you will get a job";
		String technical = "java";

		if(communication == "English")
		{
			if(technical == "java") {
				System.out.println("you will get a job");
			}
			else
				System.out.println("not selected even you have a good english communication");
		}

		else 
			System.out.println("you are rejected");

		

	}

}
