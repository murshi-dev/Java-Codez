
public class TestInterface {

	public static void main(String[] args) {
		// Exam #1 had 100 questions and the student
		 // missed 20 questions.
		 FinalExam exam1 = new FinalExam(100, 20);
		
		 // Exam #2 had 100 questions and the student
		 // missed 30 questions.
		 FinalExam exam2 = new FinalExam(100, 30);
		
		 // Display the exam scores.
		 System.out.println("Exam 1: " + exam1.getScore());
		 System.out.println("Exam 2: " + exam2.getScore());
		
	
	}

}
