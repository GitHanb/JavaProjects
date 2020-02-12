package problemDomain;

import javax.swing.JFrame;

public class ShowWindow
{

	public static void main(String[] args)
	{
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		
		
		//create a window
		JFrame window = new JFrame();
		
		//set title
		window.setTitle("A Simple Window");
		
		//set size
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		//specify what happens when the close button is clicked
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//display the window
		window.setVisible(true);

	}

}
