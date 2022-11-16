package Q1;

import java.util.Scanner;

public class cl88a {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 13: ");
        int n1 = input.nextInt();
        System.out.println("Enter a number between 2 and 20: ");
        int n2 = input.nextInt();

        cl88ahelper help = new cl88ahelper(n1, n2);
        help.calc();

        System.out.println("The original numbers are " + n1 + " and " + n2 + ".");
        int a = help.getSum();
        System.out.println("The sum is: " + a);
        int b = help.getDiff();
        System.out.println("The difference is: " + b);
        int c = help.getProd();
        System.out.println("The product is: " + c);

        double f = help.getAvg();
        System.out.printf("The average is: %.1f\n", f);

        int d = help.getDis();
        System.out.println("The distance is: " + d);
        int e = help.getMax();
        if (e==0) {
            System.out.println("There is no maximum.");
        }
        else {
            System.out.println("The maximum is: " + e);
        }


    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=55072:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q1.cl88a
Enter a number between 1 and 13:
13
Enter a number between 2 and 20:
20
The original numbers are 13 and 20.
The sum is: 33
The difference is: -7
The product is: 260
The average is: 16.5
The distance is: 7
The maximum is: 20

Process finished with exit code 0

 */