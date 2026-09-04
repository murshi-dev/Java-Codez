/*Cinema Tickets — A cinema sells tickets at a price entered by the user. 
 * Write a Java program using Scanner to input:
Ticket price,Number of tickets,Amount paid
Calculate and display:Total ticket cost,Balance*/

import java.util.*;
public class CinemaTickets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt and input
		System.out.println("Enter the ticket price: ");
		double ticketPrice = input.nextDouble();
		
		System.out.println("Enter the number of tickets: ");
		int numberOfTickets = input.nextInt();
		
		//calculation
		double calcPrice = ticketPrice * numberOfTickets;
		
		//output
		System.out.println("Total Amount: "+calcPrice);
		
		//Prompt for amount paid
		System.out.println("Enter the cash received: ");
		double cashReceived = input.nextDouble();
		
		double balanceAmount = cashReceived - calcPrice;
		
		System.out.println("Balance: "+balanceAmount);

	}

}
