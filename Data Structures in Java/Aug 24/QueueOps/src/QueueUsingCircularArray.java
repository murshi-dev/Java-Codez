
public class QueueUsingCircularArray implements Queue
{
	private int front,rear;//declare the fron and rear points
	private Object[] queue;//an array to hold the elements
	//constructor
	public QueueUsingCircularArray(int initialCapacity)
	{
		queue=new Object[initialCapacity+1];
		front=rear=0;//start from an empty array
	}
	public QueueUsingCircularArray() 
	{
		this(10);
	}
	public boolean isEmpty()
	{
		return front==rear;//if front = rear-->queue is empty
	}
	public Object peek()
	{
		//return the element at the front of the queue
		return queue[(front+1)%queue.length];
	}
	public void put(Object theObject)
	{
		//check if the queue is full
		if((rear+1)%queue.length == front)
		{
			//double the array size
			Object[] newQueue = new Object[2*queue.length];
			//find the starting point of the q - next element after front
			int start = (front+1)%queue.length;
			//copy the elements
			System.arraycopy(queue, start, newQueue, 0, rear-start+1);
			//update the front and rear positions
			front=newQueue.length-1;//set front to the last position in the new array
			rear=queue.length-2;//set rear to the last filled position in the old array
			//reassign the new array to old array
			queue=newQueue;
		}
		//add an elemnt into the array
		rear=(rear+1)%queue.length;//identify the index to add next element
		queue[rear]= theObject;//store the new element at the rear/end
		
	}
	public Object remove()
	{
		front=(front+1)%queue.length;//identify the index to remove an element
		Object frontObject = queue[front];//retrieve the front element
		queue[front]=null;//to delete the current front element
		return frontObject;
		
	}
	public static void main(String[] args)
	{
		Queue queue = new QueueUsingCircularArray();
		queue.put('A');
		queue.put('B');
		queue.put('C');
		System.out.println("Front Element is: "+queue.peek());//A
		queue.remove();
		System.out.println("Front Element is: "+queue.peek());//B
		System.out.println("Queue is empty? "+queue.isEmpty());//false
		

	}

}
