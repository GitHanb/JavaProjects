package problemDomain;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class KiloConverter extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 100;
	
	public KiloConverter() throws HeadlessException
	{
		setTitle("Kilometer Converter");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}

	private void buildPanel()
	{
		messageLabel = new JLabel("Enter a distance in kilometers");
		
		kiloTextField = new JTextField(10);
		
		calcButton = new JButton("Calculate");
		
		calcButton.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);	
	}
	
	private class CalcButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			final double CONVERSION = 0.6214;
			String input;
			double miles;
			
			input = kiloTextField.getText();
			
			miles = Double.parseDouble(input) * CONVERSION;
			
			JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles.");
			
		}
		
	}

	public static void main(String[] args)
	{
		new KiloConverter();
	}
}
