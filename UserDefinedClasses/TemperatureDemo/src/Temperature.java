//Practice 4
public class Temperature {
	//data member
	double temp;
	//member function
	//constructor
	Temperature()
	{
		temp=0;
	}
	//setter
	void setTemp(double t) {
		temp=t;
	}
	//getter
	double getTemp()
	{
		return temp;
	}
	double convertTemp()
	{
		return ((temp-32)*0.55);
	}
	

}
