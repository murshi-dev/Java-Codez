
public class AdvancedPhiolosopher extends Philosopher
{
	public AdvancedPhiolosopher(String thoughts)
	{
		super(thoughts);
	}
	public void reflect()
	{
		System.out.println("Ad Philosopher reflects "+super.philosophy);
	}
}
