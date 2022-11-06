public class LP514 {
    public static void main(String[] args) {
        int lcv = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Dice1: \t Dice2: \t Total:");
        while (lcv < 6) {
        a = (int)(Math.random() * (6 - 1 + 1) + 1);
        b = (int) (Math.random() * (6 - 1 + 1) + 1);
        c = a + b;
        System.out.println("  " + a + " \t   " + b + "      \t " + c);
        lcv++;
        }


    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=55727:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" LP514
Dice1: 	 Dice2: 	 Total:
  5 	   6      	 11
  4 	   4      	 8
  3 	   1      	 4
  5 	   6      	 11
  5 	   4      	 9
  2 	   4      	 6

Process finished with exit code 0

 */