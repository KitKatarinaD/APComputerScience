package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class carPractice {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File ("myCars.dat"));
            CarClass[] parkinglot = new CarClass[100];
            int numcars = 0;

            while (input.hasNext()) {
                int id = input.nextInt();
                String make = input.next();
                String model = input.next();
                int yr = input.nextInt();

                CarClass parkedCar = new CarClass(id, make, model, yr);
                numcars++;
            }
            for (int spot = 0; spot < parkinglot.length; spot++) {

            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

