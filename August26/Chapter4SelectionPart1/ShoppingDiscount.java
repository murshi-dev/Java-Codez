import java.util.*;
public class ShoppingDiscount 
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        //declare required variables
        double purchaseAmount, discount, finalAmount;
        
        System.out.print("Enter purchase amount: RM ");
        purchaseAmount = input.nextDouble();
        
        if (purchaseAmount >= 100) 
        {
            discount = purchaseAmount * 0.10;
            finalAmount = purchaseAmount - discount;
            System.out.println("Discount Applied");
        } 
        else 
        {
            discount = 0;
            finalAmount = purchaseAmount;
            System.out.println("No Discount");
        }
        System.out.println("Discount: RM " + discount);
        System.out.println("Final Amount: RM " + finalAmount);
	}
}
