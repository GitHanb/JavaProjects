package problemDomain;

public class BankAccount
{
	private double startingBalance;

	public BankAccount(double startingBalance) throws NegativeStartingBalance
	{
		if(startingBalance < 0)
		{
			throw new NegativeStartingBalance(startingBalance);
		}
		
		this.startingBalance = startingBalance;
	}

	public double getStartingBalance()
	{
		return startingBalance;
	}

	public void setStartingBalance(double startingBalance)
	{
		this.startingBalance = startingBalance;
	}
	
	
}
