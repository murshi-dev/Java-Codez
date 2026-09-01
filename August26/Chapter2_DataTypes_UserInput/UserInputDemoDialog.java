package src;
import javax.swing.JOptionPane;
public class UserInputDemoDialog 
{
	public static void main(String[] args) 
	{
		//input a username using a dialog box
		String studentName = 
				JOptionPane.showInputDialog("Enter the student name: ");
		//input a userid using a dialog box
		String studentID = 
				JOptionPane.showInputDialog("Enter the student ID: ");
		//input science marks using a dialog box
		String marksScienceString = 
				JOptionPane.showInputDialog("Enter the Science marks: ");
		//convert the string to integer value --Integer.parseInt()
		int sciencemarks = Integer.parseInt(marksScienceString);
		
		//input science marks using a dialog box
		String marksMathsString = 
				JOptionPane.showInputDialog("Enter the Maths marks: ");
		//convert the string to integer value --Integer.parseInt()
		int mathsmarks = Integer.parseInt(marksMathsString);
		
		//calculate the total marks
		int totalMarks = sciencemarks + mathsmarks;
		
		//display the details in the message box
		JOptionPane.showMessageDialog(null, "StudentName: " + studentName
				+ "\nStudentID: " + studentID
				+ "\nScience Marks: " + sciencemarks
				+ "\nMaths Marks: " + mathsmarks
				+ "\nTotal Marks: " + totalMarks);
	}
}
