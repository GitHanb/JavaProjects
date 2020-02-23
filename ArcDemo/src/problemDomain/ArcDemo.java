package problemDomain;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class ArcDemo extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.black);
		g.drawArc(0, 20, 120, 120, 0, 90);
		
		g.setColor(Color.red);
		g.fillArc(140, 20, 120, 120, 0, 90);
		
		g.setColor(Color.green);
		g.drawArc(0, 120, 120, 120, 0, 45);
		
		g.setColor(Color.blue);
		g.fillArc(140, 120, 120, 120, 0, 45);
	}

}
