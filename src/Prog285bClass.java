import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Prog285bClass {
    public static void main(String[] args) {
        //driver class because it has main
        try{
            Scanner input = new Scanner(new File( "data/prog285b.dat"));

            while (input.hasNext()) {
                int id = input.nextInt();
                int c  = input.nextInt();
                double s = input.nextDouble();

                Salesperson fred = new Salesperson(id, c , s);
                fred.setComm();
                System.out.println(fred.toString());
            }

        } catch (IOException e) {
            System.out.println("Can't find the data file");
        }
    }
}
