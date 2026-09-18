//calculator code to demo switch case 
import java.util.*;
public class CalculatorUsingSwitchCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = input.nextDouble();
		
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter an option(1-4): ");
		int option = input.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Added Result: "+ (num1+num2));
			break;
		case 2:
			System.out.println("Subtracted Result: "+ (num1-num2));
			break;
		case 3:
			System.out.println("Multiplied Result: "+ (num1*num2));
			break;
		case 4:
			System.out.println("Divide Result: "+ (num1/num2));
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}
