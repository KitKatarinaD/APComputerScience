package Q1;

import java.util.Scanner;

public class LP41 {
    public static void main(String[] args) {

        System.out.println("Please state number of copies: ");
        Scanner imput = new Scanner(System.in);
        int copy = imput.nextInt();
        double total = 0;
        double price = 0;

        if (copy <= 99) {
            price = 0.3;
        } else if (copy > 99 && copy <= 499) {
            price = 0.28;
        } else if (copy > 499 && copy <= 749) {
            price = 0.27;
        } else if (copy > 749 && copy <= 1000) {
            price = 0.26;
        } else if (copy > 1000) {
            price = 0.25;
        }


        total = copy * price;
        System.out.printf("Price per copy is $%.2f\n", price);
        System.out.printf("Total cost is: $%.2f\n", total);

    }
}
    /*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=53621:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.LP41
Please state number of copies:
1001
Price per copy is $0.25
Total cost is: $250.25

Process finished with exit code 0

 */