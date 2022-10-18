//Katarina Dries
//Prog52a
//10/17/2022
import java.util.Scanner;

public class Prog52aClass {
//driver program
    public static void main (String [] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter length: ");
        int len = kbd.nextInt();

        System.out.print("Please enter width: ");
        int wid = kbd.nextInt();
        System.out.println();

        //Make a new object (instance) of cl52 a (instantiate the class)
        cl52a wow = new cl52a(len, wid);

        wow.setStuff();

        int area = wow.getArea();
        int perim = wow.getPerim();

        System.out.println("Area: "+ area);
        System.out.println("Perim: " + perim);

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=61049:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\IdeaProjects\APComputerScience\out\production\AP Computer Science" Prog52aClass
Please enter length: 12
Please enter width: 12

Area: 144
Perim: 48

Process finished with exit code 0
 */