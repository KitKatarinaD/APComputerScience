
import java.util.Scanner;
public class LP46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * (10 - 1) + 1);
        int b =(int) (Math.random() * (10 - 1) + 1);
        String o = "-";

        int q = (int) (Math.random() * (4 - 1) + 1);
        if (q == 1) {
            q = a + b;
            o = "+";
        } else if (q == 2) {
            q = a - b;
            o = "-";
        } else if (q == 3) {
            q = a * b;
            o = "*";
        } else {
            q = a / b;
            o = "/";
        }


        System.out.println("What is " + a + " " + o + " " + b + "?");
        int t = input.nextInt();
        if(t != q ) {
            System.out.println("The correct answer is: " + q);
        }
        else {
            System.out.print("Correct!");
        }

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=54263:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" LP46
What is 9 * 8?
7
The correct answer is: 72

Process finished with exit code 0

 */