import javax.swing.*;
//1.import package and implement ActionListener
import java.awt.event.*;
public class DemoGUI extends JFrame implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JButton button;
	 DemoGUI()
	 {
		 frame=new JFrame("DemoEvent");
		 panel=new JPanel();
		 button=new JButton("Click");
		 
		 panel.add(button);
		 frame.add(panel);
		 //2. start listening for the events
		 //start listening to button
		 //using the method addActionListener
		 //this corresponds to the current object 
		 button.addActionListener(this);
		 
		 frame.setSize(300,200);
		 frame.setVisible(true);
	 }
	 //write the actionPerformed () implementation here
	 public void actionPerformed(ActionEvent event)
	 {
		 //what should the program do when button is clicked
		 //thats written here
		 //3. respond to events
		 ///first confirm if button is the source
		 if(event.getSource()==button)
		 {
			 //change caption of button using setText method
			 button.setText("Button Clicked");
		 }
		 
	 }
		public static void main(String[] args) {
			new DemoGUI();
	}

}
