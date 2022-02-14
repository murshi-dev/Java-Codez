
public class TestPolymorphism {

	public static void main(String[] args) {
		//create object for Rectangle class
		Rectangle r=new Rectangle();
		r.setLength(5);
		r.setWidth(10);
		//call the area from rectangle class
		System.out.println("area of rectangle is "+r.displayArea());
		
		Triangle t=new Triangle();
		t.setLength(15);
		t.setWidth(100);
		//call the area from triangle class
		System.out.println("area of triangle is "+t.displayArea());

	}

}
