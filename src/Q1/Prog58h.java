package Q1;// Katarina Dries
//9/14/2022
//Q1.Prog58h

import java.util.Scanner;

public class Prog58h {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the amount saved: ");
        double P = scan.nextDouble();

        System.out.print("Please enter your interest rate:" );
        double r = scan.nextDouble();

        System.out.print("Please enter the number of times your interest is compounded per year:");
        double n = scan.nextDouble();

        System.out.print("Please enter the number of days at interest: ");
        double t = scan.nextDouble();

        double A = P * (Math.pow((1 + ((.01 * r)/n)), ((n * t)/365) ) );

        double S = A - P;

        System.out.println("The interest earned is: " + S );

        System.out.println("The total amount in savings is now: " + A);

        /*
        C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=52131:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.Prog58h
Please enter the amount saved: 5000
Please enter your interest rate:11.5
Please enter the number of times your interest is compounded per year:365
Please enter the number of days at interest: 900
The interest earned is: 1638.9571470100136
The total amount in savings is now: 6638.957147010014

Process finished with exit code 0

         */









    }
}
