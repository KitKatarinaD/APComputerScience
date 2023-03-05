package Q3;

import java.util.Scanner;

public class prog152a {
    public static int series(int n){
        if (n == 9669) return n; //base/ending case
        else return n + series(n+3); //recursive case
    }
    //recursion function calls itself inside itself
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        while (num != 0) {
            int ser = series(num);
            System.out.println(ser);
            System.out.print("Enter a number: ");
            num = input.nextInt();

        }
    }
 }

    /*
    C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=60845:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q3.prog152a
Enter a number:
3
15586428
Enter a number: 0

Process finished with exit code 0

     */