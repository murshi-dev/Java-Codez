
public class Circle {
	
	double radius;//state-attribute-properties-data members
	
	//behaviors-methods-member functions
	
	//Constructor-initialise variable-same name as class name
	//doesnt have return type
	Circle()
	{
		radius=0;
	}
	//setter method-to assign values to state/data
	void setRadius(double r) {
		radius=r;
	}
	//getter method - to access the state/data
	double getRadius()
	{
		return radius;
	}
	double calculateArea()
	{
		return 3.14*radius*radius;
	}

}//class ends here
