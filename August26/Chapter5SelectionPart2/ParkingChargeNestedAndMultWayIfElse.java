import java.util.*;
public class ParkingChargeNestedAndMultWayIfElse {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char type;
        double hours=0.0, rate=0.0, charge=0.0;
        
        System.out.print("Enter parking type(D/H): ");
        type = input.next().charAt(0);
        
        //check if type is day pass/hourly pass
        if(type == 'D')
        {
        		charge = 20.0;
        }
        else 
        {
        		if(type == 'H')
        		{
        			System.out.print("Enter the parking hours: ");
        			hours = input.nextDouble();
        			//check the rate based on hours --multi if else
        			if (hours <= 2) 
        				rate = 2.00;
        			else if (hours <= 5) 
        				rate = 3.00;
        			else if (hours <= 8) 
        				rate = 4.00;
        			else 
        				rate = 5.00;
        				
        			//calculate charges
        			charge = hours * rate;
        		}
        	}
        System.out.println("The total parking charge is: RM "+ charge);
	}
}
