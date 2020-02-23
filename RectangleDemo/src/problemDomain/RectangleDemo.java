package problemDomain;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class RectangleDemo extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.black);
		g.drawRect(20, 20, 120, 120);
		
		g.setColor(Color.red);
		g.fillRect(160, 160, 120, 120);
	}
	
}
