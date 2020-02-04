package problemDomain;

import java.util.Scanner;

public class CalcAverage {

	public static void main(String[] args) {
		int numScores;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many test scores do you have?");
		numScores = keyboard.nextInt();
		
		double[] scores = new double[numScores];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("Enter score #" + (i+1) + ":");
			scores[i] = keyboard.nextDouble();
		}
		
		Grader myGrader = new Grader(scores);
		
		System.out.println("Your adjusted average is " + myGrader.getAverage());
		
		System.out.println("Your lowest test score was " + myGrader.getLowestScore());

	}

}
