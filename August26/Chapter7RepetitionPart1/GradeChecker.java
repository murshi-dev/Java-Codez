//Check if a Student pass/fail --check for 5 students
import java.util.*;
public class GradeChecker 
{
	public static void main(String[] args) 
	{
		int studentCounter = 1;//1. set the start value
		Scanner input =new Scanner(System.in);
		while(studentCounter <= 5)//2. set the end value
		{
			System.out.println("Input the marks: ");
			int score = input.nextInt();
			if(score >= 50)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
			studentCounter++;//3. set the update value
		}

	}

}
