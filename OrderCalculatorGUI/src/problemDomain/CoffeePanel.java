package problemDomain;

import java.awt.GridLayout;

import javax.swing.*;

public class CoffeePanel extends JPanel
{
	public final double NO_COFFEE = 0.0;
	public final double REGULAR_COFFEE = 1.25;
	public final double DECAF_COFFEE = 1.25;
	public final double CAPPUCCINO = 2.00;
	
	private JRadioButton noCoffee;
	private JRadioButton regularCoffee;
	private JRadioButton decafCoffee;
	private JRadioButton cappuccnio;
	private ButtonGroup bg;
	
	public CoffeePanel()
	{
		setLayout(new GridLayout(4, 1));
		
		noCoffee = new JRadioButton("None");
		regularCoffee = new JRadioButton("Regular Coffee", true);
		decafCoffee = new JRadioButton("Decaf Coffee");
		cappuccnio = new JRadioButton("Cappuccino");
		
		bg = new ButtonGroup();
		bg.add(noCoffee);
		bg.add(regularCoffee);
		bg.add(decafCoffee);
		bg.add(cappuccnio);
		
		setBorder(BorderFactory.createTitledBorder("Coffee"));
		
		add(noCoffee);
		add(regularCoffee);
		add(decafCoffee);
		add(cappuccnio);
	}
	
	public double getCoffeeCost()
	{
		double coffeeCost = 0.0;
		
		if (noCoffee.isSelected())
		{
			coffeeCost = NO_COFFEE;
		}
		else if (regularCoffee.isSelected())
		{
			coffeeCost = REGULAR_COFFEE;
		}
		else if (decafCoffee.isSelected())
		{
			coffeeCost = DECAF_COFFEE;
		}
		else if (cappuccnio.isSelected())
		{
			coffeeCost = CAPPUCCINO;
		}
		
		return coffeeCost;
	}
	
}
