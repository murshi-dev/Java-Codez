/*Write a Java program using while loop that asks the user to enter a number. The program should display the multiplication table from 1 to 10 for the entered number.*/
import java.util.*;
public class MultiplicationTableWhileLoop 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number: ");
		int number = input.nextInt();
		int counter=1;//rule 1
		while(counter<=10)//rule 2
		{
			System.out.println(number +"*"+ counter +"="+ number*counter);
			counter++;//rule 3
		}
	}
}
