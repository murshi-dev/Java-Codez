package src;
import java.util.*;
public class ConsoleInputOutputWithCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the student name: ");
		String studentName = input.nextLine();
		
		System.out.println("Enter the student id: ");
		String studentID = input.nextLine();
		
		System.out.println("Enter the science marks: ");
		int scienceMarks = input.nextInt();
		
		System.out.println("Enter the maths marks: ");
		int mathsMarks = input.nextInt();
		
		int totalMarks = scienceMarks + mathsMarks;
		
		System.out.println("StudentName: " + studentName
								+ "\nStudentID: " + studentID
								+ "\nScience Marks: " + scienceMarks
								+ "\nMaths Marks: " + mathsMarks
								+ "\nTotal Marks: " + totalMarks);
		
		

	}

}
