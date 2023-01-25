import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
 public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));

              int[][] mat = new int[5][5]; 
              for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                  mat[r][c] = input.nextInt();
                }
              }
                for (int[] row : mat) {
                  for (int c : row) {
                    System.out.print(c + " ");
                  }
                    System.out.println();
                }
              
                int sum1 = 0;
                int sum2 = 0;
                for (int r = 0; r < mat.length; r++) {
                      sum1 += mat[r][r];
                  }
              //mat.length is # of rows
                  for (int r = mat.length-1; r >=0; r--) {
                        sum2 += mat[mat.length-1 - r][r];
                  }
                  System.out.println("Main diagonal sum: " + sum1);
                  System.out.println("Other diagonal sum: " + sum2);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=55822:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog470b
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
Main diagonal sum: 147
Other diagonal sum: -3

Process finished with exit code 0

 */