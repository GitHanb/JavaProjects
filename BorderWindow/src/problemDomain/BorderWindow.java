package problemDomain;

import java.awt.BorderLayout;

import javax.swing.*;

public class BorderWindow extends JFrame
{
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 300;
	
	public BorderWindow()
	{
		setTitle("Border Layout");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JButton button1 = new JButton("North Button");
		JButton button2 = new JButton("South Button");
		JButton button3 = new JButton("East Button");
		JButton button4 = new JButton("West Button");
		JButton button5 = new JButton("Center Button");
		
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.EAST);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
		new BorderWindow();

	}

}
