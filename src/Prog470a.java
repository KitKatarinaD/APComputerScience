import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog470a {
  public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog464a.dat"));
            int[][] mat = new int[6][5];

          for (int r = 0; r < mat.length-1; r ++)
            for (int c = 0; c < mat[r].length; c++) {
              mat[r][c] = input.nextInt();
            }

          for (int c = 0; c < mat[0].length; c++) {
              for (int r = 0; r < mat.length-1; r++) {
                  mat[mat.length-1][c] += mat[r][c];
              }
          }

        for (int[] m : mat) {
            for (int n : m) {
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
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=56470:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog470a
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
171 178 174 152 86

Process finished with exit code 0

 */