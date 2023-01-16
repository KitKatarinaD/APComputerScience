import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog470c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));

            int[][] mat = new int[6][6]; //a 6 row 6 column matrix
            for (int row = 0; row < mat.length-1; row++) {
                for (int col = 0; col < mat[0].length-1; col++) {
                    mat[row][col] = input.nextInt();
                }
            }
            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[0].length-1; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println();  //traversing in row-major order--traversing in column major order is not very common
            for(int row = 0; row < mat.length-1; row++) {
                for (int col = 0; col <mat[0].length-1; col++) {
                    mat[row][5] += mat[row][col];
                    mat[5][col] += mat[row][col];
                    mat[5][5] +=mat[row][col];
                }
            }

            //printing out the 2D array
            for (int[] row : mat) {
                for (int n : row) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=63602:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" prog470c
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

45 67 89 12 -3 210
-3 -6 -7 -4 -9 -29
96 81 -8 52 12 233
14 -7 72 29 -1 107
19 43 28 63 87 240
171 178 174 152 86 761

Process finished with exit code 0

 */