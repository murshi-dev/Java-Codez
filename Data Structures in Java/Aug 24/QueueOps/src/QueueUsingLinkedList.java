
public class QueueUsingLinkedList implements Queue 
{
	private LinkedNode front,rear;
	public QueueUsingLinkedList()
	{
		front=rear=null;//indiactes empty q
	}
	public boolean isEmpty()
	{
		return front==null;//q is empty when front is null
	}
	public Object peek()
	{
		return front.theObject;//theObject refers to the data in the LinkNode
	}
	public void put(Object x)
	{
		//create a new node and set it as the top
		LinkedNode newnode = new LinkedNode(x,null);
		if(front==null)
		{
			front=newnode;
			rear=newnode;
		}
		else
		{
		rear.next=newnode;//link the current rear node to the new node
		rear=newnode;//update rear to point to new node
		}
	}
	public Object remove()
	{
		Object frontObject = front.theObject;//store the front element
		front=front.next;//set the next node as the new front
		return frontObject;//return the removed element
	}

	public static void main(String[] args) 
	{
		Queue queue = new QueueUsingLinkedList();
		queue.put('A');
		queue.put('B');
		queue.put('C');
		System.out.println("Front Element is: "+queue.peek());//A
		queue.remove();
		System.out.println("Front Element is: "+queue.peek());//B
		System.out.println("QueueLinkedList is empty? "+queue.isEmpty());//false

	}

}
