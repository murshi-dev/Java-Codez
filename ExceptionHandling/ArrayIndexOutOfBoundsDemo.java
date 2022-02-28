//ArrayIndexOutOfBounds--exception raised when array 
//is accessed outside its length
public class ArrayIndexOutOfBoundsDemo {

	public static void main(String[] args) {
	//create and initialise an array
		int num[]= {23,66,45,33,22,11};
		//display the array
		try {//since array is accesed beyond its length, exception
			//is raised here
		for(int i=0;i<=num.length;i++)
		{
			System.out.println(num[i]+"");
		}//close for
		}//close try
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("cannot access element beyond its length");
			System.out.println("print stack trace method:");
			//ways to display exception message to user
			//1. printStackTrace() //2.getMessage
			e.printStackTrace();//will display the track of exceptions raised
			//along with the line number where exception was raised
			System.out.println("get message:");
			System.out.println(e.getMessage());
			//prints only the source of exception
		}
		
	}//close main

}//close class
