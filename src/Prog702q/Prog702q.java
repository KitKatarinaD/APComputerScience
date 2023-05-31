package Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog702q.txt"));
            List<Vehicle> list = new ArrayList<Vehicle>();

// 1=car 2=truck 3=bus
            while (input.hasNext()) {
                int VehicleType = input.nextInt();
                String name = input.next();
                int tires = input.nextInt();

                if (VehicleType == 1) {
                    double value = input.nextDouble();
                    Vehicle x = new Car(name, tires, value);
                    list.add(x);
                }else if (VehicleType == 2) {
                    double mileage = input.nextDouble();
                    Vehicle x = new Truck(name, tires, mileage);
                    list.add(x);
                } else if (VehicleType == 3) {
                    String hometown = input.next();
                    Vehicle x = new Bus(name, tires, hometown);
                    list.add(x);
                }
            }

            /*
            You are to calculate the total number of vehicles.
            You are to calculate the total amount that the cars are worth.
            You are to calculate the total amount that the vehicles are worth.
            You are to report the longest home destination name for all of the busses.
             You are to report which truck has the least value.
             You are to report the total number of tires in each of the three classes of vehicles.

             */
            int numCars = 0;
            int numBuses = 0;
            int numTrucks = 0;
            double carValue = 0;
            double busValue = 0;
            double truckValue = 0;
            double leastTruckValue = 999999999;
            int totalTires = 0;

            String longestHometown = "";

            for (Vehicle temp : list) {
                if (temp instanceof Car) {
                    carValue += ((Car) temp).getValue();
                    numCars++;
                    totalTires += ((Car) temp).getTires();
                }
                if (temp instanceof Bus) {
                    busValue += 50000;
                    numBuses++;
                    if (((Bus) temp).getHometown().length() > longestHometown.length()) {
                        longestHometown = ((Bus) temp).getHometown();
                    }
                    totalTires += ((Bus) temp).getTires();
                }
                if (temp instanceof Truck) {
                    numTrucks++;
                    double TValue = 50000 - (((Truck) temp).getMileage() * .25);
                    if (TValue <= leastTruckValue) {
                        leastTruckValue = TValue;
                    }
                    truckValue += leastTruckValue;
                    totalTires += ((Truck) temp).getTires();
                }
            }
                System.out.println("The total number of vehicles is: " + (numCars + numBuses + numTrucks));
                System.out.println("The total amount that the cars are worth is: " + carValue);
                System.out.println("The total amount that the vehicles are worth is: " + (carValue + busValue + truckValue));
                System.out.println("The longest home destination name for all of the busses is: " + longestHometown);
                System.out.println("The truck with the least value is: " + leastTruckValue);
                System.out.println("The total number of tires in each of the three classes of vehicles is: " + totalTires);


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }

    }

}
/*
The total number of vehicles is: 13
The total amount that the cars are worth is: 33950.0
The total amount that the vehicles are worth is: 377700.0
The longest home destination name for all of the busses is: Minneapolis
The truck with the least value is: 18750.0
The total number of tires in each of the three classes of vehicles is: 179
Process finished with exit code 0

 */