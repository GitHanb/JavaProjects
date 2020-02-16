package problemDomain;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListWindow extends JFrame
{
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JList monthList;
	private JTextField selectedMonth;
	private JLabel label;
	
	private String[] months = {"January", "February", "March", 
								"April", "May", "June", 
								"July", "August", "September", 
								"October", "November", "December"};
	
	public ListWindow()
	{
		setTitle("List Demo");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buidMonthPanel();
		
		buildSelectedMonthPanel();
		
		add(monthPanel, BorderLayout.CENTER);
		add(selectedMonthPanel, BorderLayout.SOUTH);
		
		pack();
		
		setVisible(true);
	}
	
	

	private void buidMonthPanel()
	{
		monthPanel = new JPanel();
		
		monthList = new JList(months);
		
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		monthList.addListSelectionListener(new ListListener());
		
		monthPanel.add(monthList);
		
	}
	
	private void buildSelectedMonthPanel()
	{
		selectedMonthPanel = new JPanel();
		
		label = new JLabel("You selected: ");
		
		selectedMonth = new JTextField(10);
		
		selectedMonth.setEditable(false);
		
		selectedMonthPanel.add(label);
		selectedMonthPanel.add(selectedMonth);
		
	}
	
	private class ListListener implements ListSelectionListener
	{

		@Override
		public void valueChanged(ListSelectionEvent e)
		{
			String selection = (String) monthList.getSelectedValue();
			
			selectedMonth.setText(selection);
		}
		
	}

	public static void main(String[] args)
	{
		new ListWindow();

	}

}
