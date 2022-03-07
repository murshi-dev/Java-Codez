//border layout
import java.awt.BorderLayout;

import javax.swing.*;

class BorderLayoutDemo
{
	JFrame frame;
	JPanel panel;
	JButton b1,b2,b3,b4,b5;
	BorderLayoutDemo()
	{
		frame=new JFrame("BorderLayout");
		panel=new JPanel();
		b1=new JButton("NORTH");
		b2=new JButton("SOUTH");
		b3=new JButton("EAST");
		b4=new JButton("WEST");
		b5=new JButton("CENTER");
		
		//set the layout
		panel.setLayout(new BorderLayout());
		
		//add buttons to panel using layout
		panel.add(b1,BorderLayout.NORTH);
		panel.add(b2,BorderLayout.SOUTH);
		panel.add(b3,BorderLayout.EAST);
		panel.add(b4,BorderLayout.WEST);
		panel.add(b5,BorderLayout.CENTER);
		
		//add panel to frame
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
}
public class GUIBorderLayout {

	public static void main(String[] args) {
		new BorderLayoutDemo();

	}

}
