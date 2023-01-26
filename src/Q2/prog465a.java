package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465a.dat"));
            int[][] m1 = new int[4][4];
            int[][] m2 = new int[4][4];
            int[][] m3 = new int[4][4];

            for (int r = 0; r < m1.length; r++) {
                for (int c = 0; c < m1[r].length; c++) {
                    m1[r][c] = input.nextInt();
                }
            }

            for (int r = 0; r < m2.length; r++) {
                for (int c = 0; c < m2[r].length; c++) {
                    m2[r][c] = input.nextInt();
                }
            }


            System.out.println("Matrix 1");
            for (int r = 0; r < m1.length; r++) {
                for (int c = 0; c < m1[r].length; c++) {
                    System.out.print(m1[r][c] + " ");
                }
                System.out.println();
            }


            System.out.println("Matrix 2");
            for (int r = 0; r < m2.length; r++) {
                for (int c = 0; c < m2[r].length; c++) {
                    System.out.print(m2[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println("Largest Elements");
            for (int r = 0; r < m3.length; r++) {
                for (int c = 0; c < m3[r].length; c++) {
                    if (m1[r][c] > m2[r][c]) {
                        System.out.print(m1[r][c] + " ");
                    } else {
                        System.out.print(m2[r][c] + " ");
                    }
                }
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=64372:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.prog465a
Matrix 1
2 7 6 4
6 1 2 4
9 7 2 6
8 3 2 1
Matrix 2
4 1 3 7
6 2 3 8
7 2 2 4
4 2 3 1
Largest Elements
4 7 6 7
6 2 3 8
9 7 2 6
8 3 3 1

Process finished with exit code 0
 */