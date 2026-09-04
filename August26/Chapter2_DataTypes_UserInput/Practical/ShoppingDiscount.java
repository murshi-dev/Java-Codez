/*Shopping Discount — A customer buys a product from a shop.
Write a Java program using JOptionPane to input:Product price
Discount percentage. Calculate and display: Discount amount, 
Final price*/
import javax.swing.*;
public class ShoppingDiscount {

	public static void main(String[] args) {
		
		//prompt and input price and discount value
		String priceInput = JOptionPane.showInputDialog
				              ("Enter product price: ");
		String discountInput = JOptionPane.showInputDialog
	              ("Enter discount percentage: ");
		
		//convert the string inputs to decimal values
		double price = Double.parseDouble(priceInput);
		double discountPercentage = Double.parseDouble(discountInput);
		
		//calculation 
		double discountAmount = price * discountPercentage / 100;
		double finalPrice = price - discountAmount;
		
		//display the final price in console
		System.out.println("Final Price: "+finalPrice);
		//display the final price in dialog 
		JOptionPane.showMessageDialog(null, finalPrice);
		}
	}
