import java.util.*;
public class TestPersonalData {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//create object 
		PersonalData person1=new PersonalData();
		
		System.out.println("Enter Name: ");
		String name=input.next();
		person1.setName(name);
		
		System.out.println("Enter Address:");
		String address=input.next();
		person1.setAddress(address);
		
		System.out.println("Enter Age:");
		int age=input.nextInt();
		person1.setAge(age);
		
		System.out.println("Enter Phone:");
		int phone=input.nextInt();
		person1.setPhone(phone);
		
		//display values using getter methods
		System.out.println("Entered name: "+ person1.getName());
		System.out.println("Entered address: "+ person1.getAddress());
		System.out.println("Entered age: "+ person1.getAge());
		System.out.println("Entered phone: "+ person1.getPhone());
	}

}
