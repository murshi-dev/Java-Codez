import java.util.*;
import java.io.*;
public class ReadDataFromTextFile {

	public static void main(String[] args) {
		try {
		File file=new File("sample.txt");
		//create a scanner for the file
		Scanner input=new Scanner(file);
		//file is going to be source of input
		//for the Scanner class
		//READ from the file
		while(input.hasNext())//to read one line after another
		{
			String firstname=input.next();//reads firstname
			String lastname=input.next();//reads lastname
			int age=input.nextInt();//read age value number
			//output this to console
			System.out.print(firstname);
			System.out.println(lastname);
			System.out.println(age);
				
		}//close while
		//close file
		input.close();
		}//close try
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}//close catch

	}

}
