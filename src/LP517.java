import java.util.Scanner;

public class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String p = "secret101";


        int lcv = 0;

        while (lcv < 3) {
            lcv++;
            System.out.println("Enter the password: ");
            String i = input.nextLine();

            if (i == p) {

                System.out.println("Welcome!");
            }
            else {
                System.out.println("The password you typed is incorrect.");

            }

        }

        if (lcv >=3){
            System.out.println("Access denied.");
        }


    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=56233:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" LP517
Enter the password:
no
The password you typed is incorrect.
Enter the password:
never
The password you typed is incorrect.
Enter the password:
absolutely not
The password you typed is incorrect.
Access denied.

Process finished with exit code 0

 */