package encapsulation3;

public class Coderunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank staff = new Bank();
		
		staff.setName("Ravi");
		staff.setMinimumBalance(500);
		staff.setAccountNumber(210123456);
		staff.setDebitCardNumber(203337865);
		
		
		System.out.println(staff.getName());
		System.out.println(staff.getMinimumBalance());
		System.out.println("account number - "+ staff.getAccountNumber());
		System.out.println("debitcard number - " + staff.getDebitCardNumber());

	}

}
