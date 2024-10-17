
public class StackUsingArrays implements Stack
{

	//declare an array to hold stack elements
	private Object[] stack;
	//declare the top element
	private int top;
	//constructor
	public StackUsingArrays(int initialCapacity)
	{
		stack=new Object[initialCapacity];
		//initialise the stack to empty
		top=-1;
	}
	//constructor with stack capacity 10
	public StackUsingArrays()
	{
		this(10);
	}
	//to check if stack is empty
	public boolean isEmpty()
	{
		return top == -1;
	}
	//retrieve the top element
	public Object peek()
	{
		return stack[top];
	}
	//add elements to stack
	public void push(Object x)
	{
		if(top==stack.length-1)	//in case if the array is full
		{
			//double the array size--step 1
			Object[] newArray = new Object[stack.length*2];
			//copy the old array contents(stack) to new array(newArray) --step 2
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			//rename/reassign the new array to the original array --step 3
			stack=newArray;
		}
		//push the new element x to the next index of top
		stack[++top] = x;
	}
	//remove elements from stack
	public Object pop()
	{
		Object topElement = stack[top];
		stack[top--] = null;//set the top elemnt to null, and decrement the pointer
		return topElement;
	}
	public static void main(String[] args) 
	{
		Stack stack = new StackUsingArrays();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Top element is: "+stack.peek());//30
		stack.pop();//30 will be removed
		System.out.println("Top element is: "+stack.peek());//20
		
		System.out.println("Stack is empty? "+stack.isEmpty());//false
	}
}
