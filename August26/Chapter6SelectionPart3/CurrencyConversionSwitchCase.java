import java.util.*;
public class CurrencyConversionSwitchCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("1. MYR to SGD\n 2. MYR to USD\n3. MYR to INR\n4. MYR to CNY"); 
		System.out.print("Enter choice: "); 
		int choice = input.nextInt(); 
		System.out.print("Enter amount in MYR: "); 
		double myr = input.nextDouble(); 
		double result=0.0; 
		switch (choice) 
		{ 
			case 1: 
				result = myr * 0.3115; 
				System.out.println("SGD = " + result); 
				break; 
			case 2: 
				result = myr * 0.24; 
				System.out.println("USD = " + result); 
				break; 
			case 3: 
				result = myr * 23.0; 
				System.out.println("INR = " + result); 
				break; 
			case 4: 
				result = myr * 1.70; 
				System.out.println("CNY = " + result); 
				break; 
			default: 
				System.out.println("Invalid choice"); 
		}

	}

}
