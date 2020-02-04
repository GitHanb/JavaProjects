import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) throws IOException  {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		//get the file name
		System.out.print("Enter the file name:");
		String filename = keyboard.nextLine();
		
		//open the file
		File file = new File(filename);
		
		if(!file.exists()) {
			System.out.println("The file is not found");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(file);
		
		//read lines from the file until no more are left
		while(inputFile.hasNext()) {
			String friendName = inputFile.nextLine();
			System.out.println(friendName);
		}
		
		//close the file
		inputFile.close();
	}
}
