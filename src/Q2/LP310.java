package Q2;

import java.util.Scanner;

public class LP310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of burgers: ");
        int burg = input.nextInt();
        System.out.println("Enter the number of fries: ");
        int fries = input.nextInt();
        System.out.println("Enter the number of sodas: ");
        int sodas = input.nextInt();

        LP310helper help = new LP310helper(burg, fries, sodas);
        help.calc();

        System.out.printf("Total before tax: $%.2f\n", help.getMytotbt());
        System.out.printf("Tax: $%.2f\n", help.getMytax());
        System.out.printf("Final total: $%.2f", help.getMytotf());



    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=49765:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.LP310
Enter the number of burgers:
2
Enter the number of fries:
5
Enter the number of sodas:
5
Total before tax: $13.78
Tax: $0.90
Final total: $14.68
Process finished with exit code 0

 */