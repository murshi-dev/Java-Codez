
public class InsertionSort {
	public static void insertionSort(int[] list)
	{
		int n = list.length;
		//outer loop
		for(int i=1;i<n;i++)
		{
			int newElement = list[i];
			int loc = i-1;
			//inner loop
			while(loc>=0 && list[loc]>newElement)
			{
				list[loc+1] = list[loc];
				loc=loc-1;
			}
			//insert new element in correct position
			list[loc+1] = newElement;
		}
	}
	public static void main(String[] args) 
	{
		int[] list = {13, 17, 16, 15, 19, 12};
		System.out.println("Unsorted Array: ");
		for(int num:list)
		{
			System.out.print(num + " ");
		}
		//function call to sort
		insertionSort(list);
		System.out.println("Sorted Array: ");
		for(int num:list)
		{
			System.out.print(num + " ");
		}
	}
}







