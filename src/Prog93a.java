//Prog93a
//Katarina Dries
//10/1/2022

import java.util.Scanner;

public class Prog93a {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter KWH used: ");
        double KWH = input.nextDouble();

        System.out.println("     C O M P S C I Electric     ");
        System.out.println("_________________________________");
        System.out.println("KWH Used:  " + KWH);
        System.out.println("_________________________________");
        System.out.println(" ");

        double BR = 0.0475;
        double BaseCost = Math.round(((KWH * BR) * 100.00) / 100.00);


        System.out.println("Base Rate:  KWH @ $ " + BR + "     $ " + BaseCost);
        double SC = Math.round(((BaseCost * 0.10) * 100.00) / 100.00);
        System.out.println("Surcharge:        $ " + SC);
        double CT = Math.round(((BaseCost  * 0.03) * 100.00) / 100.00);
        System.out.println("City Tax:         $ " + CT);

        double TotCost = Math.round(((SC + CT + BaseCost) * 100.00) / 100.00);
        System.out.println("               _______");
        System.out.println(" ");
        System.out.println("Pay this amount:   $ " + TotCost);
        System.out.println(" ");

        double FinedBill = Math.round(((TotCost * 1.04) * 100.00) / 100.00);
        System.out.println("After May 20th Pay:   $ " + FinedBill);



    }
}
