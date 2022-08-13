package statements;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String mobile = "realme";
		
		switch (mobile) {
		case "redmi":
			System.out.println("it starts from 10,000");
			break;
		case "nokia":
			System.out.println("it starts from 20,000");
			break;
		case "samsung":
			System.out.println("it starts from 25,000");
			break;
		case "realme":
			System.out.println("it starts from 15,000");
			break;
		case "one plus":
			System.out.println("it starts from 30,000");
			break;
		default:
			System.out.println("Invalid mobile name");
			break;
		}

	}

}
