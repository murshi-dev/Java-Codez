import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculatorGUI extends JFrame implements ActionListener {
	JFrame frame;
	JPanel panel;
	// for numbers 0 to 9
	JButton b[] = new JButton[10];
	//for other arithmetic buttons
	JButton add, subtract, multiply, divide, equalto, clear;
	int i, r, firstnumber, secondnumber;
	JTextField result;
	char op;

	public CalculatorGUI() {
		
		frame=new JFrame("Calculator");
		frame.setLayout(new BorderLayout());
		panel = new JPanel();
		//GridLayout(int rows, int columns, int hgap, int vgap)
		//creates a grid layout with the given rows and columns along with given horizontal and vertical gaps.
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		for (int i = 0; i <= 9; i++) {
			b[i] = new JButton(i + "");
			b[i].setFont(new Font("Arial", Font.PLAIN, 25));
			b[i].setBounds(10,40,50,20);
			panel.add(b[i]);
			b[i].addActionListener(this);
		}
		add = new JButton("+");
		add.setFont(new Font("Arial", Font.PLAIN, 25));
		panel.add(add);
		add.addActionListener(this);

		subtract = new JButton("-");
		subtract.setFont(new Font("Arial", Font.PLAIN, 25));
		panel.add(subtract);
		subtract.addActionListener(this);

		multiply = new JButton("*");
		multiply.setFont(new Font("Arial", Font.PLAIN, 25));
		panel.add(multiply);
		multiply.addActionListener(this);

		divide = new JButton("/");
		divide.setFont(new Font("Arial", Font.PLAIN, 25));
		panel.add(divide);
		divide.addActionListener(this);

		equalto = new JButton("=");
		equalto.setFont(new Font("Arial", Font.PLAIN, 25));
		panel.add(equalto);
		equalto.addActionListener(this);

		clear = new JButton("C");
		clear.setFont(new Font("Arial", Font.PLAIN, 25));
		panel.add(clear);
		clear.addActionListener(this);

		result = new JTextField(10);
		result.setFont(new Font("Arial", Font.PLAIN, 40));
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(result, BorderLayout.NORTH);
		frame.setVisible(true);
		frame.setSize(250, 250);
	}

	public void actionPerformed(ActionEvent ae) {
		JButton pb = (JButton) ae.getSource();
		if (pb == clear) {
			r = firstnumber = secondnumber = 0;
			result.setText("");
		} else if (pb == equalto) {
			secondnumber = Integer.parseInt(result.getText());
			eval();
			result.setText("" + r);
		}

		else {
			boolean opf = false;
			if (pb == add) {
				op = '+';
				opf = true;
			}
			if (pb == subtract) {
				op = '-';
				opf = true;
			}
			if (pb == multiply) {
				op = '*';
				opf = true;
			}
			if (pb == divide) {
				op = '/';
				opf = true;
			}

			if (opf == false) {
				for (i = 0; i < 10; i++) {
					if (pb == b[i]) {
						String t = result.getText();
						t += i;
						result.setText(t);
					}
				}
			} else {
				firstnumber = Integer.parseInt(result.getText());
				result.setText("");
			}
		}
	}

	int eval() {
		switch (op) {
		case '+':
			r = firstnumber + secondnumber;
			break;
		case '-':
			r = firstnumber - secondnumber;
			break;
		case '*':
			r = firstnumber * secondnumber;
			break;
		case '/':
			r = firstnumber / secondnumber;
			break;

		}
		return 0;
	}

	public static void main(String arg[]) {
		new CalculatorGUI();
	}
}