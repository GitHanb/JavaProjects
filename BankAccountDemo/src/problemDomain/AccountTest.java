package problemDomain;

import javax.swing.JOptionPane;

public class AccountTest {

	public static void main(String[] args) {
		String input;
		
		input = JOptionPane.showInputDialog("What is your account's starting balance?");
		
		BankAccount account = new BankAccount(input);
		
		input = JOptionPane.showInputDialog("How much were you paid this month?");
		
		account.deposit(input);
		
		JOptionPane.showMessageDialog(null, 
				String.format("Your pay has been deposited.\n"
						+ "Your current balance is $%,.2f",account.getBalance()));
		
		input = JOptionPane.showInputDialog("How much would you like to withdraw?");
		
		account.withdraw(input);
		
		JOptionPane.showMessageDialog(null, 
				String.format("Your current balance is $%,.2f",account.getBalance()));
		
		System.exit(0);
		
	}

}
