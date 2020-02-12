package problemDomain;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRandomLetters
{

	public static void main(String[] args) throws IOException
	{
		final int CHAR_SIZE = 2;
		long byteNum;
		char ch;
		
		@SuppressWarnings("resource")
		RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "r");
		
		//move to the chracter 5. 6th character from the beginning of the file
		byteNum = CHAR_SIZE * 5;
		randomFile.seek(byteNum);
		
		ch = randomFile.readChar();
		System.out.println(ch);
		
		//
		byteNum = CHAR_SIZE * 10;
		randomFile.seek(byteNum);
		ch = randomFile.readChar();
		System.out.println(ch);
		
		//
		byteNum = CHAR_SIZE * 3;
		randomFile.seek(byteNum);
		ch = randomFile.readChar();
		System.out.println(ch);
	}

}
