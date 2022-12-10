import java.util.Scanner;

public class msoe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a: ");
        double a = input.nextDouble();
        System.out.println("Please input b: ");
        double b = input.nextDouble();
        System.out.println("Please input c: ");
        double c = input.nextDouble();

        double x1 = 0;
        double x2 = 0;

        double radicand = Math.pow(b, 2)-4*a*c;
        if (radicand < 0) {
            System.out.println("There are no real solutions.");
        }
        else {
            x1 = (-b + Math.sqrt(radicand/(2*a)));
            x2 = (-b - Math.sqrt(radicand/(2*a)));
            System.out.println("The solutions are: " + x1 + "and" + x2);
        }


    }
}
/*C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=60539:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" msoe2
Please input a:
4
Please input b:
3
Please input c:
2
There are no real solutions.

Process finished with exit code 0


 */
