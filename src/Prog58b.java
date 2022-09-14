// Katarina Dries
//9/14/2022
//Prog58b

import java.util.Scanner;

public class Prog58b {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter value A: ");
        int A = input.nextInt();

        System.out.print("Please enter Value B: ");
        int B = input.nextInt();

        System.out.print("Please enter value C: ");
        int C =  input.nextInt();

        double roota = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
        double rootb = (-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C))/(2 * A);

        System.out.println("The roots are: " + roota + " " + " " + rootb);

    }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=55028:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog58b
Please enter value A: 1
Please enter Value B: 5
Please enter value C: 6
The roots are: -2.0  -3.0

Process finished with exit code 0

 */