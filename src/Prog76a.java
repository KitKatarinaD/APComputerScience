//prog76a
//Katarina Dries
//9/30/2022
import java.util.Scanner;

public class Prog76a {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you dislike between 1 and 9: ");
        int pt1 = input.nextInt();
        int pt2 = 9 * pt1;
        int pt3 = pt2 * 12345679;

        System.out.println("            " + pt1);
        System.out.println("          X 9" );
        System.out.println("_____________");
        System.out.println("           " + pt2);
        System.out.println("   X 12345679");
        System.out.println("_____________");
        System.out.println(pt3);

    }

}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=52487:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Prog76a
Enter a number you dislike between 1 and 9:
5
            5
          X 9
_____________
           45
   X 12345679
_____________
555555555

Process finished with exit code 0
 */