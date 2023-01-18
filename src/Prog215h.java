import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/Prog215h.txt"));
            ArrayList<Double> contestant1 = new ArrayList<Double>();
            for (int i = 0; i < 8; i++) {
                contestant1.add(input.nextDouble());
            }
            double tot1 = 0;

            for (double score : contestant1) {
                tot1 += score;
            }
            double avg1 = tot1/8;

            System.out.println("Contestant 1: " + contestant1 + " = " + avg1);
            System.out.println();


            ArrayList<Double> contestant2 = new ArrayList<Double>();
            for (int i = 0; i < 8; i++) {
                contestant2.add(input.nextDouble());
            }
            double tot2 = 0;

            for (double score : contestant2) {
                tot2 += score;
            }
            double avg2 = tot2/8;

            System.out.println("Contestant 2: " + contestant2 + " = " + avg2);
            System.out.println();


            ArrayList<Double> contestant3 = new ArrayList<Double>();
            for (int i = 0; i < 8; i++) {
                contestant3.add(input.nextDouble());
            }
            double tot3 = 0;

            for (double score : contestant3) {
                tot3 += score;
            }
            double avg3 = tot3/8;

            System.out.println("Contestant 3: " + contestant3 + " = " + avg3);
            System.out.println();


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=61228:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Prog215h
Contestant 1: [8.4, 9.1, 8.5, 8.4, 9.1, 8.7, 8.8, 9.1] = 8.7625

Contestant 2: [7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0] = 7.0

Contestant 3: [8.0, 7.9, 8.0, 8.0, 8.0, 8.0, 8.0, 8.1] = 8.0


Process finished with exit code 0

 */
