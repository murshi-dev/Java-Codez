import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//prepare for event
public class GradeCalculator extends JFrame implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel label1,label2;
	JTextField text;
	JButton button;
	GradeCalculator()
	 {
		 frame=new JFrame("Grade Calculator");
		 panel=new JPanel();
		 label1=new JLabel("Enter Marks:");
		 label2=new JLabel();
		 text=new JTextField(25);
		 button=new JButton("Calculate Grade");
		 
		 //listen for event
		 button.addActionListener(this);
		 
		 panel.setLayout(new GridLayout(2,2));
		 panel.add(label1);
		 panel.add(text);
		 panel.add(button);
		 panel.add(label2);
		 frame.add(panel);
	
		 frame.setSize(300,200);
		 frame.setVisible(true);
	 }
	//respond to event
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button)
		{
			//retrieve values from text box and put in a local variable
			//parse(convert) text to integer to calculate grade
			int marks=Integer.parseInt(text.getText());
			if(marks>=80)
				label2.setText("A");
			else if(marks>=60 && marks<=79)
				label2.setText("B");
			else if(marks>=40 && marks<=59)
				label2.setText("C");
			else if(marks<40)
				label2.setText("D");
						
		}
	}
		public static void main(String[] args) {
			new GradeCalculator();
	}

}


