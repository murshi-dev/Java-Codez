
public class TestCircle {

	public static void main(String[] args) {
		
		//create object for Circle class
		Circle circleobject1=new Circle();
		
		//using the circleobject1 call the methods
		//assign radius using setRadius
		circleobject1.setRadius(5);
		//display radius using getRadius
		System.out.println("Entered Radius is: "+ circleobject1.getRadius());
		//calculate the area using calculateArea`
		System.out.println("Area is: "+ circleobject1.calculateArea());
		
		

	}

}
