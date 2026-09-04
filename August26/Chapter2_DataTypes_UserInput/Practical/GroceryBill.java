/*Grocery Bill — A customer buys biscuits and juice from a grocery store. 
 * Write a Java program using Scanner to input:Price of one packet of biscuits, Number of packets
Price of one bottle of juice, Number of bottles. Calculate and display the total bill in the console.*/
import java.util.*;
public class GroceryBill 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//prompt and input the biscuit price and quantity
		System.out.println("Enter the price of one packet of biscuits: ");
		double biscuitPrice = input.nextDouble();
		
		System.out.println("Enter the number of packets: ");
		int biscuitQty = input.nextInt();
		
		//prompt and input the juice price and quantity
		System.out.println("Enter the price of one bottle of juice: ");
		double juicePrice = input.nextDouble();
		
		System.out.println("Enter the number of bottles: ");
		int juiceQty = input.nextInt();
		
		//calculation of totalBill
		double totalBill = (biscuitPrice * biscuitQty) 
									+ (juicePrice * juiceQty );
		
		//display the total bill
		System.out.println("Total Bill Amount: "+ totalBill);
	}

}
