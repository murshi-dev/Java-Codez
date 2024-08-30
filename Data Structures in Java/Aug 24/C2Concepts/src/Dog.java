
public class Dog implements Speaker 
{
	public void speak()
	{
		System.out.println("Woof Woof");
	}
	public void announce(String announcement)
	{
		System.out.println("Woof: "+announcement);
	}

}
