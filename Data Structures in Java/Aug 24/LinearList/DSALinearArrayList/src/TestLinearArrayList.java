
public class TestLinearArrayList {

	public static void main(String[] args) {
		
		LinearListUsingArrays list=new LinearListUsingArrays();
		//add elements
		list.add(0, "A");
		list.add(1, "B");
		list.add(2, "C");
		
		
		//display the list
		System.out.println("List: "+list.outputList());
		
		//get element at index 1
		System.out.println("Element at index 1: "+list.get(1));

		//get index of element 
		System.out.println("index of C: "+list.indexOf("C"));
		
		//remove  element at index 0
		System.out.println("Removed Element: "+list.remove(0));
		
		//display the list again
		System.out.println("List after removal: "+list.outputList());
		
		//add elements
		list.add(2, "N");
		//display the list again
		System.out.println("List after addition: "+list.outputList());
		
		//add elements
		list.add(3, "P");
		//display the list again
		System.out.println("List after addition: "+list.outputList());
		
		//add elements
		list.add(4, "Q");
		//display the list again
		System.out.println("List after addition: "+list.outputList());
		
		//add elements
		list.add(4, "R");
		//display the list again
		System.out.println("List after addition: "+list.outputList());
		
		//add elements
		list.add(5, "S");
		//display the list again
		System.out.println("List after addition: "+list.outputList());
	}
	

}
