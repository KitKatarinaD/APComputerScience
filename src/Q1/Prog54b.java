package Q1;

import java.util.Scanner;
// Katarina Dries
//9/12/2022
//Q1.Prog54b

public class Prog54b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter 1st value: " );
        int num1 = scan.nextInt();

        System.out.print("Please enter the 2nd value: " );
        int num2 = scan.nextInt();

        System.out.print("Please enter the 3rd value: " );
        int num3 = scan.nextInt();

        System.out.print("Please enter the 4th value: " );
        int num4 = scan.nextInt();

        int sum = num1 + num2 + num3 + num4;
        System.out.println("The sum is: " + sum);

        double avg = sum/4.0;
        System.out.println("The average is: " +  avg);

    }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=53447:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q1.Prog54b
Please enter 1st value: 475
Please enter the 2nd value: 821
Please enter the 3rd value: 369
Please enter the 4th value: 562
The sum is: 2227
The average is: 556.75

Process finished with exit code 0

 */