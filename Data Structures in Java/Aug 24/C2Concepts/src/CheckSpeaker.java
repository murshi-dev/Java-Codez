
public class CheckSpeaker {

	public static void main(String[] args) {
	
		//create object/instance  for Dog class
		Speaker dog=new Dog();
		
		//create object/instance  for Philosopher class
		Speaker philosopher=new Philosopher("To be or not to be");
		
		//create object/instance  for Advanced Philosopher class
		AdvancedPhiolosopher ap=new AdvancedPhiolosopher("it is what it is");
		
		//using the dog instance call the speak() and announcement()
		dog.speak();
		dog.announce("the dog is happy");
		
		
		//using the Philosopher instance call the speak() and announcement()
		philosopher.speak();
		philosopher.announce("Good Day");
		
		//using the ap instance call speak() announce() and reflect()
		ap.speak();
		ap.announce("listen before speaking");
		ap.reflect();
	}

}
