package problemDomain;

import java.awt.GridLayout;

import javax.swing.*;

public class ToppingPanel extends JPanel
{
	public final double CREAM_CHEESE = 0.50;
	public final double BUTTER = 0.25;
	public final double PEACH_JELLY = 0.75;
	public final double BLUEBERRY_JAM = 0.75;
	
	private JCheckBox creamCheese;
	private JCheckBox butter;
	private JCheckBox peachJelly;
	private JCheckBox blueberryJam;
	
	public ToppingPanel()
	{
		setLayout(new GridLayout(4, 1));
		
		creamCheese = new JCheckBox("Cream Cheese");
		butter = new JCheckBox("Butter");
		peachJelly = new JCheckBox("Peach Jelly");
		blueberryJam = new JCheckBox("Blueberry Jam");
		
		add(creamCheese);
		add(butter);
		add(peachJelly);
		add(blueberryJam);
	}
	
	public double getToppingCost()
	{
		double toppingCost = 0;
		
		if(creamCheese.isSelected())
		{
			toppingCost += CREAM_CHEESE;
		}
		
		if(butter.isSelected())
		{
			toppingCost += BUTTER;
		}
		
		if(peachJelly.isSelected())
		{
			toppingCost += PEACH_JELLY;
		}
		
		if(blueberryJam.isSelected())
		{
			toppingCost += BLUEBERRY_JAM;
		}
		
		
		return toppingCost;
	}
}
