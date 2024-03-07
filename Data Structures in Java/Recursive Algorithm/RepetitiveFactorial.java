public class RepetitiveFactorial {

	public static void main(String[] args) 
	{
		int n=5;
		int result = calculateFactorialRepetitive(n);
		System.out.println("Factorial of "+n+" is "+ result);
	}
	//function factorial
	public static int calculateFactorialRepetitive(int n)
	{
		int fact=1;
		for(int k=1;k<=n;k++)
		{
			fact=fact*k;
		}
		return fact;
	}
}
