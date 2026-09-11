import java.util.*;
public class ParkingChargeMultiIfElse {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours, rate, charge;
        System.out.print("Enter the parking hours: ");
        hours = input.nextDouble();

        if (hours <= 2) 
            rate = 2.00;
        else if (hours <= 5) 
            rate = 3.00;
        else if (hours <= 8) 
            rate = 4.00;
        else 
            rate = 5.00;
        
        charge = hours * rate;
        System.out.println("The total parking charge is: RM "+ charge);

	}

}
