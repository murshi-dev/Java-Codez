public class MultiplyTablePatternNestedLoop 
{
	public static void main(String[] args) 
	{
		//outer loop --3 ROWS 
		for(int row = 1; row <= 3; row++)
		{
			//inner loop -- 5 columns   
			for(int col = 1; col <= 5; col++)
			{
				//table generation format
				System.out.println(row + "*" + col + "=" + (row*col));
			}
			System.out.println();
		}

	}

}
