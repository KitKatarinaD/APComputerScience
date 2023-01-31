package AbstclLab;
import java.util.Scanner;
public class AbstCLLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        //circle
        System.out.print("Enter circle radius: ");
        double radius = kbd.nextDouble();
        Shape sh1 = new Circle(radius);
        //rectangle
        System.out.print("enter height: ");
        double rheight = kbd.nextDouble();
        System.out.print("Enter width: ");
        double rwidth = kbd.nextDouble();
        Shape sh2 = new Rectangle(rheight, rwidth);
        //triangle
        System.out.print("Enter triangle base:");
        double tbase = kbd.nextDouble();
        System.out.print("Enter triangle height: "  );
        double theight = kbd.nextDouble();
        Shape sh3 = new Triangle(theight, tbase);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();
        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        sh2.calculateCircumference();
        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        sh3.calculateCircumference();


    }
}

/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=54463:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" AbstclLab.AbstCLLab
Enter circle radius: 3.5
enter height: 5
Enter width: 10
Enter triangle base:30
Enter triangle height: 50
Circle
Area: 38.48
Circumference: 21.99
Rectangle
Area: 50.0
perimeter: 30.0
Triangle
Area: 750.0
Perimeter: 138.309518948453

Process finished with exit code 0

 */