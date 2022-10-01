//Prog82a
//Katarina Dries
//9/30/2022

import java.util.Scanner;

public class Prog82a {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit: ");
        int SpdLmt = input.nextInt();

        System.out.println("Enter the vehicle speed: ");
        int VSpeed = input.nextInt();

        double Fine = (double) 20.00 + (VSpeed - SpdLmt) * 5.00;

        System.out.print("Fine------------------$" + Fine + "0" );

/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=52520:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Prog82a
Enter the speed limit:
30
Enter the vehicle speed:
42
Fine------------------$80.00
Process finished with exit code 0
 */


    }
}
