import java.util.Scanner;

public class DomainnameSubstr {

	public static void main(String[] args) {
		System.out.println("Enter a valid email:");
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        getvalues(s1);

	}
	public static void getvalues(String s1) {
        String s2 = s1.substring(s1.indexOf("@")+1);
        System.out.println(s2);
    }

}
