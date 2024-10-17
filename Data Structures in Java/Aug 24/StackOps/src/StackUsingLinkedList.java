
public class StackUsingLinkedList implements Stack 
{

	//top of the stack
	private LinkNode top;
	//constructor
	public StackUsingLinkedList()
	{
		top=null;
	}
	//check for empty stack
	public boolean isEmpty()
	{
		return top==null;
	}
	//return top element
	public Object peek()
	{
		return top.theObject;//theObject refers to the data in the LinkNode
	}
	//add element to the stack
	public void push(Object x)
	{
		//create a new node and set it as the top
		top = new LinkNode(x,top);
	}
	//remove element from stack
	public Object pop()
	{
		Object topObject = top.theObject;//store the top element
		top = top.next;//set the next node as the new top
		return topObject;//return the removed element
	}
	public static void main(String[] args) {
		Stack stacklinkedlist = new StackUsingLinkedList();
		//push few elements to the stack
		stacklinkedlist.push(10);
		stacklinkedlist.push(20);
		stacklinkedlist.push(30);
		
		System.out.println("Top element is: "+stacklinkedlist.peek());
		stacklinkedlist.pop();
		System.out.println("Top element is: "+stacklinkedlist.peek());
		System.out.println("Stack Linked List is empty? "+stacklinkedlist.isEmpty());

	}

}
