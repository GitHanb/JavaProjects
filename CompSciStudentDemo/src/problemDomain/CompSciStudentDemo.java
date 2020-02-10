package problemDomain;

public class CompSciStudentDemo
{

	public static void main(String[] args)
	{
		CompSciStudent csStudent = new CompSciStudent("Henr Han", "9527", 2009);
		
		csStudent.setMathHours(12);
		csStudent.setCsHours(20);
		csStudent.setGenEdHours(40);
		
		System.out.println(csStudent);
		
		System.out.println("Hours remaining: " + csStudent.getRemainingHours());

	}

}
