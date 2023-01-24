import java.util.Scanner;

public class clLP48m {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Seed: ");
        int x0 = input.nextInt();
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();
        System.out.print("m: ");
        int m = input.nextInt();
        System.out.println("");
        clLP48 help = new clLP48(a, c, m, x0);
        for (int lcv = 0; lcv < 10; lcv++) {
            System.out.println(help.toString());
        }



    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=57818:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" clLP48m
Seed: 12
a: 1246
c: 200
m: 50

(1246 * 12 + 200) % 50 = 2
(1246 * 2 + 200) % 50 = 42
(1246 * 42 + 200) % 50 = 32
(1246 * 32 + 200) % 50 = 22
(1246 * 22 + 200) % 50 = 12
(1246 * 12 + 200) % 50 = 2
(1246 * 2 + 200) % 50 = 42
(1246 * 42 + 200) % 50 = 32
(1246 * 32 + 200) % 50 = 22
(1246 * 22 + 200) % 50 = 12

Process finished with exit code 0

 */