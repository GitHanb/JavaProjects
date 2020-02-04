package problemDomain;

public class BankAccount {
	private double balance;
	
	

	public BankAccount() {
		this.balance = 0.0;
	}


	public BankAccount(double startBalance) {

		this.balance = startBalance;
	}
	
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void deposit (String str) {
		this.balance += Double.parseDouble(str);
	}
	
	public void withdraw (double amount) {
		this.balance -= amount;
	}
	
	public void withdraw (String str) {
		this.balance -= Double.parseDouble(str);
	}
	
	public void setBalance(double b) {
		this.balance = b;
	}
	
	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
}
