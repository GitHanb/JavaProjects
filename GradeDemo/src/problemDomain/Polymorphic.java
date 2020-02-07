package problemDomain;

public class Polymorphic
{

	public static void main(String[] args)
	{
		GradeActivity[] tests = new GradeActivity[3];
		
		tests[0] = new GradeActivity();
		tests[0].setScore(95);
		
		tests[1] = new PassFailExam(20, 6, 60);
		
		tests[2] = new FinalExam(50, 7);
		
		for(int i = 0; i < tests.length; i++)
		{
			System.out.println("Test " + (i+1) + 
					": score " + tests[i].getScore() + 
					", grade " + tests[i].getGrade());
		}

	}

}
