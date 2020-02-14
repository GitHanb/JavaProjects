package problemDomain;

import java.awt.GridLayout;

import javax.swing.*;

public class GridWindow extends JFrame
{
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public GridWindow()
	{
		setTitle("Grid Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 3));
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 5");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
		new GridWindow();

	}

}
