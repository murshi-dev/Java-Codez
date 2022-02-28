
public class StringOutOfBoundsDemo {

	public static void mainn(String[] args) {
		//declare a string
		String name="John doe";
		//display the name
		System.out.println("name:"+name);
		//display the number of charecters in name
		System.out.println("Number of charecters:"+name.length());
		try {
		//try to access an element beyond the length
		System.out.println(name.charAt(15));
		//exception will be raised here
		//since name length is lesser than 15
		}//close try
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			//or
			System.out.println(e.getMessage());
		}//close catch

	}

}
