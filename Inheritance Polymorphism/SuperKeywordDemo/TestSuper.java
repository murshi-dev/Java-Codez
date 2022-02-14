
public class TestSuper {

	public static void main(String[] args) {
		//create object for Box and find volume
		Box boxobj=new Box(12,5,3);
		System.out.println("Box Volume is "+ boxobj.getVolume());
		
		//create object for Rectangle and find area
		Rectangle rectobj=new Rectangle(12,5);
		System.out.println("Rectangle Area is "+ rectobj.getArea());

	}

}
