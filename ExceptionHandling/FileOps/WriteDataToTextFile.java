//program to create a text file and write some text to it
import java.io.*;
public class WriteDataToTextFile {

	public static void main(String[] args) {
		//creates a text file
		File file=new File("sample.txt");

		//check if file exists already
		if(file.exists())
		{
			System.out.println("File exists.");
			//exit program if file exists
			System.exit(0);
		}
		//use PrintWriter class to write some text/input some text 
		//to the sample.txt file
		try {
			PrintWriter out= new PrintWriter(file);
			//write some text to file
			out.print("John Doe");
			out.println("56");
			out.print("Amy Doe");
			out.println("40");
			out.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally {
	System.out.println("finally gets executed at all times, if exception raised or not");
			}
		}
}
