import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class cl213f {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213f.dat"));
            while (input.hasNext()){
                double kwh = input.nextDouble();
                cl213fhelper help = new cl213fhelper(kwh);
                help.calc();
                if (kwh != -999) {
                    System.out.println(help.toString());
                }
            }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }





    }
}
