package problemDomain;

import javax.swing.JOptionPane;

public class CustomerNumber
{

	public static void main(String[] args)
	{
		String input;
		
		input = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNNN\n"
				+ "(LLL = letters and NNNN = numbers)");
		
		if(isValid(input))
		{
			JOptionPane.showMessageDialog(null, "That is a valid customer number.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "That is not the proper format of a customer number.\n"
					+ "Here is an example: ABC1234");
		}
		
		System.exit(0);

	}

	private static boolean isValid(String custNumber)
	{
		boolean goodSoFar = true;
		int i = 0;
		
		//test length
		if(custNumber.length() != 7)
		{
			goodSoFar = false;
		}
		
		//test first 3 characters for letters
		while(goodSoFar && i < 3)
		{
			if(!Character.isLetter(custNumber.charAt(i)))
			{
				goodSoFar = false;
			}
			i++;
		}
		
		//test last four character for digits
		while (goodSoFar && i < 7)
		{
			if(!Character.isDigit(custNumber.charAt(i)))
			{
				goodSoFar = false;
			}
			i++;
		}
		return goodSoFar;
		
	}

}
