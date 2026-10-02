public class NumberPatternNestedLoop4
{
	public static void main(String[] args) 
	{
		//outer loop --3 ROWS 
		for(int row = 1; row <= 3; row++)
		{
			//inner loop -- repeat based on the number of ROWS  
			for(int col = 1; col <= row; col++)
			{
				System.out.print((row+col)+ " ");
			}
			System.out.println();
		}
	}

}
