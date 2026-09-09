import java.util.*;
public class ProfitOrLoss {
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
   
        System.out.print("Enter cost price: RM ");
        double costPrice = input.nextDouble();
        
        System.out.print("Enter selling price: RM ");
        double sellingPrice = input.nextDouble();
      
        double difference = sellingPrice - costPrice;
       
        if (sellingPrice > costPrice) 
           System.out.println("Profit: RM " + difference);
        else
            System.out.println("Loss: RM "+ difference);
      }
}


