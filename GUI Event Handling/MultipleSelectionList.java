
//multiple selection list
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

public class MultipleSelectionList extends JFrame {

	JFrame frame;
	JPanel monthPanel;// panel1
	JPanel selectedMonthPanel;// panel2
	JPanel buttonPanel;// panel3

	JList monthList;// to hold months
	JList selectedMonthList;// to hold months selected by user--second list

	JScrollPane scrollPane1;// scroll for first list box
	JScrollPane scrollPane2;// scroll for second list box

	JButton button;// to be added to panel3

	String[] months = { "January", "February", "March", "April", "May", "June", "July", "August" };

	// constructor
	MultipleSelectionList() {
		frame = new JFrame("Multiple Seelction");
		frame.setSize(400, 300);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		// call the functions to create controls
		buildMonthPanel();
		buildSelectedMonthPanel();
		buildButtonPanel();
		// add to frame
		frame.add(monthPanel, BorderLayout.NORTH);
		frame.add(selectedMonthPanel, BorderLayout.CENTER);
		frame.add(buttonPanel,BorderLayout.SOUTH);

	}

	// design monthPanel with list box
	// panel 1
	public void buildMonthPanel() {
		// create a panel to hold the list
		monthPanel = new JPanel();
		// create the list
		monthList = new JList(months);
		// set the selection mode to single selection
		monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		// set how many items needs to be displayed
		monthList.setVisibleRowCount(5);
		// add list to scrollpane
		scrollPane1 = new JScrollPane(monthList);
		// add scrollpane to panel
		monthPanel.add(scrollPane1);

	}

	// design a panel to hold second list box
	// panel 2
	public void buildSelectedMonthPanel() {
		selectedMonthPanel = new JPanel();
		// create the list
		selectedMonthList = new JList();
		// set how many items needs to be displayed
		selectedMonthList.setVisibleRowCount(5);
		// add list to scrollpane
		scrollPane2 = new JScrollPane(selectedMonthList);
		// add scrollpane to panel
		selectedMonthPanel.add(scrollPane2);

	}
	
	//panel 3
	//button
	public void buildButtonPanel()
	{
		buttonPanel=new JPanel();
		//create the button
		button=new JButton("Get Selections");
		//add lstener to button
		button.addActionListener(new ButtonListener());
		//add button to buttonpanel
		buttonPanel.add(button);
	}
	//design the Buttonlistener class
	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//get selected values from first list box
			Object[] selections=monthList.getSelectedValues();
			//store/display items in the second list box
			selectedMonthList.setListData(selections);
		}
	}
	


	public static void main(String[] args) {
		new MultipleSelectionList();

	}

}
