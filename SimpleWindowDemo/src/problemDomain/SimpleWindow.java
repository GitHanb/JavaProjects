package problemDomain;

import javax.swing.JFrame;

public class SimpleWindow extends JFrame
{
	public SimpleWindow()
	{
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		
		setTitle("A Simple Window");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}
