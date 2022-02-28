public class FinalExam extends GradedActivity implements Relatable
 {
 private int numQuestions; // Number of questions
 private double pointsEach; // Points for each question
 private int numMissed; // Questions missed

 public FinalExam(int questions, int missed)
 {
 double numericScore; // To hold a numeric score

 // Set the numQuestions and numMissed fields.
 numQuestions = questions;
 numMissed = missed;

 // Calculate the points for each question and
 // the numeric score for this exam.
 pointsEach = 100.0 / questions;
 numericScore = 100.0 - (missed * pointsEach);

 // Call the inherited setScore method to
 // set the numeric score.
 setScore(numericScore);
 }


 public double getPointsEach()
 {
 return pointsEach;
 }

 public int getNumMissed()
 {
 return numMissed;
 }

 public boolean equals(GradedActivity g)
 {
 boolean status;

 if (this.getScore() == g.getScore())
 status = true;
 else
 status = false;

 return status;
 }

 public boolean isGreater(GradedActivity g)
 {
 boolean status;

 if (this.getScore() > g.getScore())
 status = true;
 else
 status = false;

 return status;
 }

 public boolean isLess(GradedActivity g)
 {

 boolean status;

 if (this.getScore() < g.getScore())
 status = true;
 else
 status = false;

 return status;
 }
 }