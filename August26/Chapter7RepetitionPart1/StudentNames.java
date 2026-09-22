//input 5 student names and display them
//use for loop
import java.util.*;
public class StudentNames
{
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		for(int studentCounter = 1;studentCounter <= 5;studentCounter++)
		{
			System.out.println("Input the student "+studentCounter+" name: ");
			String studentName = input.nextLine();
			System.out.println("Student "+studentCounter+" Name: "+studentName);
		}
	}
}
