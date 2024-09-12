
public class Exception1 {
	
	public void initialiseArray()
	{
		int[] array = new int[3];//declare an array - size 3
		//size -number of elements is 3
		//index - starts from 0 to 2
		//use a loop to fill in the array with their index and display them
		try {
			for(int i=0;i<4;i++)
			{
				array[i]=i;
				System.out.println("Array["+i+"]"+array[i]);
			}
		}//try ends here
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index has exceeded "+e);
		}

	}

	public static void main(String[] args) 
	{
		Exception1 exception1=new Exception1();
		exception1.initialiseArray();
	}

}
