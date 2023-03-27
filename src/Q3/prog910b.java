package Q3;

import java.util.Scanner;

public class prog910b {
    public static String conversion(int n, int base) {
        if (n==0) return "";
        if (base<=10) {
            return conversion(n / base, base) + (n % base);
        }
        else {
            int rem = n%base;
            String r = "";
            if (rem < 10) {
                return conversion(n / base, base) + (n % base);
            }
            else{
                rem-=10;
                r += (char) ('A' + rem);
                return conversion(n/base, base) + r;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number base 10 to convert: ");
        int n = input.nextInt();
        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.println("The new number is: " + conversion(n, base));

    }

}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=55531:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q3.prog910b
Enter the number base 10 to convert: 255
Enter the base: 16
The new number is: FF

Process finished with exit code 0

 */