package problemDomain;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class PolygonDemo extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		int[] xCoords = {60, 100, 140, 140, 100, 60, 20, 20};
		int[] yCoords = {20, 20, 60, 100, 140, 140, 100, 60};
		
		super.paint(g);
		
		g.setColor(Color.red);
		
		g.fillPolygon(xCoords, yCoords, 8);
		
		g.setColor(Color.white);
		
		g.setFont(new Font("SanSerif", Font.BOLD, 35));
		g.drawString("STOP", 35, 95);
	}
}
