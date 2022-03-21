import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuColor extends JFrame {
	// declare required controls
	JFrame frame;
	JLabel label;// to display text where color changes

	// menu controls
	JMenuBar menubar;
	JMenu filemenu, textmenu;
	JMenuItem exititem;// submenu of file
	JRadioButtonMenuItem blackitem, reditem, blueitem;// submenu of text

	// constructor
	MenuColor() {
		frame = new JFrame("Menu Event Demo");
		frame.setSize(300, 300);
		frame.setLayout(new BorderLayout());

		// initialise label and add to frame
		label = new JLabel("Text color changes based on Selection", SwingConstants.CENTER);
		frame.add(label);

		// create a function to build the
		// menu and call it here
		buildMenuBar();

		// add filemenu to menubar
		menubar.add(filemenu);
		// add textmenu to menubar
		menubar.add(textmenu);

		// add menu to frame
		frame.setJMenuBar(menubar);
		frame.setVisible(true);
	}

	void buildMenuBar() {
		// create the menu bar
		menubar = new JMenuBar();
		
		// create the file menu
		// start designing file menu with exit item
		exititem = new JMenuItem("Exit");
		// add listener to the exit button
		exititem.addActionListener(new ExitListener());
		filemenu = new JMenu("File");
		// add exit item to file menu
		filemenu.add(exititem);
		// create the text menu
		blackitem = new JRadioButtonMenuItem("Black", true);
		reditem = new JRadioButtonMenuItem("Red");
		blueitem = new JRadioButtonMenuItem("Blue");

		// add listener to all the radio buttons
		blackitem.addActionListener(new ColorListener());
		reditem.addActionListener(new ColorListener());
		blueitem.addActionListener(new ColorListener());

		// use buttongroup
		ButtonGroup group = new ButtonGroup();
		group.add(blackitem);
		group.add(reditem);
		group.add(blueitem);
		// create a jmenu for the text menu
		textmenu = new JMenu("Text");
		// add all the radio buttons to txt menu
		textmenu.add(blackitem);
		textmenu.add(reditem);
		textmenu.add(blueitem);

	}

	// define the ExitListener class
	class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// exit the GUI
			System.exit(0);
		}
	}

	// define the ColorListener class
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// check if black radio is clicked
			if (blackitem.isSelected())
				// change the label color to black
				label.setForeground(Color.BLACK);
			else // check if red radio is clicked
			if (reditem.isSelected())
				// change the label color to black
				label.setForeground(Color.RED);
			else // check if blue radio is clicked
			if (blueitem.isSelected())
				// change the label color to black
				label.setForeground(Color.BLUE);
		}
	}

	public static void main(String[] args) {
		new MenuColor();

	}

}
