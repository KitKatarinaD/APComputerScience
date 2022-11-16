package Q1;// Katarina Dries
//9/18/2022
//Q1.Prog58t

import java.util.Scanner;

public class Prog58t {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Please state the amount of the purchase: ");
        double P = Scan.nextDouble();

        System.out.print("Please state the amount received from the customer:");
        double C = Scan.nextDouble();

        double Output = C - P;

        System.out.println("The cash back is: " + Output);

    }
}

/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=52146:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.Prog58t
Please state the amount of the purchase: 125.32
Please state the amount received from the customer:140.00
The cash back is: 14.680000000000007

Process finished with exit code 0
 */