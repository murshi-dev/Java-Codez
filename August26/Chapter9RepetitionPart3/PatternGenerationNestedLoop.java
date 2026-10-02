public class PatternGenerationNestedLoop 
{
	public static void main(String[] args) 
	{
		//outer loop --3 ROWS 
		for(int row = 1; row <= 3; row++)
		{
			//inner loop --4 COLUMNS 
			for(int col = 1; col <= 4; col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
