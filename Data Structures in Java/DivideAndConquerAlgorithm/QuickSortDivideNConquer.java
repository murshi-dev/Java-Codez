
public class QuickSortDivideNConquer {
	
	public static int pivotList(int[] list,int first,int last)
	{
		//initialize the pivot values
		int pivotValue=list[last];
		int pivotIndex=first;
		//iterate through the list
		for(int i=first;i<last;i++)
		{
			if(list[i]<pivotValue) 
			{
				//swap
				int temp=list[i];
				list[i]=list[pivotIndex];
				list[pivotIndex]=temp;
				//increment the index
				pivotIndex++;
			}
		}
		//swap pivotValue with list[pivotIndex]
		int temp=list[pivotIndex];
		list[pivotIndex]=list[last];
		list[last]=temp;
		return pivotIndex;
	}
	
	//general quick sort 
	public static void quickSort(int[] list,int first,int last)
	{
		if(first<last)
		{
			int pivotIndex=pivotList(list,first,last);
			//call quick sort to sort left sub list
			quickSort(list,first,pivotIndex-1);
			//call quick sort to sort right sub list
			quickSort(list,pivotIndex+1,last);
		}
	}
	
	public static void main(String[] args) {
		 	//initialize array
			int[] arr= {7,2,1,8,6,3,5,4};
			//call the function
			quickSort(arr,0,arr.length-1);
			//display sorted array
			System.out.print("Sorted Array: ");
			for(int num:arr)
			{
				System.out.print(num+" ");
			}
		 
	}

}
