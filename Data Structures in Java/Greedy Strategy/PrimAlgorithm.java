
public class PrimAlgorithm {

	public static void main(String[] args) {
		//initialise the graph
		int[][] graph = {
				{0,25,23,0,24},
				{25,0,24,25,22},
				{23,24,0,24,0},
				{0,25,24,0,22},
				{24,22,0,22,0}
		};
		//create object
		PrimAlgorithm  primAlgorithm = new PrimAlgorithm();
		//call the function
		primAlgorithm.prim(graph.length,graph); 
	}
	
	public void prim(int n,int[][] cost)
	{
		//takes two parameters - n is number of vertices
		//cost is the edge value
		//Initialize the variables
		int[] nearest = new int[n];
		int[][] tree = new int[n-1][2];
		boolean[] visited = new boolean[n];
		int mincost=0;
		
		//mark all vertex as non visited
		for(int i=0;i<n;i++)
		{
			visited[i]=false;
		}
		
		//mark the first vertex as visited
		visited[0]=true;
		
		//initialise the nearest array to keep track of
		//the nearest vertex for each vertex in the MST
		for(int i=0;i<n;i++)
		{
			nearest[i]=0;
		}
		//choose the subsequent edges for the MST
		for(int count=0;count<n-1;count++)
		{
			int min=Integer.MAX_VALUE;
			int u=-1,v=-1;
			
			//find the edge with the min cost
			for(int i=0;i<n;i++)
			{
				//check if this vertex visited before
				if(visited[i])
				{
					for(int j=0;j<n;j++)
					{
						//check if not visited, check if an edge exits
						//also check if i and j cost is lees than min cost
						if(!visited[j] && cost[i][j]!=0 && cost[i][j]<min)
						{
							//all condition true -- store the min cost found so far
							min=cost[i][j];
							u=i;
							v=j;
							//u v represents the edge with min cost
						}
					}
				}
			}
			//mark the chosen vertex as visited
			visited[v]=true;
			//add the edge to the mst
			tree[count][0]=u;
			tree[count][1]=v;
			//update the min cost
			mincost+=min;
		}
		//print the mst
		System.out.println("MST edges are: ");
		//loop
		for(int i=0;i<n-1;i++)
		{
			System.out.println(tree[i][0]+ ","+ tree[i][1]);
		}
		//print the cost
		System.out.println("Min Cost "+ mincost);
	}

}
