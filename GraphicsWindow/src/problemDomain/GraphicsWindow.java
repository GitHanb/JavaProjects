package problemDomain;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class GraphicsWindow extends JApplet
{
	private JCheckBox[] checkBoxes;
	
	private String[] titles = {"Line", "Rectange", "Filled Rectangle", "Oval", "Filled Ova", "Arc", "Filled Arc"};
	
	private JPanel checkBoxPanel;
	
	private DrawingPanel drawingPanel;
	
	public void init()
	{
		buildCheckBoxPanel();
		
		drawingPanel = new DrawingPanel(checkBoxes);
		
		add(checkBoxPanel, BorderLayout.EAST);
		add(drawingPanel, BorderLayout.CENTER);
	}

	private void buildCheckBoxPanel()
	{
		checkBoxPanel = new JPanel();
		checkBoxPanel.setLayout(new GridLayout(7, 1));
		
		checkBoxes = new JCheckBox[7];
		
		for (int i=0; i<checkBoxes.length; i++)
		{
			checkBoxes[i] = new JCheckBox(titles[i]);
			checkBoxes[i].addItemListener(new CheckBoxListener());
			checkBoxPanel.add(checkBoxes[i]);
		}
		
	}
	
	private class CheckBoxListener implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
			drawingPanel.repaint();
			
		}
		
	}
	
}
