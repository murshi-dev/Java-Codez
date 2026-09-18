import java.util.*;
public class AreaCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Rectangle\n 2. Triangle\n 3. Circle");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        double area = 0.0;
        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = input.nextDouble();
                System.out.print("Enter width: ");
                double width = input.nextDouble();
                area = length * width;
                System.out.println("Area = " + area);
                break;

            case 2:
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter height: ");
                double height = input.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area = " + area);
                break;

            case 3:
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area = " + area);
                break;

            default:
                System.out.println("Invalid choice");
        }
 }
}
