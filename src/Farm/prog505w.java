package Farm;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505w.dat"));
            List<animal> animals = new ArrayList<animal>();

            int hay = input.nextInt();
            double haycost = input.nextDouble();
            int corn = input.nextInt();
            double corncost = input.nextDouble();

            int cowrows = input.nextInt();
            int cowpens = input.nextInt();

            for (int r = 0; r < cowrows; r++) {
                for (int p = 0; p < cowpens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayeaten = input.nextInt();
                    int corneaten = input.nextInt();
                    cow wow = new cow(name, weight, milk, hayeaten, corneaten);
                    animals.add(wow);
                    hay -= hayeaten;
                    corn -= corneaten;

                }
            }

            int horserows = input.nextInt();
            int horsepens = input.nextInt();

            for (int r = 0; r < cowrows; r++) {
                for (int p = 0; p < cowpens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayeaten = input.nextInt();
                    int corneaten = input.nextInt();
                    int rides = input.nextInt();
                    double ridecost = input.nextDouble();
                    horse fred = new horse(name, weight, hayeaten, corneaten, rides, ridecost);
                    animals.add(fred);
                    hay -= hayeaten;
                    corn -= corneaten;

                }
            }
            //finding horse that makes least amt of money
            double minhorse = Double.MAX_VALUE;
            int minhorseindex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv ++){
                if (animals.get(lcv) instanceof horse) {//class membership operator is instanceOf
                    horse hors = (horse) animals.get(lcv);
                    if (hors.value(corncost,haycost) < minhorse ) {
                        minhorse = hors.value(corncost, haycost);
                        minhorseindex = lcv;
                    }
                }
            }


            System.out.printf("Horse %s makes the least money\n", animals.get(minhorseindex).getname());


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
