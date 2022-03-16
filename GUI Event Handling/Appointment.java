import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//prepare for event
public class Appointment extends JFrame implements ActionListener {

	JFrame frame;
	JPanel panel;
	JComboBox combo;
	JRadioButton rb1, rb2, rb3;
	JTextField text;
	JButton button;

	Appointment() {
		frame = new JFrame("Appointment Selector");
		panel = new JPanel();

		String days[]= {"Monday","Tuesday","Wednesday","Thursday"};
		combo=new JComboBox(days);
		
		rb1=new JRadioButton("Morning");
		rb2=new JRadioButton("Noon");
		rb3=new JRadioButton("Evening");
		
		ButtonGroup group=new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		
		button = new JButton("Schedule Appointment");
		text=new JTextField(25);
		
		panel.add(combo);
		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);
		panel.add(button);
		panel.add(text);
		
		// listen for event
		button.addActionListener(this);
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	// respond to event
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button) {
			//retrieve values form combo box
			//and radio button and display in the text box
			String day,time="";
			//use getSelectedItem() method to retrieve values from combo box
			day=(String)combo.getSelectedItem();
			//use isSelected() method to check which option has been selected
			if(rb1.isSelected())
				time="morning";
			if(rb2.isSelected())
				time="noon";
			if(rb3.isSelected())
				time="evening";
			//now display these date and time values in the
			//textbox using setText() method
			text.setText("Appointment Scheduled on "+day+" "+time);
		}
	}

	public static void main(String[] args) {
		new Appointment();
	}

}
