import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare required variables
        double units, rate, bill;
        //prompt and input units
        System.out.print("Enter units consumed: ");
        units = input.nextDouble();
        //check the rate using if else
        if (units <= 100) 
            rate = 0.20;
        else if (units <= 200)
            rate = 0.30;
        else if (units <= 300)
            rate = 0.40;
        else 
            rate = 0.50;
        //calculate bill
        bill = units * rate;
        //output
        System.out.println("Total electricity bill: RM " + bill);
    }
}
