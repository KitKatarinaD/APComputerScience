package Q1;

import java.util.Scanner;
public class LP49 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int c =(int) (Math.random() * (20 - 1) + 1 );

        System.out.println("Please put in a number between 1 and 20: ");
        int p = input.nextInt();

        System.out.println("Player's number: " + p);
        System.out.println("Computer's number: " + c);
        if (p==c){
            System.out.println("You won!");
        }
        else {
            System.out.println("Better luck next time!");
        }

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=54317:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.LP49
Please put in a number between 1 and 20:
13
Player's number: 13
Computer's number: 14
Better luck next time!

Process finished with exit code 0
 */