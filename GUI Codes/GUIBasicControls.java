
//import the swing package 
import javax.swing.*;

//create a class for designing all controls
class GUIBasic {
	JFrame frame;// for frame
	JPanel panel;// for panel to place controls

	JLabel label;
	JTextField text;
	JButton button;
	JPasswordField pass;
	//radiobutton
	ButtonGroup radioGroup;//to group all radio button
	JRadioButton rb1,rb2,rb3;
	//list box
	JList list1,list2;
	//combo box
	JComboBox combo;
	//text area
	JTextArea textarea;
	//spinner 
	JSpinner spinner;
	//slider
	JSlider slider;

	// call constructor to initialise controls
	GUIBasic() {
		frame = new JFrame("Basic Controls");// title for frame
		panel = new JPanel();

		label = new JLabel("Enter name:");
		pass=new JPasswordField(20);
		text = new JTextField(20);
		button = new JButton("Submit");
		
		//initialise radio button
		radioGroup=new ButtonGroup();
		rb1=new JRadioButton("Easy",true);
		rb2=new JRadioButton("Medium");
		rb3=new JRadioButton("Difficult");
		//add all the radio buttons to button group
		radioGroup.add(rb1);
		radioGroup.add(rb2);
		radioGroup.add(rb3);
		
		//initialise list
		//method 1
		String week[]= {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"};
		list1=new JList(week);
		
		//initialise list
		//method 2
		DefaultListModel city=new DefaultListModel();
		city.addElement("New York");
		city.addElement("Singapore");
		city.addElement("Sydney");
		list2=new JList(city);
		
		//initialise combo
		String subjects[]= {"BM","English","Maths","Science"};
		combo=new JComboBox(subjects);
		
		//initialise textarea
		textarea=new JTextArea("defualt text here",10,30);
		//10->rows
		//30->cols
		
		//initialise spinner
		spinner=new JSpinner(new SpinnerNumberModel(1,1,20,2));
		//4 parameters->value(1), min(1),max(20),increment(2)
		
		//initialise slider
		JSlider slider=new JSlider(0,30,15);
		//takes 3 parameters->min(0),max(30),value(15)
		slider.setMajorTickSpacing(10);//displays 0,10,20,30 in bold
		slider.setMinorTickSpacing(1);//displays separation of one unit in small lines
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);//to make the values visible
		
		// add controls to panel
		panel.add(label);
		panel.add(text);
		panel.add(pass);
		panel.add(button);
		//add radio buttons to panel
		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);
		//add list to panel
		panel.add(list1);
		panel.add(list2);
		//add combo box to panel
		panel.add(combo);
		//add textarea to panel
		panel.add(textarea);
		//add spinner to panel
		panel.add(spinner);
		//add slider to panel
		panel.add(slider);
		// add panel to frame
		frame.add(panel);

		// set size to frame
		frame.setSize(400, 500);
		// make the frame visible
		frame.setVisible(true);
	}
}

public class GUIBasicControls {
	public static void main(String[] args) {
		//call the GUIBasic class
			GUIBasic obj=new GUIBasic();

	}

}
