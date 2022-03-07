import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class GP6 {
	JFrame frame;
	JPanel panel;
	JRadioButton creditCardRadioButton, billCustomerRadioButton;
	JList cardTypeList;
	JTextField cardNumberTextField;
	JComboBox monthComboBox, yearComboBox;
	JCheckBox verifiedCheckBox;
	JButton acceptButton, exitButton;
	JLabel billingLabel, cardTypeLabel, cardNumberLabel, expirationDateLabel;

	GP6() {
		frame = new JFrame("Payment Info");
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		// use Gridbag constraints to position the elements
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);

		// Billing area
		billingLabel = new JLabel("Billing:");
		ButtonGroup billingGroup = new ButtonGroup();
		// credit card radio button
		creditCardRadioButton = new JRadioButton("Credit card", true);
		billingGroup.add(creditCardRadioButton);

		// bill customer radio button
		billCustomerRadioButton = new JRadioButton("Bill customer");
		billingGroup.add(billCustomerRadioButton);

		// position billing label
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.EAST;
		panel.add(billingLabel, constraints);

		// position radio button 1
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.WEST;
		panel.add(creditCardRadioButton, constraints);

		// position radio button 2
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.WEST;
		panel.add(billCustomerRadioButton, constraints);

		// card type label
		cardTypeLabel = new JLabel("Card type:");
		// position card type label
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.EAST;
		panel.add(cardTypeLabel, constraints);

		// card type list
		String[] cardNames = { "Visa", "Master Card", "American Express", "Other" };
		cardTypeList = new JList(cardNames);
		// position card type list
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.gridwidth = 2;
		panel.add(cardTypeList, constraints);
		constraints.gridwidth = 1;

		// card number label
		cardNumberLabel = new JLabel("Card number:");
		// position card number label
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.EAST;
		panel.add(cardNumberLabel, constraints);

		// card number text field
		cardNumberTextField = new JTextField(15);
		// position card number text field
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.WEST;
		constraints.gridwidth = 2;
		panel.add(cardNumberTextField, constraints);
		constraints.gridwidth = 1;

		// expiration date label
		expirationDateLabel = new JLabel("Expiration date:");
		// position expiration date label
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.EAST;
		panel.add(expirationDateLabel, constraints);

		// month combo box
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		monthComboBox = new JComboBox(months);
		// position month combo box
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.WEST;
		panel.add(monthComboBox, constraints);

		// year combo box
		String[] years = { "2011", "2012", "2013", "2014", "2015", "2016" };
		yearComboBox = new JComboBox(years);
		// position year combo box
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.WEST;
		panel.add(yearComboBox, constraints);

		
		
		  // verified check box
        verifiedCheckBox = new JCheckBox("Verified");
    	// position verfified check box
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.anchor = GridBagConstraints.CENTER;
		panel.add(verifiedCheckBox , constraints);
		
        // calculate button
        acceptButton = new JButton("Accept");
       	// position calculate button
    		constraints.gridx = 1;
    		constraints.gridy = 5;
    		constraints.anchor = GridBagConstraints.CENTER;
    		panel.add( acceptButton , constraints);

        // exit button
        exitButton = new JButton("Exit");
       	// position exit button
    		constraints.gridx = 2;
    		constraints.gridy = 5;
    		constraints.anchor = GridBagConstraints.CENTER;
    		panel.add(exitButton , constraints);
        
        
		// add the panel to this frame
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

}

public class P6 {
	public static void mainn(String[] args) {
		new GP6();
	}
}