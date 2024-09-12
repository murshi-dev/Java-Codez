
public class Exception3 {
	public void initialiseArray()
	{
		int[] array = new int[3];
	
		for(int i=0;i<4;i++) 
		{
			//if the array length has exceeded
			if(i>array.length) 
			{
				throw new ArrayIndexOutOfBoundsException("Index exceeded");
			}
			array[i]=i;
			System.out.println("Array["+i+"]"+array[i]);
		}
	}
	public static void main(String[] args) {
		Exception3 exception3=new Exception3();
		//delegate exception handling to caller of the method
		try
		{
		exception3.initialiseArray();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}

