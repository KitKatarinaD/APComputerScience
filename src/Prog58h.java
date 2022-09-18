// Katarina Dries
//9/14/2022
//Prog58h

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

        System.out.print("The interest earned is: " + S );

        System.out.print("The total amount in savings is now: " + A);










    }
}
