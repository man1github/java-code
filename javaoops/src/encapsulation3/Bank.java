package encapsulation3;

public class Bank {
	
	private String name;
	private int minimumBalance;
	private int accountNumber;
	private int debitCardNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getDebitCardNumber() {
		return debitCardNumber;
	}
	public void setDebitCardNumber(int debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	
}
