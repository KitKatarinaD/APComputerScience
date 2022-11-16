package Q1;// Katarina Dries
//9/12/2022
//Q1.Prog88a

import java.util.Scanner;

public class Prog88a {
    public static void main(String [] args) {
        //Enter number 1-13
        //Enter number 1-20
        //Math.random() * (max - min) + min
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;


        int sum = num1 + num2;
        int dif = num1 - num2;
        int max, min;
        //The code inside 'if' will only run if condition is true
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=50060:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.Prog88a
Original numbers are 9 and 18
Maximum = 18
Minimum = 9

Process finished with exit code 0

 */