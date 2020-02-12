package problemDomain;

import javax.swing.JFrame;

public class EmbeddedMain extends JFrame
{
	final int WINDOW_WIDTH = 350;
	final int WINDOW_HEIGHT = 250;
	
	public EmbeddedMain()
	{
		setTitle("A Simple Window");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		EmbeddedMain em = new EmbeddedMain();
	}
}
