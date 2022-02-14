public class Rectangle {
	
	protected int length;
	protected int width;
	Rectangle()
	{
		length=0;
		width=0;
	}
	//pass length and width as parameters to constructor
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	//calculate area
	public int getArea()
	{
		return length*width;
	}
	

}
