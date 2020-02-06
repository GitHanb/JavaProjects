package problemDomain;

public class FinalExam2 extends GradeActivity2
{
	private int numQuestions; 	//number of questions
	private double pointsEach;	//points for each question
	private int numMissed;		//number of questions missed
	
	public FinalExam2(int questions, int missed)
	{
		double numericScore;
		this.numQuestions = questions;
		this.numMissed = missed;
		
		pointsEach = 100.0/questions;
		numericScore = 100.0 - (missed * pointsEach);
		
		setScore(numericScore);
		adjustScore();
	}
	
	public double getPointsEach()
	{
		return pointsEach;
	}
	
	public int getNumMissed()
	{
		return numMissed;
	}

	private void adjustScore()
	{
		double fraction;
		
		fraction = score - (int)score;
		
		if(fraction >= 0.5)
		{
			score = score + (1.0 - fraction);
		}
	}
}
