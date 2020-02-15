package problemDomain;

import java.awt.*;

import javax.swing.*;

public class BagelPanel extends JPanel
{
	public final double WHITE_BAGEL = 1.25;
	public final double WHEAT_BAGEL = 1.50;
	
	private JRadioButton whiteBagel;
	private JRadioButton wheatBagel;
	private ButtonGroup bg;
	
	public BagelPanel()
	{
		setLayout(new GridLayout(2,1));
		
		whiteBagel = new JRadioButton("White", true);
		wheatBagel = new JRadioButton("Wheat");
		
		bg = new ButtonGroup();
		bg.add(whiteBagel);
		bg.add(wheatBagel);
		
		setBorder(BorderFactory.createTitledBorder("Bagel"));
		
		add(whiteBagel);
		add(wheatBagel);
	}
	
	public double getBagelCost()
	{
		double bagelCost = 0;
		
		if(whiteBagel.isSelected())
		{
			bagelCost = WHITE_BAGEL;
		}
		else
		{
			bagelCost = WHEAT_BAGEL;
		}
		
		return bagelCost;
	}
}
