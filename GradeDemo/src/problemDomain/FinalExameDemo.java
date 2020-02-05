package problemDomain;

import javax.swing.JOptionPane;

public class FinalExameDemo
{

	public static void main(String[] args)
	{
		String input;
		int questions;
		int missed;
		
		input = JOptionPane.showInputDialog("How many questions are on the final exam?");
		
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("How mnay questions did the student miss?");
		
		missed = Integer.parseInt(input);
		
		FinalExam exam = new FinalExam(questions, missed);
		
		JOptionPane.showMessageDialog(null, "Each question counts " + exam.getPointsEach() + 
				" points.\nThe exam score is " + exam.getScore() + 
				"\nThe exam grade is " + exam.getGrade());

	}

}
