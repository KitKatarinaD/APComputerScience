import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215i.dat "));
            int numpumps = input.nextInt();
            input.nextLine();
            ArrayList<prog215iclass> pump = new ArrayList<prog215iclass>();


            for (int lcv = 0; lcv < numpumps; lcv++) {
                int vehicle = input.nextInt();
                double gal = input.nextDouble();
                double miles = input.nextDouble();
                input.nextLine();
                pump.add(new prog215iclass(vehicle, gal, miles));
            }


            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (prog215iclass car : pump) {
                System.out.println(pump.get(car.getMyvehicle()) + "\t" + car.getMymiles() + "\t" + car.getMygal() + "\t" + car.getMympg());
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
