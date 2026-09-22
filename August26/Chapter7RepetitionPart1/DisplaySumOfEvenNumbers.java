/*Write a Java program using do while 
 * loop that asks the user to enter a number. 
 * The program should display all even numbers 
 * from 1 up to the entered number and calculate 
 * and display the sum of the even numbers.*/
import java.util.*;
public class DisplaySumOfEvenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Input a number: ");
		int number = input.nextInt();
		System.out.println("Numbers are: ");
		int counter = 2;//rule 1
		do
		{
			System.out.print(counter + " ");
			sum = sum + counter;//accumulative addition
			counter = counter + 2; //rule 3
		}while(counter<=number);//rule 2
		System.out.println("");
		System.out.println("Sum of all numbers: "+sum);
	}

}
