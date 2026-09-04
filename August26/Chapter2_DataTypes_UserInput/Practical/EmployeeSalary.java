/*Employee Salary — An employee receives a basic salary 
 * and an allowance.Write a Java program using JOptionPane 
 * to input:Basic salary, Allowance, Deduction.
Calculate and display the final salary.*/
import javax.swing.*;
public class EmployeeSalary 
{
	public static void main(String[] args) 
	{
		//prompt and input salary, allowance, deduction
		String salaryInput = JOptionPane.
				showInputDialog("Enter the salary amount: ");
		String allowanceInput = JOptionPane.
				showInputDialog("Enter the allowaance amount: ");
		String deductionInput = JOptionPane.
				showInputDialog("Enter the deduction amount: ");
		
		//convert string inputs to decimal values
		double salary = Double.parseDouble(salaryInput);
		double allowance = Double.parseDouble(allowanceInput);
		double deduction = Double.parseDouble(deductionInput);
		
		//calculation
		double finalAmount = salary + allowance - deduction;
		
		//output
		JOptionPane.showMessageDialog(null, finalAmount);
	}
}
