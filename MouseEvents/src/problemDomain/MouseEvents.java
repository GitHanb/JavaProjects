package problemDomain;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
import javax.swing.JTextField;

public class MouseEvents extends JApplet
{
	private JTextField[] mouseStates;
	private String[] text = {"Presses", "Clicked", "Released", "Entered", 
								"Exited", "Dragged", "X:", "Y:"};
	
	public void init()
	{
		setLayout(new FlowLayout());
		
		mouseStates = new JTextField[8];
		
		for(int i=0; i<mouseStates.length; i++)
		{
			mouseStates[i] = new JTextField(text[i], 10);
			mouseStates[i].setEditable(false);
			add(mouseStates[i]);
		}
		
		addMouseListener(new MyMouseListener());
		
		addMouseMotionListener(new MyMouseMotionListener());
	}
	
	public void clearTextFields()
	{
		for(int i=0; i<6; i++)
		{
			mouseStates[i].setBackground(Color.lightGray);
		}
	}
	
	private class MyMouseListener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e)
		{
			clearTextFields();
			mouseStates[0].setBackground(Color.yellow);	
		}

		@Override
		public void mousePressed(MouseEvent e)
		{
			clearTextFields();
			mouseStates[1].setBackground(Color.yellow);
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			clearTextFields();
			mouseStates[2].setBackground(Color.yellow);
		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
			clearTextFields();
			mouseStates[3].setBackground(Color.yellow);
		}

		@Override
		public void mouseExited(MouseEvent e)
		{
			clearTextFields();
			mouseStates[4].setBackground(Color.yellow);
		}
		
	}
	
	private class MyMouseMotionListener implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent e)
		{
			clearTextFields();
			mouseStates[5].setBackground(Color.yellow);
			
		}

		@Override
		public void mouseMoved(MouseEvent e)
		{
			mouseStates[6].setText("X: " + e.getX());
			mouseStates[7].setText("Y: " + e.getY());
		}
		
	}
}
