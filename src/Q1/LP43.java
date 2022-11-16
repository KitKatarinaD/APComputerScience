package Q1;

import java.util.Scanner;
public class LP43 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        double price = 0;
        double cost = 0;

        System.out.println("Enter number of eggs purchased: ");
        double n = input.nextDouble() / 12;

        if (n>0 && n<4 ) {
            price = 0.5;
        }
        else if (n>=4 && n<6){
            price = 0.45;
        }
        else if (n>=6 && n<11){
            price = 0.4;
        }
        else if (n>11){
            price = 0.35;
        }
        cost = price * n;

        System.out.printf("The cost is %.2f", cost);

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=53997:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.LP43
Enter number of eggs purchased:
18
The cost is 0.75
Process finished with exit code 0

 */