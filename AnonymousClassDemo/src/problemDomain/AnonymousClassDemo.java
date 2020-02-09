package problemDomain;

import java.util.Scanner;

public class AnonymousClassDemo
{

	public static void main(String[] args)
	{
		int num;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		IntCalculator square = new IntCalculator()
		{
			
			@Override
			public int calculate(int number)
			{
				return number * number;
			}
		};

		System.out.print("Enter an integer number: ");
		num = keyboard.nextInt();
		
		System.out.println("The square is " + square.calculate(num));
	}

}
