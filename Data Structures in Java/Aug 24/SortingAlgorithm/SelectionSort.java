
public class SelectionSort {
	public static void selectionSort(int[] list)
	{
		int n = list.length;
		//outer loop
		for(int i=0;i<n-1;i++){
			int min=i;
			//inner loop
			for(int j=i+1;j<n;j++){
				//check each element with min
				if(list[j]<list[min]){
					min=j;
				}
			}
			//swap the new min element with element at index i
			int temp = list[i];
			list[i] = list[min];
			list[min] = temp;
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
		selectionSort(list);
		System.out.println("Sorted Array: ");
		for(int num:list)
		{
			System.out.print(num + " ");
		}
	}
}




