import javax.swing.*;
import java.awt.*;
public class BagelPanel extends JPanel{
	
	JRadioButton whitebagel,wheatbagel;
	BagelPanel()
	{
		setLayout(new GridLayout(2,1));
		whitebagel=new JRadioButton("white",true);
		wheatbagel=new JRadioButton("wheat",true);
		
		//set border
		setBorder(BorderFactory.createTitledBorder("Bagels"));
		ButtonGroup group=new ButtonGroup();
		group.add(wheatbagel);
		group.add(whitebagel);
		
		add(whitebagel);
		add(wheatbagel);
	}
	//function to retrieve radio button values
	public double getBagelCost()
	{
		double bagelCost=0.0;
		if(whitebagel.isSelected())
			bagelCost=1.25;
		else if(wheatbagel.isSelected())
			bagelCost=1.50;
		
		return bagelCost;
	}

}

