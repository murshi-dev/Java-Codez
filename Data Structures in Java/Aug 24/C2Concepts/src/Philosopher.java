
public class Philosopher implements Speaker {
	protected String philosophy;
	//constructor
	public Philosopher(String thoughts)
	{
		this.philosophy=thoughts;
	}
	public void speak()
	{
		System.out.println("Philosopher says "+philosophy);
	}
	public void announce(String announcement)
	{
		System.out.println("Philosopher announces "+announcement);
	}
	
}
