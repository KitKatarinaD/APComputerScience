package Q2;//Katarina Dries
//1/23/2023
//Prog464d


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog464d {
    public static int[][] transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col< mat.length; col++) {
                transposed[col][row] = mat[row][col];
            }
        }
        return transposed;
    }




    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));
            int[][] mat = new int[5][5];



            //read in matrix in row major order
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {  //mat[0].length is the length of the first array in the 2D array
                    mat[r][c] = input.nextInt();

                }
            }
            int[][] tmat = transpose(mat);

            System.out.println("Original Matrix");

            for (int[] row : mat){
                for (int c : row) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            System.out.println("\n Transposed matrix:");
            for (int row = 0; row < tmat.length; row++) {
                for (int col = 0; col< tmat.length; col++) {
                    System.out.print(tmat[row][col] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=58581:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.prog464d
Original Matrix
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

 Transposed matrix:
45 -3 96 14 19
67 -6 81 -7 43
89 -7 -8 72 28
12 -4 52 29 63
-3 -9 12 -1 87

Process finished with exit code 0

 */