import java.util.*;
public class DisplayGradeMultiWayIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the marks: ");
		int marks = input.nextInt();
		
		char grade = ' ';
		
		if(marks >= 80)
			grade='A';
		else if(marks >= 70)
			grade='B';
		else if(marks >= 60)
			grade ='C';
		else if(marks >= 50)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("Grade is: "+grade);
	}

}
