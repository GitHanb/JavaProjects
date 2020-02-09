package problemDomain;

public class FinalExam3 extends GradeActivity implements Relatable
{
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam3(int questions, int missed)
	{
		double numericScore;
		
		numQuestions = questions;
		numMissed = missed;
		
		pointsEach = 100.0 / questions;
		numericScore = 100.0 - (missed  * pointsEach);
		
		setScore(numericScore);
	}
	
	public double getPointsEach()
	{
		return pointsEach;
	}
	
	public int getNumMissed()
	{
		return numMissed;
	}
	
	@Override
	public boolean equals(GradeActivity g)
	{
		boolean status;
		
		if(this.getScore() == g.getScore())
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}

	@Override
	public boolean isGreater(GradeActivity g)
	{
		boolean status;
		
		if(this.getScore() > g.getScore())
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}

	@Override
	public boolean isLess(GradeActivity g)
	{
		boolean status;
		
		if(this.getScore() < g.getScore())
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}

}
