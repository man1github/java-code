package statements;

public class SwitchDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int houseNumber = 113;
		String name = "";
		
		switch (houseNumber) {
		case 110:
			name = "Absal";
			break;
		case 111:
			name = "Babu";
			break;
		case 112:
			name = "David";
			break;
		case 113:
			name = "Eshwar";
			break;
		case 114:
			name = "Fahad";
			break;
		case 115:
			name = "Gowri";
			break;
		default:
			System.out.println("Address not found ");
		}
		
		System.out.println(name);


	}

}
