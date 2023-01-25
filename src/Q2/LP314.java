package Q2;

import java.util.Scanner;

public class LP314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Election results for New York: \nAubrey: ");
        int NYA = input.nextInt();
        System.out.println("Martinez: ");
        int NYM = input.nextInt();

        System.out.println("Election results for New Jersey: \nAubrey: ");
        int NJA = input.nextInt();
        System.out.println("Martinez: ");
        int NJM = input.nextInt();

        System.out.println("Election results for Connecticut: \nAubrey: ");
        int CA = input.nextInt();
        System.out.println("Martinez: ");
        int CM = input.nextInt();
        LP314helper help = new LP314helper(NYA, NYM, NJA, NJM, CA, CM);
        help.calc();

        System.out.println("Candidate\t\t\tVotes\tPercentage");
        System.out.print("Aubrey: \t\t\t" + help.getMyA() + "\t");
        System.out.printf("%.2f\n",help.getMyAP());
        System.out.print("Martinez\t\t\t" + help.getMyM() + "\t");
        System.out.printf("%.2f\n",help.getMyMP());
        System.out.println("TOTAL VOTES: " + help.getMytot());
    }
}/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=64627:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.LP314
Election results for New York:
Aubrey:
314159
Martinez:
271860
Election results for New Jersey:
Aubrey:
89008
Martinez:
121032
Election results for Connecticut:
Aubrey:
213451
Martinez:
231034
Candidate			Votes	Percentage
Aubrey: 			616618	49.71
Martinez			623926	50.29
TOTAL VOTES: 1240544

Process finished with exit code 0
*/
