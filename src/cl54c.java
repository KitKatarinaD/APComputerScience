import java.util.Scanner;

public class cl54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        cl54helper help = new cl54helper(radius);
        help.calc();

        double a = help.getMyarea();

        double c = help.getMycircum();
        System.out.println("The area is: " + a);
        System.out.println("The circumference is: " + c);
    }
}

/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=51159:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\IdeaProjects\APComputerScience\out\production\AP Computer Science" cl54c
3.712
The area is: 43.28779268096
The circumference is: 23.32316416

Process finished with exit code 0
 */