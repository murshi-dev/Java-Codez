import java.util.*;
public class DeliveryCharge {
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter purchase amount: RM");
        double amount = input.nextDouble();

        if (amount >= 150) 
        {
            System.out.println("Free Delivery");
        } 
        else 
        {
        	//add on 10
        	amount = amount + 10;
            System.out.println("Delivery Charge: RM10");
        }
        System.out.printf("Final Amount: RM ", amount);
	}
}

