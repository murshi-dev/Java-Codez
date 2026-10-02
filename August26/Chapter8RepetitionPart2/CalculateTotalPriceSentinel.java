import java.util.*;
public class CalculateTotalPriceSentinel {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int total = 0;
		int sentinelOption = 1;//rule 1
		while(sentinelOption != 0)//rule 2
		{
			System.out.println("Enter the price of the item: ");
			int price = input.nextInt();

			total = total + price;//accumulative total 

			System.out.println("Continue(0 to Exit /1 to Continue)?: ");
			sentinelOption = input.nextInt();//rule 3
		}
		System.out.println("Total Price of all items is " + total);
	}
}

