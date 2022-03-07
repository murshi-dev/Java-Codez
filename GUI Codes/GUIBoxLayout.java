//box layout
import javax.swing.*;

class BoxLayoutDemo
{
	JFrame frame;
	JPanel panel;
	JButton b1,b2,b3,b4,b5;
	BoxLayoutDemo()
	{
		frame=new JFrame("BoxLayout");
		panel=new JPanel();
		b1=new JButton("A");
		b2=new JButton("B");
		b3=new JButton("C");
		b4=new JButton("D");
		b5=new JButton("E");
		
		//set the layout in Y axis 
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		//add buttons to panel using layout
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		
		//add panel to frame
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
}
public class GUIBoxLayout {

	public static void main(String[] args) {
		new BoxLayoutDemo();
	}

}
