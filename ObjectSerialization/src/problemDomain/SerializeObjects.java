package problemDomain;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeObjects
{

	public static void main(String[] args) throws IOException
	{
		double balance;
		final int NUM_ITEMS = 3;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		BankAccount2[] accounts = new BankAccount2[NUM_ITEMS];
		
		for (int i = 0; i < accounts.length; i++)
		{
			System.out.print("Enter the balance for account " + (i+1) + ": ");
			
			balance = keyboard.nextDouble();
			
			accounts[i] = new BankAccount2(balance);
		}
		
		FileOutputStream outStream = new FileOutputStream("Objects.dat");
		
		ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
		
		for (int i = 0; i < accounts.length; i++)
		{
			objectOutputFile.writeObject(accounts[i]);
		}
		
		objectOutputFile.close();
		
		System.out.println("The serialized objects were written to the Objects.dat file");
		

	}

}
