import javax.swing.*;
import java.awt.*;
public class Coffeepanel extends JPanel{
	
	JRadioButton none,regular,decaf,cappucino;
	Coffeepanel()
	{
		setLayout(new GridLayout(4,1));
		none=new JRadioButton("None",true);
		regular=new JRadioButton("Regular");
		decaf=new JRadioButton("Decaf");
		cappucino=new JRadioButton("Cappucino");
		
		setBorder(BorderFactory.createTitledBorder("Coffee"));
		ButtonGroup group=new ButtonGroup();
		group.add(none);
		group.add(regular);
		group.add(decaf);
		group.add(cappucino);
		
		add(none);
		add(regular);
		add(decaf);
		add(cappucino);
	}
	//function to retrieve radio button values
	public double getCoffeeCost()
	{
		double coffeeCost=0.0;
		if(none.isSelected())
			coffeeCost=0.0;
		else if(regular.isSelected())
			coffeeCost=1.25;
		else if(decaf.isSelected())
			coffeeCost=1.25;
		else if(cappucino.isSelected())
			coffeeCost=1.50;
		
		return coffeeCost;
	}

}

