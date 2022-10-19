
import java.util.Scanner;

public class LP416 {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the angle in degrees:" );
        double angle = input.nextDouble() * 3.14159 / 180;

        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double tan = Math.tan(angle);

        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cos);
        System.out.println("Tangent: " + tan);




    }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57228:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" LP416
Please input the angle in degrees:
30
Sine: 0.4999996169872557
Cosine: 0.8660256249168368
Tangent: 0.5773496795031555

Process finished with exit code 0
 */