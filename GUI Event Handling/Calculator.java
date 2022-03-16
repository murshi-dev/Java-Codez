import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//prepare for event
public class Calculator extends JFrame implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel label1,label2,label3;
	JTextField num1,num2,result;
	JButton add,clear;
	Calculator()
	 {
		 frame=new JFrame("Calculator");
		 panel=new JPanel();
		 label1=new JLabel("First Number:");
		 label2=new JLabel("Second Number:");
		 label3=new JLabel("Result:");
		 num1=new JTextField(20);
		 num2=new JTextField(20);
		 result=new JTextField(20);
		 result.setEditable(false);
		 add=new JButton("Add");
		 clear=new JButton("Clear");
		 
		 //listen for event
		 add.addActionListener(this);
		 clear.addActionListener(this);
		 
		 panel.setLayout(new GridLayout(4,2));
		 panel.add(label1);
		 panel.add(num1);
		 panel.add(label2);
		 panel.add(num2);
		 panel.add(label3);
		 panel.add(result);
		 panel.add(add);
		 panel.add(clear);
	
		 frame.add(panel);
	
		 frame.setSize(300,200);
		 frame.setVisible(true);
	 }
	//respond to event
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==add)
		{
			int n1=Integer.parseInt(num1.getText());
			int n2=Integer.parseInt(num2.getText());
			int r=n1+n2;
			//use String.valueOf method to convert integer 
			//to string and then display in textbox
			result.setText(String.valueOf(r));
			
		}
		//write codes for clear button
		else if(ae.getSource()==clear)
		{
			//clear the text box values to empty
			num1.setText(" ");
			num2.setText(" ");
			result.setText(" ");
		}
		
	}
		public static void main(String[] args) {
			new Calculator();
	}

}


