
public class RecursiveFibonacci {
	public static void main(String[] args) 
	{
		int n=10;
		int result=fib(n);
		System.out.println("Fibonacci term at position "+n+" is "+result);
		}
	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			//recursive call
			return fib(n-1)+fib(n-2);
		}
	}
}
