import javax.swing.*;
import java.awt.*;
public class ToppingsPanel extends JPanel{
	
	JCheckBox creamcheese, butter, peach, blueberry;
	ToppingsPanel()
	{
		setLayout(new GridLayout(4,1));
		creamcheese=new JCheckBox("Cream Cheese");
		butter=new JCheckBox("Butter");
		peach=new JCheckBox("Peach Jelly");
		blueberry=new JCheckBox("Blueberry Jam");
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		add(creamcheese);
		add(butter);
		add(peach);
		add(blueberry);
		
	}
	//function to return topping price
	public double getToppingCost()
	{
		double toppingcost=0.0;
		if(creamcheese.isSelected())
			toppingcost += 0.50;
		if(butter.isSelected())
			toppingcost += 0.25;
		if(peach.isSelected())
			toppingcost += 0.75;
		if(blueberry.isSelected())
			toppingcost += 0.75;
		return toppingcost;
		
	}

}

