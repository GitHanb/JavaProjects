package problemDomain;

import java.awt.*;

import javax.swing.*;

public class SimpleApplet extends JApplet
{
	public void init()
	{
		JLabel label = new JLabel("This is my very first applet.");
		setLayout(new FlowLayout());
		
		add(label);
	}
}
