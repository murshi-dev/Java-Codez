import java.util.Scanner;
public class PrintingCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pages=0;
        double rate=0.0, cost=0.0;

        System.out.print("Enter number of pages: ");
        pages = input.nextInt();

        if (pages <= 20) 
            rate = 0.20;
        else if (pages <= 50) 
            rate = 0.15;
        else if (pages <= 100) 
            rate = 0.10;
        else 
            rate = 0.08;
        
        cost = pages * rate;

        System.out.println("Total printing cost: RM " + cost);
    }
}

