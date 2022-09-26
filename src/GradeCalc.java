import java.util.Scanner;

public class GradeCalc {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade as a percent: ");
        double gp = input.nextDouble();

        String grade = "";
        if (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B"; //else if allows us to check another condition... "else" is just for everything
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else grade = "F";

        System.out.print("Your grade is: " + grade);


    }
}

/*
if (gp >= 90) grade = "A";
if (gp >= 80 && gp < 90) grade = "B";
if (gp >= 70 && gp < 80) grade = "C" ;

This way slows down code a lot, but is still correct
 */

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=65148:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" GradeCalc
Enter your grade as a percent: -257
Your grade is: F
Process finished with exit code 0

 */