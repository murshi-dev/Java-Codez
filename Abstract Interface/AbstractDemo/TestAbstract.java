 public class TestAbstract
 {
 public static void main(String[] args)
 {
 // Create a CompSciStudent object.
 CompSciStudent csStudent =  new CompSciStudent("Jennifer Haynes",  "167W98337", 2015);

 // Store values for math, CS, and gen ed hours.
 csStudent.setMathHours(12);
 csStudent.setCsHours(20);
 csStudent.setGenEdHours(40);

 // Display the student's data.
 System.out.println(csStudent.toString());

 // Display the number of remaining hours.
 System.out.println("Hours remaining: " +
 csStudent.getRemainingHours());
 }
 }