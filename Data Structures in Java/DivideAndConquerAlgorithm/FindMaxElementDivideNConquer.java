
public class FindMaxElementDivideNConquer {
	
	private int[] numbers;
	
	public FindMaxElementDivideNConquer(int[] numbers)
	{
		this.numbers=numbers;
	}
	
	public int findMax(int low,int high)
	{
		int mid,max1,max2,max;
		if(low>=high-1)
		{
			if(numbers[low]>numbers[high])
			{
				max=numbers[low];
			}
			else
			{
				max=numbers[high];
			}
		}
		else
		{
			mid=(low+high)/2;
			max1=findMax(low,mid);//recursive call
			max2=findMax(mid+1,high);//recursive call
			if(max1>max2)
				max=max1;
			else
				max=max2;					
		}
		return max;
	}
	public static void main(String[] args) {
	int[] numbers= {7,6,1,5,4,3}; //provide input
	FindMaxElementDivideNConquer finder=new FindMaxElementDivideNConquer(numbers);
	int max=finder.findMax(0, numbers.length-1); //use length since size of array may vary
	System.out.println("Max element is : " + max);
}

}
