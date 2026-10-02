import java.util.*;
public class EvenOddSentinel {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sentinelOption = 1;//rule 1
		while(sentinelOption != 0)//rule 2
		{
			System.out.println("Enter a number: ");
			int number = input.nextInt();
			if(number%2==0)
				System.out.println("Even Number");
			else
				System.out.println("Odd Number");
			System.out.println("Continue(0 to Exit /1 to Continue)?: ");
			sentinelOption = input.nextInt();//rule 3
		}
		System.out.println("Program EXITS");
	}

}
