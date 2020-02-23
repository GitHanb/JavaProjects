package problemDomain;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class OvalDemo extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.black);
		g.drawOval(20, 20, 120, 75);
		
		g.setColor(Color.green);
		g.fillOval(80, 160, 180, 75);
	}
}
