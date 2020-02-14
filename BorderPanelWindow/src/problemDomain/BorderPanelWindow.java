package problemDomain;

import java.awt.BorderLayout;

import javax.swing.*;

public class BorderPanelWindow extends JFrame
{

	public BorderPanelWindow()
	{
		setTitle("Border Layout");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		JButton button1 = new JButton("North Button");
		JButton button2 = new JButton("South Button");
		JButton button3 = new JButton("East Button");
		JButton button4 = new JButton("West Button");
		JButton button5 = new JButton("Center Button");
		
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		panel5.add(button5);
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		add(panel3, BorderLayout.EAST);
		add(panel4, BorderLayout.WEST);
		add(panel5, BorderLayout.CENTER);
		
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new BorderPanelWindow();

	}

}
