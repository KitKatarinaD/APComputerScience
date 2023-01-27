import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465h.dat"));

            int[][] mat1 = new int[input.nextInt()][input.nextInt()];

            for (int r = 0; r < mat1.length; r++) {
                for (int c = 0; c< mat1.length; c++) {
                    mat1[r][c] = input.nextInt();
                }
            }
            System.out.println("Original Matrix");
            for (int r = 0; r < mat1.length; r++) {
                for (int c = 0; c< mat1.length; c++) {
                    System.out.print(mat1[r][c]);
                }
                System.out.println();
            }

            int[][] sm1 = new int[][];
            for (int r = 0; r < mat1.length; r++) {
                for (int c = 0; c<mat1.length; c++ ) {
                    if (mat1[r][c] != 0) {

                    }
                }
            }






            System.out.println("Original Matrix");





            System.out.println("Original Matrix");



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
