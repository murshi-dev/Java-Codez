import java.util.*;
public class NumberFormatExceptionDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number;
		while(true)
		{
			System.out.println("Enter any number: ");
			//get the input as a string and convert to int
			//parseInt--convert string to number
			//expecting a exception here
			try
			{
			number=Integer.parseInt(input.next());
			System.out.println("You entered: "  + number);
			}//close try
			catch(NumberFormatException e)
			{
				System.out.println("Enter numbers only");
			}//close catch
		}//close while
	}//close main
}//close class
