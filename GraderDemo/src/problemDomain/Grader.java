package problemDomain;

public class Grader {
	private double[] testScores;
	
	//constructor
	public Grader(double[] scoreArray) {
		testScores = scoreArray;
	}
	
	//get lowest test score
	public double getLowestScore() {
		double lowest;
		lowest = testScores[0];
		
		for(int i=0; i<testScores.length; i++) {
			if(testScores[i] < lowest) {
				lowest = testScores[i];
			}
		}
		return lowest;
	}
	
	//get average
	public double getAverage() {
		double total = 0;
		double lowest;
		double average;
		
		if(testScores.length < 2) {
			System.out.println("Error: you must have at least two test scores!");
			average = 0;
		} else {
			for(double score: testScores) {
				total += score;
			}
			
			lowest = getLowestScore();
			
			total -= lowest;
			
			average = total / (testScores.length - 1);
		}
		return average;
	}
	
	
}
