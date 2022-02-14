import java.util.*;
public class TestInheritance {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1=input.nextInt();
		System.out.println("Enter second number: ");
		int n2=input.nextInt();
		
		//addition process
		//create object for addition class
		Addition add_obj=new Addition();
		//call setter methods defined in calculation class
		add_obj.setNum1(n1);
		add_obj.setNum2(n2);
		//do the add process using addnum() defined in Addition class
		System.out.println("Added value is "+add_obj.addNum());
		
		//multiplication process
		//create object for multiplication class
		Multiplication mul_obj=new Multiplication();
		//call setter methods defined in calculation class
		add_obj.setNum1(n1);
		add_obj.setNum2(n2);
		//do the add process using mulnum() defined in Multiplication class
		System.out.println("Multiplied value is "+mul_obj.mulNum());
		

	}

}
