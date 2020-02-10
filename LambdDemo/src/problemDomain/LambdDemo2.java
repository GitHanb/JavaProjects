package problemDomain;

import java.util.Scanner;

public class LambdDemo2
{

	public static void main(String[] args)
	{
		final int factor = 10;
		int num;
		int result;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		IntCalculator multiplier = x -> x * factor;
		
		System.out.print("Enter an integer number: ");
		
		num = keyboard.nextInt();
		
		result = multiplier.calculator(num);
		
		System.out.println("The result is " + result);
	}

}
