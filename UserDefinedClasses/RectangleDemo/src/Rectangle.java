
public class Rectangle {
	//data members
	int width;
	int height;
	//no argument constructor initialised as 1
	Rectangle()
	{
		width=1;
		height=1;
	}
	//constructor initialised with values from 'main class'
	Rectangle(int w, int h)
	{
		width=w;
		height=h;
	}
	//calculate area
	int getArea() {
		return width*height;
	}
	//calculate perimeter
	int getPerimeter()
	{
		return (2*width+2*height);
	}

}
