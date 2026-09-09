import java.util.*;
public class IfDemo 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = input.nextInt();
		
		//check if the number is greater than 10
		if(num > 10)
			System.out.println("Greater than 10");
		else
			System.out.println("Not Greater than 10");
		
		System.out.println("Enter any number: ");
		int number = input.nextInt();
		
		//check if the number is equal to 100
		if(number == 100)
			System.out.println("Equal to 100");
		else
			System.out.println("Not equal to 100");
		
		//check if 'num' and 'number' value are equal
		if(num == number)   //    == EQUAL TO
			System.out.println("both the values are equal");
		//OR
		if(num != number)   //    != NOT EQUAL TO
			System.out.println("both the values are not equal");
		
		//charecter input -- char
		System.out.println("Enter any grade: ");
		char grade = input.next().charAt(0);
		//check if grade equal to 'A'
		if(grade == 'A')
			System.out.println("Excellent");
		
		//decimal input --double
		System.out.println("Enter any temperature: ");
		double temperature = input.nextDouble();
		//check if temperature is lees than 20
		if(temperature < 20)
		{
			System.out.println("Cool temperature");
			System.out.println("Nice weather");
			System.out.println("Read Books");
		}//if block
		else
		{
			System.out.println("Warm temperature");
			System.out.println("Hot weather");
		}//else block
		/*Ask the user to enter a student's mark. 
			Use if-else to display:
			"Pass" if the mark is greater than or equal to 50
			"Fail" otherwise.*/
		System.out.println("Enter student marks: ");
		int studentMarks = input.nextInt();
		if(studentMarks >= 50)
		{
			System.out.println("PASS");
			//add 10 marks to studentmarks
			studentMarks = studentMarks + 10;
			System.out.println("New Marks With BONUS: " 
								+ studentMarks );
		}
		else
			System.out.println("FAIL");
		
		//check if a number is divisible by 5 
		System.out.println("Enter any number: ");
		int numFive = input.nextInt();
		if(numFive %5 == 0)
			System.out.println("Divisible by 5");
		else
			System.out.println("NOT Divisible by 5");
		
	}
}
