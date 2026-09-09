import java.util.*;
public class EmployeeBonus 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		 //declare required variables
        double salary, bonus, finalSalary;
        
        System.out.print("Enter salary: RM ");
        salary = input.nextDouble();
        
        if (salary >= 3000) 
            bonus = salary * 0.10;
        else 
            bonus = salary * 0.05;
        
        finalSalary = salary + bonus;
        
        System.out.println("Bonus: RM "+ bonus);
        System.out.println("Final Salary: RM " + finalSalary);
	}
}
