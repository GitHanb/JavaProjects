package problemDomain;

public class AccountTest
{

	public static void main(String[] args)
	{
		try
		{
			BankAccount account = new BankAccount(-100.0);
		} catch (NegativeStartingBalance e)
		{
			System.out.println(e.getMessage());
		}
	}

}
