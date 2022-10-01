import java.util.Scanner;

public class Prog72t {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first time: ");
        int time1 = input.nextInt();

        System.out.println("Enter the second time: ");
        int time2 = input.nextInt();

        int timeDifference = Math.abs(time1 - time2);

        int hours = timeDifference / 100;

        int minutes = timeDifference % 100;


       System.out.println("The hours are: " + hours);
       System.out.print("The minutes are: " + minutes);



    }
}

/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=52401:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Prog72t
Enter the first time:
900
Enter the second time:
1730
The hours are: 8
The minutes are: 30
Process finished with exit code 0

 */