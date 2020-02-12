package problemDomain;

import java.io.Serializable;

public class BankAccount2 implements Serializable
{
	private double balance;

	public BankAccount2(double balance)
	{
		this.balance = balance;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	
}
