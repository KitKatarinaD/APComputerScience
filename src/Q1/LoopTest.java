package Q1;

public class LoopTest {
    public static void main(String [] args) {
        int lcv = 1;
        while (lcv <= 10) {
            System.out.print(lcv + " ");
            lcv ++;

        }
        System.out.println();   //ONLY USE FOR LOOPS WITH LOOPS THAT HAVE A COUNTER
        for (int lcv2 = 1; lcv2 <= 10; lcv2++) {
            System.out.print(lcv2 + " ");

        }
        System.out.println();

    }

}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=65311:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q1.LoopTest
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
c=4
Process finished with exit code 0
 */