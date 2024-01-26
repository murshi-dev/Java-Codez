
public class Insertion {

	public static void main(String[] args) {
	
		//create an array and initialise
		int[] array= {13,17,16,15,19,12 };
		insertion(array);
		//print the sorted array
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}
	//function for insertion
	public static void insertion(int[] list)
	{
		int n=list.length;
		for(int i=1;i<n;i++)//outer loop
		{
			int key=list[i];
			int j=i-1;
			//shift elements greater then key to the right
			while(j>=0 && list[j]>key) //inner loop
			{
				list[j+1]=list[j];
				j--;
			}
			//place the key in correct position
			list[j+1]=key;
		}
	}

}
