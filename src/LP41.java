
import java.util.Scanner;

public class LP41 {
    public static void main(String [] args)  {

      System.out.println("Please state number of copies: ");
        Scanner imput = new Scanner(System.in);
        int copy = imput.nextInt();
        double total =0;


        if (copy <= 99) {
            System.out.println("Price per copy is: $0.30");
            total = copy * 0.3;
            System.out.println("Total cost is: $" + total);
        }

       if  (copy > 99 && copy <= 499) {
           System.out.println("Price per copy is $0.28");
           total = copy * 0.28;
           System.out.println("Total cost is: $" + total);
       }
       if (copy > 499 && copy <= 749) {
           System.out.println("Price per copy is $0.27");
           total = copy * 0.27;
           System.out.println("Total cost is: $" + total);
       }
        if (copy > 749 && copy <= 1000) {
            System.out.println("Price per copy is $0.26");
            total = copy * 0.26;
            System.out.println("Total cost is: $" + total);
        }
        if (copy > 1000) {
            System.out.println("Price per copy is $0.25");
            total = copy * 0.25;
            System.out.println("Total cost is: $" + total);
        }

    }

}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=52701:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" LP41
Please state number of copies:
1001
Price per copy is $0.25
Total cost is: $250.25

Process finished with exit code 0

 */