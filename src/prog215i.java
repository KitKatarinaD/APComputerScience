import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215i.dat "));
            int numpumps = input.nextInt();
            ArrayList<prog215iclass> pump = new ArrayList<prog215iclass>();


            for (int lcv = 0; lcv < numpumps; lcv++) {
                int vehicle = input.nextInt();
                double gal = input.nextDouble();
                double miles = input.nextDouble();
                pump.add(new prog215iclass(vehicle, gal, miles));
            }
            double min = pump.get(0).getMympg();
            double max = pump.get(0).getMympg();
            System.out.println("MPG Statistics: \nWorst:");
            for (int i = 1; i < numpumps; i++) {
                if (pump.get(i).getMympg() < min) {
                    min = pump.get(i).getMygal();
                }
            }
            double avg = 0;
            System.out.println("\t\t\tBest:");
            for (int i = 1; i < numpumps; i++) {
                if (pump.get(i).getMympg() > max) {
                    max = pump.get(i).getMympg();
                }
            }
            for (int lcv = 1; lcv < numpumps; lcv++) {
                avg += pump.get(lcv).getMympg();
            }
            avg = avg/numpumps;

            System.out.println("Fleet Avg:\t\t" + avg );


            System.out.println("Number of vehicles: \t" + numpumps);


            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (prog215iclass car : pump) {
                System.out.println(pump.get(car.getMyvehicle()) + "\t" + car.getMymiles() + "\t" + car.getMygal() + "\t" + car.getMympg());

            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
