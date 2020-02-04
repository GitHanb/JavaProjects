import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		String filename;
		String friendName;
		int numFriends;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		//get the number of friends
		System.out.print("How many friends do you have?");
		numFriends = keyboard.nextInt();
		
		//consume the remaining newline character
		keyboard.nextLine();
		
		//get the filename
		System.out.print("Enter the file name:");
		filename = keyboard.nextLine();
		
		//open the file
		PrintWriter outputFile = new PrintWriter(filename);
		
		
		//get data and write it to the file
		for (int i=1; i<=numFriends; i++) {
			System.out.print("Enter the name of friend "+"number "+i+": ");
			friendName = keyboard.nextLine();
			outputFile.println(friendName);
		}
		
		//close the file
		outputFile.close();
		System.out.println("Data written to the file");
		
	}

}
