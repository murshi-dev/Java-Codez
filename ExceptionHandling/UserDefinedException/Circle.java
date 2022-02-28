
public class Circle {
	private double radius;
	//constructor
	Circle()
	{
		radius=0.0;
	}
	//getter
	public double getRadius()
	{
		return radius;
	}
	//setter
	//STEP2--SETTING THE VALUE FOR RADIUS USING THROWS AND THROW
	public void setRadius(double r) throws InvalidRadiusException
	{
		if(r>0)//if proper radius entered
		{
		radius=r;//assign r to radius
		}
		else //otherwise throw the exception
		{
			throw new InvalidRadiusException();//calls the constructor(super())
		}
	}
	//calculate area
	public double calculateArea()
	{
		return (3.14*radius*radius);
	}

}
