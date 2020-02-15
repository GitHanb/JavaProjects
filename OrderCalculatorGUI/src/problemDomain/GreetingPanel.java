package problemDomain;

import javax.swing.*;

public class GreetingPanel extends JPanel
{
	private JLabel greeting;
	
	public GreetingPanel()
	{
		greeting = new JLabel("Welcome to Henry's Bagel House");
		
		//add label to this panel
		add(greeting);
	}
}
