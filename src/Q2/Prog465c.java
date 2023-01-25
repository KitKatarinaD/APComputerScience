package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465c.txt"));
            int rsize = input.nextInt();
            int csize = input.nextInt();
            int sum = 0;
            int[][] mat = new int[rsize][csize];

            for (int r = 0; r<mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }
            for (int r = 0; r<mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }


            for (int r =0; r < mat.length; r++) {
                sum+= mat[r][0] + mat[r][mat[0].length-1];
            }

                for (int c = 1; c < mat[0].length - 1; c++) {
                    sum += (mat[0][c] + mat[mat.length-1][c]);
                }





            System.out.println("The total of the edges is: " + sum);



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=64658:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.Prog465c
100 195 182 225
83 125 235 67
129 42 100 750
The total of the edges is: 1873

Process finished with exit code 0

 */