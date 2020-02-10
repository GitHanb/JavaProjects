package problemDomain;

import java.util.Scanner;

public class LambdDemo
{

	public static void main(String[] args)
	{
		int num;
		int result;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		IntCalculator square = x -> x * x;
		
		System.out.print("Enter an integer number: ");
		
		num = keyboard.nextInt();
		
		result = square.calculator(num);
		
		System.out.println("The square is " + result);
		
	}

}
