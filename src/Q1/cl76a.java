package Q1;

import java.util.Scanner;

public class cl76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you don't like: ");
        int Mynum = input.nextInt();
        cl76ahelper help = new cl76ahelper(Mynum);
        help.calc();

       int myans = help.getMyans();
       int Mystep2 = help.getMystep2();

        System.out.println("\t" + Mynum);
        System.out.println("  X 9" );
        System.out.println("__________");
        System.out.println("\t" + Mystep2);
        System.out.println("  X 12345679");
        System.out.println("__________");
        System.out.println("\t" +myans);

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=52031:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q1.cl76a
Enter a number you don't like:
5
	5
  X 9
__________
	45
  X 12345679
__________
	555555555

Process finished with exit code 0

 */