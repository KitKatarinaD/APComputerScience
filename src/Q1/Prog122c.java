package Q1;

public class Prog122c {
    public static void main(String [] args) {
        int lcv = 0;


        while (lcv < 10) {
         lcv += 2;
         int R2 = lcv +1;
         int R3 = lcv * 2;
         int R4 = (int)Math.pow((double) lcv, 2.0);
         System.out.println(lcv + "  " + R2 + "  " + R3 + "  " + R4);


        }

    }
}

/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=50869:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.Prog122c
2  3  4  4
4  5  8  16
6  7  12  36
8  9  16  64
10  11  20  100

Process finished with exit code 0
 */