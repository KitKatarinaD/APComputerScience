//Katarina Dries
//2/8/2023
//Prog162a with recursion
import java.util.*;
public class Prog162aRecursive {
    public static int factorial(int n){
        if (n == 1) return n; //base/ending case
        else return n * factorial(n-1); //recursive case
    }
    //recursion function calls itself inside itself
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        while (num != 0) {
            int fact = factorial(num);
            System.out.println(fact);
            System.out.print("Enter a number: ");
            num = input.nextInt();

        }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=52048:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Prog162aRecursive
Enter a number:
4
24
Enter a number: 8
40320
Enter a number: 2
2
Enter a number: 0

Process finished with exit code 0

 */