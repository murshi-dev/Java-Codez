
public class RecursiveFactorial {

	public static void main(String[] args) 
	{
		int n=5;
		int result=calculateRecursiveFactorial(n);
		System.out.println("Factorial of "+n+" is "+result);
	}
	public static int calculateRecursiveFactorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			//recursive call
			return n*calculateRecursiveFactorial(n-1);
		}
	}
}
