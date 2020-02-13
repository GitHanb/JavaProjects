package problemDomain;

import java.awt.FlowLayout;

import javax.swing.*;

public class FlowWindow extends JFrame
{
	private final int WINDOW_WIDTH = 200;
	private final int WINDOW_HEIGHT = 105;
	
	public FlowWindow()
	{
		setTitle("Flow Layout");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 7));
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
		add(button1);
		add(button2);
		add(button3);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		
		new FlowWindow();
	}

}
