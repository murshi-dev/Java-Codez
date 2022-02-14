
public class Box extends Rectangle{
	//length and width extended/used from Rectangle class
	//declare only height variable here
	private int height;
	
	Box()
	{
		super();//initialises length=0 and width=0 from Rectangle class
		height=0;
	}
	//pass length,width and height as parameters to constructor
	Box(int length,int width,int height)
	{
		super(length,height);//helps to inherit length and 
		//height values from Rectangle class constructor
		this.height=height;
	}
	//calculate volume
		public int getVolume()
		{
			return length*width*height;
		}

}
