//sentinel based loop
//check pass/fail --if the number of repetitions is not known
import java.util.*;
public class CheckPassFailSentinelLoop 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char sentinelOption = 'Y';//rule 1
		while(sentinelOption == 'Y' || sentinelOption=='y')//rule 2
		{
			System.out.println("Enter the marks: ");
			int marks = input.nextInt();
			if(marks>=60)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
			System.out.println("Continue(Y/N)?: ");
			sentinelOption = input.next().charAt(0);//rule 3
		}
		System.out.println("Program EXITS");
	}

}
