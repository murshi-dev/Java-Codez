
public class Selection {
	public static void main(String[] args) {
		//create an array and initialise
		int[] array= {13,17,16,15,19,12 };
		//function call
		selection(array);
		//print the sorted array
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	//selection function
	public static void selection(int[] list)
	{
		int n=list.length;
		for(int i=0;i<n-1;i++)//outer loop
		{
		int min=i;
		for(int j=i+1;j<n;j++)//inner loop
		{
			if(list[j]<list[min])
			{
				min=j;
			}
		}
		//swap contents
		int temp=list[i];
		list[i]=list[min];
		list[min]=temp;
		}
	}
}
