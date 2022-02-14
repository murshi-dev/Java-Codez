
import java.util.*;

public class TestGeometricObject {
	public static void main(String args[])
	{
		Circle circle=new Circle();
		System.out.println("Circle is"+circle.toString());
		System.out.println("Circle color is"+circle.getColor());
		System.out.println("Circle radius is"+circle.getRadius());
		System.out.println("Circle area is"+circle.getArea());
		System.out.println("Circle perimeter is"+circle.getPerimeter());
		
		Rectangle rectangle=new Rectangle(2,4);
		System.out.println("Rectangle is"+rectangle.toString());
		System.out.println("Rectangle color is"+rectangle.getColor());
	
		System.out.println("Rectangle area is"+rectangle.getArea());
		System.out.println("Rectangle perimeter is"+rectangle.getPerimeter());
	}
}
	