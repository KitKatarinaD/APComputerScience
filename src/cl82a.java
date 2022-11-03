import java.util.Scanner;

public class cl82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit: ");
        double SpdLmt = input.nextInt();

        System.out.println("Enter the vehicle speed: ");
        int VSpeed = input.nextInt();
        cl82ahelper help = new cl82ahelper(SpdLmt, VSpeed);
        help.calc();
        double fine = help.getmyfine();

        System.out.printf("Fine------------------$%.2f\n", fine);
    }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51009:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" cl82a
Enter the speed limit:
55
Enter the vehicle speed:
70
Fine------------------$95.00

Process finished with exit code 0

 */
