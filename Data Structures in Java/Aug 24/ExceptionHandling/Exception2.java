
public class Exception2 {
	public void initialiseArray() throws ArrayIndexOutOfBoundsException
	{
		int[] array = new int[3];
	
		for(int i=0;i<4;i++)
		{
			array[i]=i;
			System.out.println("Array["+i+"]"+array[i]);
		}
	}
	public static void main(String[] args) {
		Exception2 exception2=new Exception2();
		//delegating the responsibility of calling th
		//exception to the caller of the method
		try
		{
		exception2.initialiseArray();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}

