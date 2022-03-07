//gridbag layout
import javax.swing.*;
import java.awt.*;
class GUIGridBagLayoutDemo
{
	JFrame frame;
	JPanel panel;
	JLabel username,password;
	JTextField textuser;
	JPasswordField textpass;
	JButton login;
	GUIGridBagLayoutDemo()
	{
		frame=new JFrame("GridBagLayout");
		panel=new JPanel();
		
		username=new JLabel("Enter username:");
		password=new JLabel("Enter password:");
		textuser=new JTextField(20);
		textpass=new JPasswordField(20);
		login=new JButton("Login");
		
		//set the layout
		panel.setLayout(new GridBagLayout());
		//use Gridbag constraints to position the elements
		GridBagConstraints constraints=new GridBagConstraints();
		//use anchor property to specify the location
		constraints.anchor=GridBagConstraints.WEST;
		//add space between controls
		constraints.insets=new Insets(10,10,10,10);
		//4 parameters->top bottom left right -- space values
		
		//add components to panel
		//set the x and y values
		//username label
		constraints.gridx=0;
		constraints.gridy=0;
		panel.add(username,constraints);
		
		//username textbox
		constraints.gridx=1;
		constraints.gridy=0;
		panel.add(textuser,constraints);
		
		//password label
		constraints.gridx=0;
		constraints.gridy=1;
		panel.add(password,constraints);
		
		//password textbox
		constraints.gridx=1;
		constraints.gridy=1;
		panel.add(textpass,constraints);
		
		//button login
		constraints.gridx=0;
		constraints.gridy=2;
		//to place the login to the center
		constraints.gridwidth=2;//will SPAN for two columns
		constraints.anchor=GridBagConstraints.CENTER;//use anchor position in center
		panel.add(login,constraints);
		
		
		//add panel to frame
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}




public class GUIGridBagLayout {
	public static void mainn(String args[])
	{
		new GUIGridBagLayoutDemo();
	}

}
