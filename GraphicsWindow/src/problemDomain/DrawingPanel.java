package problemDomain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel
{
	private JCheckBox[] checkBoxArray;
	
	public DrawingPanel(JCheckBox[] cbArray)
	{
		checkBoxArray = cbArray;
		
		setBackground(Color.white);
		
		setPreferredSize(new Dimension(300, 200));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if (checkBoxArray[0].isSelected())
		{
			g.setColor(Color.black);
			g.drawLine(0, 10, 290, 190);
		}
		if (checkBoxArray[1].isSelected())
		{
			g.setColor(Color.black);
			g.drawRect(20, 20, 50, 50);
		}
		if (checkBoxArray[2].isSelected())
		{
			g.setColor(Color.red);
			g.fillRect(50, 30, 120, 120);
		}
		if (checkBoxArray[3].isSelected())
		{
			g.setColor(Color.black);
			g.drawOval(40, 155, 75, 50);
		}
		if (checkBoxArray[4].isSelected())
		{
			g.setColor(Color.blue);
			g.fillOval(200, 125, 75, 50);
		}
		if (checkBoxArray[5].isSelected())
		{
			g.setColor(Color.black);
			g.drawArc(200, 40, 75, 50, 0, 90);
		}
		if (checkBoxArray[6].isSelected())
		{
			g.setColor(Color.green);
			g.fillArc(100, 155, 75, 50, 0, 90);
		}
	}
}
