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
            for (int c = 1; c < mat[0].length-1; c++) {
                sum+= mat[0][c] + mat[mat.length-1][mat[0].length-1];
            }




            System.out.println("The total of the edges is: " + sum);



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
