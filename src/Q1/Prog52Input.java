package Q1;

import java.util.*;

public class Prog52Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Please enter the length: ");
    int len = input.nextInt();
    System.out.println();

    System.out.print("Please enter the width: ");
    int wid = input.nextInt();
    System.out.println();

    int area = len * wid;
    int perim = 2 * len + 2 * wid;
    System.out.println("The area is " + area);
    System.out.println("The perimeter is " + perim);
    }

}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57386:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q1.Prog52Input
Please enter the length: 5

Please enter the width: 10

The area is 50
The perimeter is 30

Process finished with exit code 0

 */