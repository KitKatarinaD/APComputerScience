package Prog701g;
//as soon as you say extends, you claim the methods that should be inherited from person
public class Student extends Person {
  private double myGPA;

  public Student(String f, String l, double gpa) {
    super(f, l);
    myGPA = gpa;
  }

  public double getGPA() { return myGPA;}
  
}