package problemDomain;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class LineDemo extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.red);
		g.drawLine(20, 20, 280, 280);
		
		g.setColor(Color.blue);
		g.drawLine(280, 20, 20, 280);
	}

}
