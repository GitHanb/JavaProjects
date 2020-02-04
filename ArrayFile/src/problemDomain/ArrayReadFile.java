package problemDomain;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArrayReadFile
{

	public static void main(String[] args) throws IOException
	{
		final int SIZE = 5;
		
		int[] numbers = new int[SIZE];
		
		int i = 0;
		
		File file = new File("Values.txt");
		
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext() && i < numbers.length)
		{
			numbers[i] = inputFile.nextInt();
			i++;
		}
		
		inputFile.close();
		
		
		//display numbers
		for(int number: numbers)
		{
			System.out.println(number);
		}

	}

}
