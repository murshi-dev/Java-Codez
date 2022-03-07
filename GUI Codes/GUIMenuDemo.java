import javax.swing.*;
class GUIMenu
{
	JFrame frame;
	JPanel panel;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem item1,item2,item3;
	//constructor
	GUIMenu()
	{
		frame=new JFrame("Menu Demo");
		panel=new JPanel();
		//create menu bar
		menubar=new JMenuBar();
		//create a menu
		menu=new JMenu("Menu");
		//create menu items
		item1=new JMenuItem("Home");
		item2=new JMenuItem("Contact");
		item3=new JMenuItem("About Us");
		
		//add menu items to menu
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		
		//add menu to menubar
		menubar.add(menu);
		
		//add menubar to frame
		frame.setJMenuBar(menubar);
		//set frame size and visibility
		frame.setSize(400,400);
		frame.setVisible(true);
			
	}
	
}

public class GUIMenuDemo {

	public static void main(String[] args) {
		new  GUIMenu();

	}

}
