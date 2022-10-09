
import java.util.Scanner;

public class LP410 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangular Prism:");

        System.out.println("Please print the length: ");
        double l = input.nextDouble();
        System.out.println("Please print the width: ");
        double w = input.nextDouble();
        System.out.println("Please print the height: ");
        double h = input.nextDouble();
        double v = l * w * h;
        System.out.println("The volume is: " + v);
        System.out.println(" ");


        System.out.println("Sphere:");

        System.out.println("Please print the radius:");
        double d = input.nextDouble() * 2;
        v = (3.14159 * Math.pow(d, 3))/6;
        System.out.println("The volume is: "+ v);
        System.out.println(" ");

        System.out.println("Cube:");
        System.out.println("Please print the side length: ");
        double s = input.nextDouble();
        v = Math.pow(s, 3);
        System.out.println("The volume is: " + v);

    }
}
/*C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=60176:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" LP410
Rectangular Prism:
Please print the length:
3
Please print the width:
4
Please print the height:
5
The volume is: 60.0

Sphere:
Please print the radius:
3
The volume is: 113.09724

Cube:
Please print the side length:
4
The volume is: 64.0

Process finished with exit code 0

 */