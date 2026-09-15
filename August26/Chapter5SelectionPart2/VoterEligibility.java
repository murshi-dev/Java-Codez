import java.util.Scanner;
public class VoterEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        String registered=" ";

        System.out.print("Enter age: ");
        age = input.nextInt();

        if (age < 18) 
            System.out.println("Applicant is too young to vote");
        else {
            System.out.print("Are you registered to vote? (yes/no): ");
            registered = input.next();
            //nested if else 
            if (registered.equalsIgnoreCase("yes")) 
                System.out.println("Applicant can vote");
            else 
                System.out.println("Applicant must register to vote");
            }
        
    }
}


