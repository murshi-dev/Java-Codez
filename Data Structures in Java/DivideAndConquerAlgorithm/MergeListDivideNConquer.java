
public class MergeListDivideNConquer {

	public static void merge(int[] list, int start1,int end1, int start2, int end2)
	{
		//temp array to hold merged result
		int[] result=new int[end2-start1+1];
		int finalStart=start1;
		int finalEnd=end2;
		int indexC=0;//index for temp array
		
		//merging loop
		while(start1<end1 && start2<end2)
		{
			if(list[start1]<list[start2])
			{
				result[indexC]=list[start1];
				start1++;
			}
			else
			{
				result[indexC]=list[start2];
				start2++;
			}
			indexC++;
		}
		//copy remaining elements from the first sublist
		for(int i=start1;i<=end1;i++)
		{
			result[indexC]=list[i];
			indexC++;
		}
		//copy remaining elements from the second sublist
		for(int i=start2;i<=end2;i++)
		{
			result[indexC]=list[i];
			indexC++;
		}
		//copy merged result back to orginal list -- list
		indexC=0;
		for(int i=finalStart;i<=finalEnd;i++)
		{
			list[i]=result[indexC];
			indexC++;
		}
	}
	public static void main(String[] args) {
		int[] list= {2,4,6,8,1,3,5,7};
		int start1=0;
		int end1=3;
		int start2=4;
		int end2=7;
		//function call
		merge(list,start1,end1,start2,end2);
		//print results
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+ " ");

	}

}
