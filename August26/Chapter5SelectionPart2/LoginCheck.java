import java.util.Scanner;
public class LoginCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username="", password="";

        System.out.print("Enter username: ");
        username = input.next();

        if (username.equals("admin")) 
        {
            System.out.print("Enter password: ");
            password = input.next();

            if (password.equals("12345")) 
                System.out.println("Login Successful");
            else 
                System.out.println("Incorrect Password");
        } 
        else 
            System.out.println("Invalid Username");   
    }
}

