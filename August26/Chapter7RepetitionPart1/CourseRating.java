//Input rating for 5 students and display the results
//Use do-while loop
import java.util.*;
public class CourseRating 
{
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		int studentCounter = 1;//rule 1
		do
		{
			System.out.println("Input rating for student: ");
			int rating = input.nextInt();
			System.out.println("Rating is: "+rating);
			studentCounter++;//rule 3
		}while(studentCounter<=5);//rule 2
	}
}
