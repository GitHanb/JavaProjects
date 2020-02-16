package problemDomain;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MultipleIntervalSelection extends JFrame
{
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JPanel buttonPanel;
	private JList monthList;
	private JList selectedMonthList;
	
	private JScrollPane scrollPane1;
	private JScrollPane scrollPane2;
	
	private JButton button;
	
	private String[] months = {"January", "February", "March", 
			"April", "May", "June", 
			"July", "August", "September", 
			"October", "November", "December"};
	
	public MultipleIntervalSelection() throws HeadlessException
	{
		setTitle("List Demo");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buildMonthPanel();
		
		buildSelectedMonthPanel();
		
		buildButtonPanel();
		
		add(monthPanel, BorderLayout.NORTH);
		
		add(selectedMonthPanel, BorderLayout.CENTER);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		
		setVisible(true);
		
		
	}

	private void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		
		button = new JButton("Get Selections");
		
		button.addActionListener(new ButtonListener());
		
		buttonPanel.add(button);
		
	}

	private void buildSelectedMonthPanel()
	{
		selectedMonthPanel = new JPanel();
		
		selectedMonthList = new JList();
		
		selectedMonthList.setVisibleRowCount(6);
		
		scrollPane2 = new JScrollPane(selectedMonthList);
		
		selectedMonthPanel.add(scrollPane2);
		
	}

	private void buildMonthPanel()
	{
		monthPanel = new JPanel();
		
		monthList = new JList(months);
		
		monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		monthList.setVisibleRowCount(6);
		
		scrollPane1 = new JScrollPane(monthList);
		
		monthPanel.add(scrollPane1);
		
		
	}
	
	private class ButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			Object[] selections = monthList.getSelectedValues();
			
			selectedMonthList.setListData(selections);
			
		}
		
	}

	public static void main(String[] args)
	{
		new MultipleIntervalSelection();

	}

}
