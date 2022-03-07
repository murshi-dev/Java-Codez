import javax.swing.*;
class GUITabbedPaneDemo
{
	JFrame frame;
	JPanel p1,p2,p3;
	JButton b1,b2,b3;
	JTabbedPane tab;
	//constructor
	GUITabbedPaneDemo()
	{
		frame=new JFrame("Menu Demo");
		//initialise Jtabbed pane
		tab=new JTabbedPane();
		
		//3 panels for 3 tabs
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		//buttons for each tab
		b1=new JButton("home");
		b2=new JButton("aboutus");
		b3=new JButton("help");
		
		//add buttons to each panel
		p1.add(b1);
		p2.add(b2);
		p3.add(b3);
		
		//add panels to tab
		tab.add("home",p1);
		tab.add("about us",p2);
		tab.add("help",p3);
		
		//add tab to frame
		frame.add(tab);
		
		//set frame size and visibility
		frame.setSize(400,400);
		frame.setVisible(true);
			
	}
	
}
public class GUITabbedPane {

	public static void main(String[] args) {
		 new GUITabbedPaneDemo();

	}

}
