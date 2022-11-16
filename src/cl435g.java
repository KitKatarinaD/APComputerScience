import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class cl435g {
        public static void main(String [] args) {
            try {
                Scanner input = new Scanner(new File("data/prog435g.dat"));
                int[] scores = new int[100];
                int count = 0;

                while (input.hasNext()) {
                    int score = input.nextInt();
                    scores[count] = score;
                    count++;
                }

                // Sort the scores (bubble sort)
                for (int lcv = 0; lcv < count; lcv++) {
                    for (int lcv2 = 0; lcv2 < count - 1; lcv2++) {
                        if (scores[lcv2] > scores[lcv2 + 1]) {
                            int temp = scores[lcv2];
                            scores[lcv2] = scores[lcv2 + 1];
                            scores[lcv2 + 1] = temp;
                        }
                    }
                }

                cl435ghelper[] golfers = new cl435ghelper[count];
                for (int lcv = 0; lcv < count; lcv++) {
                    cl435ghelper myguy = new cl435ghelper(scores[lcv]);
                    golfers[lcv] = myguy;
                }

                int rank = 1;
                for (int lcv = 0; lcv < count; lcv++) {
                    golfers[lcv].setRank(rank);
                    if (lcv < count - 1 && scores[lcv] != scores[lcv + 1])
                        rank++;
                }

                System.out.println("Score\tRank");
                for (int lcv = 0; lcv < count; lcv++)
                    System.out.println(golfers[lcv].toString());

            } catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
}
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=58101:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" cl435g
       /*

        Score	Rank
        66	1
        68	2
        68	2
        69	3
        70	4
        70	4
        70	4
        70	4
        71	5
        72	6
        72	6
        72	6
        73	7
        74	8
        75	9
        75	9
        75	9
        76	10
        76	10
        77	11
        77	11
        78	12
        80	13
        81	14
        82	15
        86	16
        87	17
        88	18
        88	18
        88	18
        90	19

        Process finished with exit code 0


        */