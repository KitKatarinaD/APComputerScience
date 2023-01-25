package Q2;

import java.util.Scanner;

public class msoe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println("Enter the month: ");
        int month = input.nextInt();
        System.out.println("Enter the day: ");
        int day = input.nextInt();
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        int a = (14 - month)/12;
        int y = year + 4800 - a;
        int m = month + 12*a - 3;
        int d = day + (153*m+2)*5 + 365*y + y/4 - y/100 + y/400 - 32045;
        System.out.println("The Julian Day number is: " + d);



    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=61291:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.msoe3
Enter the month:
3
Enter the day:
4
Enter the year:
2022
The Julian Day number is: 2459653

Process finished with exit code 0

 */