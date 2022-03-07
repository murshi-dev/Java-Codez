//grid layout
import javax.swing.*;
import java.awt.*;

class GridLayoutDemo
{
	JFrame frame;
	JPanel panel;
	JButton b1,b2,b3,b4,b5,b6;
	GridLayoutDemo()
	{
		frame=new JFrame("GridLayout");
		panel=new JPanel();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		//set the layout in grid--rows and cols
		//3 rows and 2 cols
		//5,5 represents the hgap and vgap among controls 
		panel.setLayout(new GridLayout(3,2,5,5));
		
		//add buttons to panel using layout
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		
		//add panel to frame
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
}
public class GUIGridLayout {

	public static void main(String[] args) {
		new GridLayoutDemo();

	}

}
