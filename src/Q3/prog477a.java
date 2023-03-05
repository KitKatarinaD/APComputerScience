package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            int[][] table = new int[5][3];
            while (input.hasNext()){
               int sex = input.nextInt();
               int grade = input.nextInt();

               table[grade-1][sex-1]++;


            }

            System.out.println("Grade\tMale\tFemale\tTotal");
          //  System.out.print("A" +);



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
