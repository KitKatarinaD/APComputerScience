import java.util.Scanner;

public class MSOEnum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter side a: ");
        double a = input.nextDouble();
        System.out.println("Please enter side b: ");
        double b = input.nextDouble();
        System.out.println("Please enter side c: ");
        double c = input.nextDouble();

        double s = 0.5*(a+b+c);
        double A = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
       System.out.println("The area of the triangle is: " + A);

    }

}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=60341:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" MSOEnum1
Please enter side a:
3
Please enter side b:
4
Please enter side c:
5
The area of the triangle is: 6.0

Process finished with exit code 0

 */
