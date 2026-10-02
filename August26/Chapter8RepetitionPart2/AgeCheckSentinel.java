import java.util.*;
public class AgeCheckSentinel {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sentinelOption = 1;//rule 1
		while(sentinelOption != 0)//rule 2
		{
			System.out.println("Enter a number: ");
			int age = input.nextInt();
			if(age >= 18)
				System.out.println("Eligible to Vote");
			else
				System.out.println("NOT Eligible to Vote");
			System.out.println("Continue(0 to Exit /1 to Continue)?: ");
			sentinelOption = input.nextInt();//rule 3
		}
		System.out.println("Program EXITS");
	}

}
