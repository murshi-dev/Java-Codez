import java.util.*;
public class DeliveryChargeMultiIfElse {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        double distance, rate, charge;

	        System.out.print("Enter the delivery distance (in km): ");
	        distance = input.nextDouble();

	        if (distance <= 3) 
	            rate = 4.00;
	        else if (distance <= 8) 
	            rate = 3.50;
	        else if (distance <= 15) 
	            rate = 3.00;
	        else 
	            rate = 2.00;
	        
	        charge = distance * rate;

	        System.out.println("The total delivery charge is: RM "+ charge);
	}
}
