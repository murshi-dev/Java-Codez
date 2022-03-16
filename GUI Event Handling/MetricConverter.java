import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//prepare for event
public class MetricConverter extends JFrame implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel label1;
	JTextField text;
	JRadioButton rb1,rb2,rb3;

	MetricConverter()
	 {
		 frame=new JFrame("Metric Converter");
		 panel=new JPanel();
		 label1=new JLabel("Enter distance in kilometers:");
		 text=new JTextField(25);
		 rb1=new JRadioButton("Convert to miles");
		 rb2=new JRadioButton("Convert to feet");
		 rb3=new JRadioButton("Convert to inches");
		 
		 ButtonGroup group=new ButtonGroup();
		 group.add(rb1);
		 group.add(rb2);
		 group.add(rb3);
		 
		
		 //listen for event
		 rb1.addActionListener(this);
		 rb2.addActionListener(this);
		 rb3.addActionListener(this);
	
		 panel.add(label1);
		 panel.add(text);
		 panel.add(rb1);
		 panel.add(rb2);
		 panel.add(rb3);
		 frame.add(panel);
	
		 frame.setSize(300,200);
		 frame.setVisible(true);
	 }
	//respond to event
	public void actionPerformed(ActionEvent ae)
	{
		double km=Double.parseDouble(text.getText());
		if(ae.getSource()==rb1)
		{
			double miles=km*0.6214;
			//display result in message box
			JOptionPane.showMessageDialog(null, km+" kilomteres is "+miles+"miles");
						
		}
		else if(ae.getSource()==rb2)
		{
			double feet=km*3281.0;
			//display result in message box
			JOptionPane.showMessageDialog(null, km+" kilomteres is "+feet+"feet");
						
		}
		else if(ae.getSource()==rb3)
		{
			double inches=km*39370.0;
			//display result in message box
			JOptionPane.showMessageDialog(null, km+" kilomteres is "+inches+"inches");
						
		}
		
	}
		public static void main(String[] args) {
			new MetricConverter();
	}

}


