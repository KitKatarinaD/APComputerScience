package Q1;

import java.util.Scanner;

public class Prog65h {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please put in the pounds: ");
        double Pounds = input.nextDouble();

        System.out.println("Please put in the shillings: ");
        double Shillings = input.nextDouble();

        System.out.println("Please put in the pence: ");
        double Pence = input.nextDouble();

        double DecimalPounds = Pounds + Pence/240 + Shillings/20;

        System.out.printf("The number of decimal pounds is: %.2f\n",  DecimalPounds);
// \n makes line break (like pressing enter key)
        //printf has ability to do formatting but doesn't put a line break (same as print)

/*\
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=60167:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q1.Prog65h
Please put in the pounds:
7
Please put in the shillings:
17
Please put in the pence:
9
The number of decimal pounds is: 7.89

Process finished with exit code 0

 */



    }
}
