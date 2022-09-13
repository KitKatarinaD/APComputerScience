// Katarina Dries
//9/12/2022
//Prog54b


import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the radius: " );
        double radius = scan.nextDouble();

        double pi = 3.14159;

        double circumference = 2 * radius * pi;
         System.out.println("The circumference is: " + circumference);

        double area = Math.pow(radius, 2) * pi;
        System.out.println("The area is: " + area);


    }
}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=54237:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog54c
Please enter the radius: 3.712
The circumference is: 23.32316416
The area is: 43.28779268096

Process finished with exit code 0

 */