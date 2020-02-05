package problemDomain;

import javax.swing.JOptionPane;

public class GradeDemo
{

	public static void main(String[] args)
	{
		String input;
		double testScore;
		
		GradeActivity grade = new GradeActivity();
		
		input = JOptionPane.showInputDialog("Enter a numeric test score.");
		
		testScore = Double.parseDouble(input);
		
		grade.setScore(testScore);
		
		JOptionPane.showMessageDialog(null, "The grade for that test is " + grade.getGrade());
		
		System.exit(0);

	}

}
