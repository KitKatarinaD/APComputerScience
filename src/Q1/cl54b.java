package Q1;

import java.util.Scanner;

public class cl54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        cl54bhelper help = new cl54bhelper(num1, num2, num3, num4);
        help.calc();
        int sum = help.getmysum();
        int avg = help.getmyavg();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);


    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=51359:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q1.cl54b
475
821
369
562
Sum: 2227
Average: 556

Process finished with exit code 0

 */