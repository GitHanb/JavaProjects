package problemDomain;

public class CompSciStudent extends Student
{
	//required hours
	private final int MATH_HOURS = 20;
	private final int CS_HOURS = 40;
	private final int GEN_ED_HOURS = 60;
	
	//hours taken
	private int mathHours;
	private int csHours;
	private int genEdHours;
	
	public CompSciStudent(String name, String idNumber, int yearAdmitted)
	{
		super(name, idNumber, yearAdmitted);
	}

	public void setMathHours(int mathHours)
	{
		this.mathHours = mathHours;
	}



	public void setCsHours(int csHours)
	{
		this.csHours = csHours;
	}



	public void setGenEdHours(int genEdHours)
	{
		this.genEdHours = genEdHours;
	}



	@Override
	public int getRemainingHours()
	{
		int reqHours, remainingHours;
		
		reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
		
		remainingHours = reqHours - (mathHours + csHours + genEdHours);
		
		return remainingHours;
	}
	
	public String toString()
	{
		String str;
		
		str = super.toString() + 
				"\nMajor: Computer Science" + 
				"\nMath Hours Taken: " + mathHours + 
				"\nComputer Science Hours Taken: " + csHours + 
				"\nGeneral Ed Hours Taken: " + genEdHours;
		
		return str;
	}

}
