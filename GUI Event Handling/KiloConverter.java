import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//prepare for event
public class KiloConverter extends JFrame implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel label1;
	JTextField text;
	JButton button;
	KiloConverter()
	 {
		 frame=new JFrame("Kilo Converter");
		 panel=new JPanel();
		 label1=new JLabel("Enter distance in kilometers:");
		 text=new JTextField(25);
		 button=new JButton("Convert To Miles");
		 
		 //listen for event
		 button.addActionListener(this);
	
		 panel.add(label1);
		 panel.add(text);
		 panel.add(button);
		 frame.add(panel);
	
		 frame.setSize(300,200);
		 frame.setVisible(true);
	 }
	//respond to event
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button)
		{
			double km=Double.parseDouble(text.getText());
			double miles=km*0.6214;
			
			//display result in message box
			JOptionPane.showMessageDialog(null, km+" kilomteres is "+miles+"miles");
						
		}
	}
		public static void main(String[] args) {
			new KiloConverter();
	}

}


