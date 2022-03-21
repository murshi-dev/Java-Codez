//create a list box 
//items selected in lust box shoul, be displayed in textfield
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
public class ListDisplay extends JFrame {
	
	JFrame frame;
	JPanel monthPanel;
	JPanel selectedMonthPanel;
	JList monthList;
	JTextField selectedMonth;
	JLabel label;
	String[] months= {"January","February","March","April","May","June","July","August"};
	
	JScrollPane scrollPane;
	
	//constructor
	ListDisplay()
	{
		frame=new JFrame("List Demo");
		frame.setSize(400,300);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		//call the functions to create controls
		buildMonthPanel();
		buildSelectedMonthPanel();
		//add to frame
		frame.add(monthPanel,BorderLayout.CENTER);
		frame.add(selectedMonthPanel,BorderLayout.SOUTH);
		
	}
	//design monthPanel with list box
	public void buildMonthPanel()
	{
		//create a panel to hold the list
		monthPanel=new JPanel();
		//create the list
		monthList=new JList(months);
		//set the selection mode to single selection
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//register the listener
		monthList.addListSelectionListener(new ListListener());
	
		
		//add scroll bar to list
		//set how many items needs to be displayed
		monthList.setVisibleRowCount(5);
		//add list to scrollpane
		scrollPane=new JScrollPane(monthList);
		//add scrollpane to panel
		monthPanel.add(scrollPane);
		
		
	}
	//design a panel to hold label and textbox
	public void buildSelectedMonthPanel()
	{
		//create a panel to hold textfield
		selectedMonthPanel=new JPanel();
		//create label
		label=new JLabel("You selected:");
		//create text field
		selectedMonth=new JTextField(10);
		//set to non editable
		selectedMonth.setEditable(false);
		//add thses two to the panel
		selectedMonthPanel.add(label);
		selectedMonthPanel.add(selectedMonth);
	}
	//create a class to implement actionlistener
	 class ListListener implements ListSelectionListener 
	 {
		 //similar to actionPerformed() --here it is valueChanged()
		 //similar to ActionEvent -- here it is ListSelectionEvent
		 public void valueChanged(ListSelectionEvent e)
		 {
			 //write codes to retrieve values from list and display in text box
			 //get the selected month
			 //type cast to string
			 String selection=(String)monthList.getSelectedValue();
			 //set the textbox value
				selectedMonth.setText(selection);
			 
		 }
	 }
	
	public static void main(String[] args) {
		
		new ListDisplay();
	}

}
