package problemDomain;

import java.io.IOException;

public class TestAverage
{

	public static void main(String[] args) throws IOException
	{
		double average;
		int studentNumber = 1;
		
		TestScoreReader scoreReader = new TestScoreReader("Grades.csv");
		
		while(scoreReader.readNextLine())
		{
			average = scoreReader.getAverage();
		
			System.out.println("Average for student " + studentNumber + " is " + average);
			
			studentNumber++;
		}
		
		scoreReader.close();
		System.out.println("No more scores.");

	}

}
