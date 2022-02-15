import java.util.*;
public class TestTemperature {

	public static void main(String[] args) {
		
		char option='y';//initialisation
		while(option=='y') {//condition
			//create object
			Temperature t1=new Temperature();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter temperature in Fahrenheit: ");
			double fahrenheit=input.nextDouble();
			t1.setTemp(fahrenheit);
			System.out.println("Entered Fahrenheit is: "+t1.getTemp());
			System.out.println("Celcius valus is: "+ t1.convertTemp());
			
			System.out.println("Do yo need to continue(y/n)? ");
			option=input.next().charAt(0);
		}
		
	}

}
