package problemDomain;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ColorCheckBoxWindow extends JFrame
{
	private JLabel messageLabel;
	private JCheckBox yellowCheckBox;
	private JCheckBox redCheckBox;
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 100;
	
	public ColorCheckBoxWindow()
	{
		setTitle("Color Check Window");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel("Select the check boxes to change colors.");
		
		yellowCheckBox = new JCheckBox("Yellow Background");
		redCheckBox = new JCheckBox("Red foreground");
		
		yellowCheckBox.addItemListener(new CheckBoxListener());
		redCheckBox.addItemListener(new CheckBoxListener());
		
		//yellowCheckBox.doClick();
		
		setLayout(new FlowLayout());
		
		add(messageLabel);
		add(yellowCheckBox);
		add(redCheckBox);
		
		setVisible(true);
		
		
	}
	
	private class CheckBoxListener implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getSource() == yellowCheckBox)
			{
				if(yellowCheckBox.isSelected())
				{
					getContentPane().setBackground(Color.YELLOW);
					yellowCheckBox.setBackground(Color.YELLOW);
					redCheckBox.setBackground(Color.YELLOW);
				}
				else
				{
					getContentPane().setBackground(Color.LIGHT_GRAY);
					yellowCheckBox.setBackground(Color.LIGHT_GRAY);
					redCheckBox.setBackground(Color.LIGHT_GRAY);
				}
			}
			else if(e.getSource() == redCheckBox)
			{
				if(redCheckBox.isSelected())
				{
					getContentPane().setForeground(Color.RED);
					yellowCheckBox.setForeground(Color.RED);
					redCheckBox.setForeground(Color.RED);
				}
				else
				{
					getContentPane().setForeground(Color.BLACK);
					yellowCheckBox.setForeground(Color.BLACK);
					redCheckBox.setForeground(Color.BLACK);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		new ColorCheckBoxWindow();

	}

}
