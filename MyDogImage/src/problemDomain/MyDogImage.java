package problemDomain;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyDogImage extends JFrame
{
	private JPanel imagePanel;
	private JPanel buttonPanel;
	private JLabel imageLabel;
	private JButton button;
	
	public MyDogImage()
	{
		setTitle("My Dog");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buildImagePanel();
		
		buildButtonPanel();
		
		add(imagePanel, BorderLayout.CENTER);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		
		setVisible(true);
	}
	
	private void buildImagePanel()
	{
		imagePanel = new JPanel();
		
		imageLabel = new JLabel("Click the button to see an image of my dog.");
		
		imagePanel.add(imageLabel);
		
	}

	private void buildButtonPanel()
	{
		ImageIcon smileyImage;
		
		buttonPanel = new JPanel();
		
		smileyImage = new ImageIcon("Smiley.gif");
		
		button = new JButton("Get Image");
		
		button.setIcon(smileyImage);
		
		button.addActionListener(new ButtonListener());
		
		button.setToolTipText("click to get image.");
		
		buttonPanel.add(button);
		
	}
	
	private class ButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			ImageIcon dogImage = new ImageIcon("Dog.jpg");
			
			imageLabel.setIcon(dogImage);
			
			imageLabel.setText(null);
			
			pack();
			
		}
		
	}

	public static void main(String[] args)
	{
		new MyDogImage();
	}

}
