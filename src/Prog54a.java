import java.util.Scanner;

public class Prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the model of the car: " );
        String model = keyboard.nextLine();

        System.out.print("How many miles were driven: ");
        double miles = keyboard.nextInt();

        System.out.print("How many gallons were used: ");
        double gallons = keyboard.nextInt();

        double mpg = miles/gallons;
        System.out.println("The average MPG used by the " + model + " are " + mpg + "m/g");

    }
    /*
    C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57568:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog54a
What is the model of the car: 1970 UW Bug
How many miles were driven: 937
How many gallons were used: 35
The average MPG used by the 1970 UW Bug are 26.771428571428572m/g

Process finished with exit code 0

     */

}
