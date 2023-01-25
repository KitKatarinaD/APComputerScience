import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465c.txt"));
            int rsize = input.nextInt();
            int csize = input.nextInt();

            int[][] mat = new int[rsize][csize];

            for (int r = 0; r<mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    mat[r][c] = input.nextInt();

                }
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
