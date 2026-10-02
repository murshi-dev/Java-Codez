public class NumberPatternNestedLoop1 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=3; i++)//outer loop
		{
			for(int j=1; j<=2; j++)//inner loop
			{
				System.out.println("i: "+ i +",j: "+ j);
			}
		}
	}
}
