/*Sharing Chocolates — A teacher has some chocolates and wants 
 * to distribute them equally among students.
Write a Java program using Scanner to input:Number of chocolates
Number of students.Calculate and display: Chocolates received by 
each student, Chocolates remaining*/
import java.util.*;
public class SharingChocolates 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//prompt and input
		System.out.println("Enter number of chocolates: ");
		int numberOfChocolates = input.nextInt();
		System.out.println("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		
		//calculation
		int chocolatesEach = numberOfChocolates / numberOfStudents;
		int remainingChocolates = numberOfChocolates % numberOfStudents;
		
		//output
		System.out.println("Each child gets "+chocolatesEach+"chocolates");
		System.out.println("Remaining chocolates "+remainingChocolates);
		
		
	}

}
