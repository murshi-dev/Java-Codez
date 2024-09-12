
public class LinearListUsingArrays implements LinearList 
{
	//create an array to store elements
	private Object[] elementArray;
	//specify the size of array
	private int size;
	//Default Constructor
	public LinearListUsingArrays()
	{
		//set the initial capacity to 5
		this(5);
	}
	//constructor with initial capacity
	public LinearListUsingArrays(int initialCapacity)
	{
		if(initialCapacity<1)
		{
			throw new IllegalArgumentException("capacity must be greater than 1");
		}
		//otherwise initialisation is done
		elementArray=new Object[initialCapacity];//array created here
		size=0;
	}
	//check if the list is empty
	public boolean isEmpty() 
	{
		return size==0;
	}
	//check the list size
	public int size() 
	{
		return size;
	}
	public void add(int index,Object obj)
	{
		//check if the index is valid
		if(index<0||index>size)
		{
			throw new IndexOutOfBoundsException("index exceeded");
		}
		//check if the array size is full
		//size-returns the number of elements in the list
		//length - capacity of the array
		if(size==elementArray.length)
		{
			//create new array double the original array size
			Object[] newArray=new Object[elementArray.length*2];
			//copy old array contents to new array
			System.arraycopy(elementArray, 0, newArray, 0, size);
			//replace old array with new larger array
			elementArray=newArray;
		}
		//shifting elements to the right
		//use for loop to move
		for(int i=size-1;i>=index;i--)
		{
			//replace next element with previous element
			elementArray[i+1]=elementArray[i];
		}
		//add the new element
		elementArray[index]=obj;
		//increment the array size
		size++;
	}
	public Object remove(int index)
	{
		//check if the index is valid
		if(index<0||index>size)
		{
			throw new IndexOutOfBoundsException("index exceeded");
		}
		//save the element to be removed
		Object removedElement=elementArray[index];
		//shift elements left to fill the gap
		for(int i=index+1;i<size;i++)
		{
			elementArray[i-1]=elementArray[i];
		}
		elementArray[--size]=null;//nullify the last element after shifting
		return removedElement;
	}
	public String outputList()
	{
		StringBuffer s=new StringBuffer("[");
		for(int i=0;i<size;i++) 
		{
			if(elementArray[i]==null)
			{
				s.append("null,");
			}
			else
			{
				s.append(elementArray[i].toString()).append(", ");
			}
		}
		if(size>0)
		{
			s.delete(s.length()-2, s.length());//removes trailing ","
		}
		s.append("]");
		return s.toString();
	}
	
	public Object get(int index) 
	{
		//check if the index is valid
		if(index<0||index>size)
		{
			throw new IndexOutOfBoundsException("index exceeded");
		}
		return elementArray[index];
	}
	public int indexOf(Object obj)
	{
		for(int i=0;i<size;i++)
		{
			if(elementArray[i].equals(obj))
			{
			  return i;	
			}
		}
		return -1;//if element not found
	}

}









