package problemDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionMessage
{

	public static void main(String[] args)
	{
		File file;
		Scanner inputFile;
		String fileName;
		
		fileName = JOptionPane.showInputDialog("Enter the name of a file:");
		
		
		try
		{
			file = new File(fileName);
			inputFile = new Scanner(file);
			JOptionPane.showMessageDialog(null, "The file was found.");
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "Done.");
		System.exit(0);
		
		

	}

}
