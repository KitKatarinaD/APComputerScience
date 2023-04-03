package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog408a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prg408a.dat"));
            prog408ahelper[] list = new prog408ahelper[21];
            int cnt = 0;
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();
                list[cnt] = new prog408ahelper(id, score);
                cnt++;
            }
            list = SortingAlgs.insetionSort(list);
             System.out.println("ID\tScore");
             for (int lcv = 0; lcv < list.length; lcv++){
                 System.out.println(list[lcv].getID() + "\t"+ list[lcv].getScore());
             }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=61583:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q3.prog408a
ID	Score
365	265
306	262
306	262
115	257
115	257
115	257
115	257
115	257
311	256
311	256
311	256
123	253
123	253
123	253
325	246
325	246
325	246
325	246
116	246
218	243
110	238

Process finished with exit code 0
 */