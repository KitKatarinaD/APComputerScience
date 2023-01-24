import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog470a {
  public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            int[][] mat = new int[6][5];

          for (int r = 0; r < mat.length-1; r ++)
            for (int c = 0; c < mat[r].length; c++) {
              
            }

          
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}