import java.util.Scanner;

public class LP39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birthdate: ");
        System.out.println("Year: ");
        int birth = input.nextInt();
        System.out.println("Month: ");
        int month = input.nextInt();
        System.out.println("Day: ");
        int day = input.nextInt();
        System.out.println("Enter today's date: \nYear: ");
        int curyr = input.nextInt();
        System.out.println("Month: ");
        int curm = input.nextInt();
        System.out.println("Day: ");
        int curd = input.nextInt();

        LP39helper help = new LP39helper(birth, month, day, curyr, curm, curd);
        help.calc();

        System.out.println("You have been alive for" + help.getMydaysalive() + " days");
        System.out.println("You have slept " + help.getMyhrsslept() + " hours");


    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=63099:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" LP39
Please enter your birthdate:
Year:
1997
Month:

2
Day:
12
Enter today's date:
Year:
2012
Month:
08
Day:
03
You have been alive for5664 days
You have slept 45312 hours

Process finished with exit code 0

 */