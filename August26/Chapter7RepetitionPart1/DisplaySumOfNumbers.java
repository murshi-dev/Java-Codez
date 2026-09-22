/*Write a Java program using for loop that 
 * asks the user to enter a number. The program 
 * should display all numbers from 1 up to the 
 * entered number and calculate and display the 
 * sum of these numbers.*/
import java.util.*;
public class DisplaySumOfNumbers 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sum=0;
		System.out.println("Input a number: ");
		int number = input.nextInt();
		System.out.println("Numbers are: ");
		for(int counter=1;counter<=number;counter++)
		{
			System.out.print(counter + " ");
			sum = sum + counter;//accumulative addition
		}
		System.out.println("");
		System.out.println("Sum of all numbers: "+sum);
	}
}
