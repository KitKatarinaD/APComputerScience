import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog435a.dat"));
            Prog435aClass[] lot = new Prog435aClass[50];
            int size = 0;
            while (input.hasNext()) {
                double factor = input.nextDouble();
                int gate = input.nextInt();

                Prog435aClass car = new Prog435aClass(factor, gate);

                lot[size] = car;
                size++;
            }

            System.out.println("Car Type:\t\tBase Toll\t\tFactor\t\tCost\t\t");

            for (int index=0; index < size; index++) {
                lot[index].calc();
                Prog435aClass cur = lot[index];
                System.out.print(cur.getMytype() + "\t\t");
                System.out.printf("$%.2f\t\t%.2f\t\t$%.2f\n", cur.getMytoll(), cur.getMyfactor(), cur.getMycost());

            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
