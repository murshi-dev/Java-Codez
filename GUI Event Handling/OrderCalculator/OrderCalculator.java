import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//call all the panels and placfe them here
public class OrderCalculator extends JFrame implements ActionListener {
	GreetingsPanel greetpanel;
	BagelPanel bagelpanel;
	Coffeepanel coffeepanel;
	ToppingsPanel toppingpanel;

	// buttons and display
	JButton calculate, exit;
	JLabel display;// to display total value
	// create a panel for the buttons
	JPanel buttonpanel;
	JFrame frame;

	// constructor
	OrderCalculator() {
		frame = new JFrame();
		greetpanel = new GreetingsPanel();
		bagelpanel = new BagelPanel();
		coffeepanel = new Coffeepanel();
		toppingpanel = new ToppingsPanel();

		buttonpanel = new JPanel();
		calculate = new JButton("Calculate");
		exit = new JButton("Exit");
		display = new JLabel("");
		// set layout
		buttonpanel.setLayout(new GridLayout(3, 1));
		// add button and display to button panel
		buttonpanel.add(calculate);
		buttonpanel.add(exit);
		buttonpanel.add(display);

		// now place all panels in border layout
		setLayout(new BorderLayout());
		frame.add(greetpanel, BorderLayout.NORTH);
		frame.add(bagelpanel, BorderLayout.WEST);
		frame.add(toppingpanel, BorderLayout.CENTER);
		frame.add(coffeepanel, BorderLayout.EAST);
		frame.add(buttonpanel, BorderLayout.SOUTH);

		calculate.addActionListener(this);
		exit.addActionListener(this);

		frame.setSize(300, 400);
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		double total = 0.0;
		double subtotal = 0.0;
		if (ae.getSource() == calculate) {
			// retrieve values from bagelpanel,toppingpanel and coffeepanel
			subtotal = bagelpanel.getBagelCost() + 
					toppingpanel.getToppingCost() + 
					coffeepanel.getCoffeeCost();
			// calculate total with tax 6%
			total = subtotal + (subtotal * 0.06);

			// display total in the display label
			display.setText("Amount Payable: RM " + total);
		}
		if (ae.getSource() == exit)
		{
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new OrderCalculator();

	}

}
