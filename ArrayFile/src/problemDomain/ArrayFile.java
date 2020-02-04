package problemDomain;

import java.io.IOException;
import java.io.PrintWriter;

public class ArrayFile
{

	public static void main(String[] args) throws IOException
	{
		int[] numbers = {10, 20, 30, 40, 50};
		
		PrintWriter outputFile = new PrintWriter("Values.txt");
		
		for(int i = 0; i < numbers.length; i++)
		{
			outputFile.println(numbers[i]);
		}
		
		outputFile.close();

	}

}
