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



            System.out.println("New matrix: ");
            int x = 0;
            for (int r = 0; r < mat1.length; r++) {
                for (int c = 0; c<mat1[r].length; c++ ) {
                    if (mat1[r][c] != 0) {
                        x++;
                    }
                }
            }
            int[] nums = new int[x];



            int[][] sm1 = new int[nums.length][3];

            for (int r = 0; r < mat1.length; r++) {
                for (int c = 0; c < mat1[r].length; c++) {
                    if (mat1[r][c] != 0) {
                        sm1[sm1.length-1-x][0] = r;
                        sm1[sm1.length-1-x][1] = c;
                        sm1[sm1.length-1-x][2]=mat1[r][c];
                        x--;
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
