import java.util.*;
public class PreDefinedMethods 
{
	public static void main(String[] args) 
	{
		//1. Mathematical methods
		double squareRoot36 = Math.sqrt(36);
		System.out.println("Square root of 36: " + squareRoot36);
		
		double squareRoot49 = Math.sqrt(49);
		System.out.println("Square root of 49: " + squareRoot49);
		
		double power2to3 = Math.pow(2,3);
		System.out.println("Power of 2 raised to 3: " + power2to3);
		
		double power5to2 = Math.pow(5,2);
		System.out.println("Power of 5 raised to 2: " + power5to2);
		
		int maxNumber = Math.max(15, 25);
		System.out.println("Max value: " + maxNumber);
		
		int minNumber = Math.min(150, 250);
		System.out.println("Min value: " + minNumber);
		
		double roundedValue1 = Math.round(7.6);
		System.out.println("Rounded value1: " + roundedValue1);
		
		double roundedValue2 = Math.round(53.1);
		System.out.println("Rounded value2: " + roundedValue2);
		
		double randomNumber = Math.random();
		System.out.println("Random Number: " + randomNumber);
		
		int randomNumber1to10= (int)(Math.random()*10)+1;
		System.out.println("Random Number from 1 to 10: " 
									+ randomNumber1to10);
		
		int randomNumber50to100= (int)(Math.random()*51)+50;
		System.out.println("Random Number from 50 to 100: " 
				+ randomNumber50to100);

		//second way to generate random number 
		Random random = new Random();
		int randomVariable = random.nextInt(10);
		System.out.println("Random Number from 1 to 10: " 
				+ randomVariable);
		
		int randomVariable50to100 = random.nextInt(51) + 50;
		System.out.println("Random Number from 50 to 100: " 
				+ randomVariable50to100);
		
		//String methods
		String sampleText = "hello java";
		
		int stringLength = sampleText.length();
		System.out.println("String length is: "+stringLength);//10
		
		String uppercaseString = sampleText.toUpperCase();
		System.out.println("Uppercase String is: "
							+uppercaseString);
		
		String lowercaseString = sampleText.toLowerCase();
		System.out.println("Lowercase String is: "
							+lowercaseString);
	}

}
