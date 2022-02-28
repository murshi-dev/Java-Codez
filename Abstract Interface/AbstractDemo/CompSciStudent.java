 public class CompSciStudent extends Student
 {
 // Required hours
 private final int MATH_HOURS = 20; // Math hours
 private final int CS_HOURS = 40; // Comp sci hours
 private final int GEN_ED_HOURS = 60; // Gen ed hours

 // Hours taken
 private int mathHours; // Math hours taken
 private int csHours; // Comp sci hours taken
 private int genEdHours; // General ed hours taken
 public CompSciStudent(String n, String id, int year)
 {
 super(n, id, year);
 }
 public void setMathHours(int math)
 {
 mathHours = math;
 }
 public void setCsHours(int cs)
 {
 csHours = cs;
 }

 public void setGenEdHours(int genEd)
 {
 genEdHours = genEd;
 }

 @Override
 public int getRemainingHours()
 {
 int reqHours, // Total required hours
 remainingHours; // Remaining hours

 // Calculate the required hours.
 reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

// Calculate the remaining hours.
 remainingHours = reqHours - (mathHours + csHours
 + genEdHours);

 return remainingHours;
 }

 /**
 The toString method returns a string containing
 the student's data.
 @return A reference to a String.
 */
 @Override
 public String toString()
 {
 String str;

 str = super.toString() + "\nMajor: Computer Science" +  "\nMath Hours Taken: " + mathHours +
 "\nComputer Science Hours Taken: " + csHours +  "\nGeneral Ed Hours Taken: " + genEdHours;

 return str;
 }
 }