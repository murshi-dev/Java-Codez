//STEP 1-CREATING A EXCEPTION CLASS
//user defined exception
//extend a class "Exception"--base class for all Exceptions
public class InvalidRadiusException extends Exception{
//constructor
	InvalidRadiusException()
	{
		//display proper error message to user
		//in case of wrong input
		super("Invalid Radius Entered");
		//calls and overrides the base class constructor
	}
}
