import java.util.*;
public class OvertimePay 
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        double hours, extraHours, normalPay, overtimePay, totalPay;

        System.out.print("Enter hours worked: ");
        hours = input.nextDouble();

        if (hours < 40) 
        {
            normalPay = hours * 15;
            overtimePay = 0;
            totalPay = normalPay;
            System.out.println("No Overtime");
        }
        else 
        {
        	extraHours = hours - 40;//find the extra hours worked 
        	
        	normalPay = 40 * 15; //calculate normal pay with RM15/hour
            overtimePay = extraHours * 20; //calculate OT pay with RM20/hour
           
            totalPay = normalPay + overtimePay;
            System.out.println("Overtime Applied");
        }

        System.out.println("Normal Pay: RM "+ normalPay);
        System.out.println("Overtime Pay: RM "+ overtimePay);
        System.out.println("Total Pay: RM "+ totalPay);


	}

}
