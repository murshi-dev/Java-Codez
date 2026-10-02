public class NumberPatternNestedLoop2 
{
	public static void main(String[] args) 
	{
		//outer loop --3 ROWS 
		for(int row = 1; row <= 3; row++)
		{
			//inner loop --5 COLUMNS 
			for(int col = 1; col <= 5; col++)
			{
				System.out.print(col+ " ");
			}
			System.out.println();
		}

	}

}
