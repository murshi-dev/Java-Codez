import java.util.*;
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1, n2;
		System.out.println("Enter number 1: ");
		n1=input.nextInt();
		System.out.println("Enter number 2: ");
		n2=input.nextInt();
		try {
		///exception may be raised here, if n2 is zero
		//so put them in try block
		System.out.println("Divided value is: "+(n1/n2));
		}//close try block
		//start the catch block --in case exception is raised
		//how to handle it?
		//handle them using the catch block
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide a number by zero, Enter positive n2");
		}//close catch block
		
	}//close main

}//close class
