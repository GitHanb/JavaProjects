package problemDomain;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile
{

	public static void main(String[] args) throws IOException
	{
		int number;
		boolean endOfFile = false;
		
		FileInputStream fstream = new FileInputStream("Numbers.dat");
		
		DataInputStream inputFile = new DataInputStream(fstream);
		
		System.out.println("Reading numbers from the file:");
		
		while(!endOfFile)
		{
			try 
			{
				number = inputFile.readInt();
				System.out.print(number + " ");
			}
			catch (EOFException e)
			{
				endOfFile = true;
			}
		}
		
		System.out.println("\nDone.");
		inputFile.close();
	}

}
