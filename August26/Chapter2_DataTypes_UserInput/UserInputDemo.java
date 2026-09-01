package src;
//include this package if user input is required in the code
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		//create an object for the Scanner class
		Scanner input  = new Scanner(System.in);
		
		//prompt to enter a name
		System.out.println("Enter the student name: ");
		//retrieve the string input using nextLine()
		String sname = input.nextLine();
		
		//prompt to enter the marks 
		System.out.println("Enter the student marks: ");
		//retrieve the int input using nextInt()
		int marks = input.nextInt();
		
		//prompt to enter the CGPA 
		System.out.println("Enter the student CGPA: ");
		//retrieve the int input using nextDouble()
		double CGPA = input.nextDouble();
		
		//display the name
		System.out.println("Student Name: "+ sname);
		//display the marks
		System.out.println("Marks: "+ marks);
		//display the CGPA
		System.out.println("CGPA: "+ CGPA);
		}

}
