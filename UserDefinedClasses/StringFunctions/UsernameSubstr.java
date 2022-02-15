import java.util.*;
public class UsernameSubstr {

	public static void main(String[] args) {
		System.out.println("Enter a valid email:");
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        getvalues(s1);

	}
	public static void getvalues(String s1) {
        String s2 = s1.substring(0,s1.indexOf("@"));
        System.out.println(s2);
    }

}


