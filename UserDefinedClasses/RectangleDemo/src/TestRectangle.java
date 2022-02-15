
public class TestRectangle {

	public static void main(String[] args) {
		
		//create first object
		Rectangle r1=new Rectangle(4,40);
		//create second object
		Rectangle r2=new Rectangle(5,39);
		
		System.out.println("Area of r1 is: "+r1.getArea());
		System.out.println("Perimeter of r1 is: "+r1.getPerimeter());
		
		System.out.println("Area of r2 is: "+r2.getArea());
		System.out.println("Perimeter of r2 is: "+r2.getPerimeter());

	}

}
