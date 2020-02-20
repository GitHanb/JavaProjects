package problemDomain;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AWTTempConverter extends Applet
{
	private JPanel fPanel;
	private JPanel cPanel;
	private JPanel buttonPanel;
	private JTextField fahrenheit;
	private JTextField celsius;
	
	public void init()
	{
		buildFpanel();
		
		buildCpanel();
		
		buildButtonPanel();
		
		setLayout(new GridLayout(3, 1));
		
		add(fPanel);
		add(cPanel);
		add(buttonPanel);
	}

	private void buildFpanel()
	{
		fPanel = new JPanel();
		
		JLabel message = new JLabel("Fahrenheit Temperature:");
		
		fahrenheit = new JTextField(10);
		
		fPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		fPanel.add(message);
		fPanel.add(fahrenheit);
	}

	private void buildCpanel()
	{
		cPanel = new JPanel();
		
		JLabel message2 = new JLabel("Celsius Temperature:");
		
		celsius = new JTextField(10);
		
		celsius.setEditable(false);
		
		cPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		cPanel.add(message2);
		cPanel.add(celsius);
		
	}
	
	private void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		
		JButton convButton = new JButton("Convert");
		
		convButton.addActionListener(new ButtonListener());
		
		buttonPanel.add(convButton);
		
	}
	
	private class ButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			double ftemp, ctemp;
			
			ftemp = Double.parseDouble(fahrenheit.getText());
			
			ctemp = (5.0 / 9.0) * (ftemp - 32);
			
			celsius.setText(String.format("%.1f", ctemp));
			
		}
		
	}
	
	
	
}
