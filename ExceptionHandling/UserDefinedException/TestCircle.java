
public class TestCircle {

	public static void main(String[] args) {
		Circle obj=new Circle();
		//STEP3--USE TRY CATCH BLOCK TO HANDLE EXPECTED EXCEPTIONS
		try {
			obj.setRadius(-99);
		}
		catch(InvalidRadiusException e)
		{
			e.printStackTrace();
		}

		System.out.println("Radius is"+obj.getRadius());
		System.out.println("Area is"+obj.calculateArea());

	}

}
