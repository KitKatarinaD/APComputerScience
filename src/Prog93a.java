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
        double BaseCost = KWH * BR;

        System.out.printf("Base Rate:  KWH @ $ %.2f\n", BR);
        System.out.printf("     $ %.2f\n", BaseCost);
        System.out.println(" ");
        double SC = BaseCost * 0.10;
        System.out.printf("Surcharge:        $ %.2f\n", SC);
        System.out.println(" ");

        double CT = BaseCost  * 0.03;
        System.out.printf("City Tax:         $ %.2f\n", CT);
        System.out.println(" ");


        double TotCost = SC + CT + BaseCost;
        System.out.println("               _______");
        System.out.println(" ");
        System.out.printf("Pay this amount:   $ %.2f\n", TotCost);
        System.out.println(" ");

        double FinedBill = TotCost * 1.04;
        System.out.printf("After May 20th Pay:   $ %.2f\n", + FinedBill);



    }
}
/*C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=52731:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Prog93a
Enter KWH used:
993
     C O M P S C I Electric
_________________________________
KWH Used:  993.0
_________________________________

Base Rate:  KWH @ $ 0.05
     $ 47.17

Surcharge:        $ 4.72

City Tax:         $ 1.42

               _______

Pay this amount:   $ 53.30

After May 20th Pay:   $ 55.43

Process finished with exit code 0

 */