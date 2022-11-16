package Q1;

import java.util.Scanner;

public class LP42 {
    public static void  main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter package weight in kilograms in centimeters: ");
        double weight = input.nextDouble();

        System.out.println("Enter the package length in centimeters: ");
        double l = input.nextDouble();

        System.out.println("Enter package width in centimeters: ");
        double width = input.nextDouble();

        System.out.println("Enter package height in centimeters: ");
        double h = input.nextDouble();

        double v = l * width * h;

        if (weight > 27.0 && v > 100000){
        System.out.print("Too heavy and too large");
        }
        else if (weight > 27.0 && v <=100000) {
            System.out.print("Too heavy");
        }
        else if (weight <= 27 && v > 100000) {
            System.out.print("Too large");
        }
        else {
            System.out.print("All good!");
        }




    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=53730:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.LP42
Enter package weight in kilograms in centimeters:
32
Enter the package length in centimeters:
10
Enter package width in centimeters:
25
Enter package height in centimeters:
38
Too heavy
Process finished with exit code 0

 */