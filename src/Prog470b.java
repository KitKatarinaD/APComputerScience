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
              
                  for (int r = mat.length-1; r >=0; r++) {
                        sum2 += mat[r][r];
                  }
                  System.out.println("Main diagonal sum: " + sum1);
                  System.out.println("Other diagonal sum: " + sum2);

              

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}