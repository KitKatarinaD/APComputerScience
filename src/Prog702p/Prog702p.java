package Prog702p;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            ArrayList<animal> animalList = new ArrayList<animal>();
            int num = input.nextInt();

            while (num!=99) {
                String name = input.next();
                String word = input.next();
                animal a = new animal(name, word);
                animalList.add(a);

                if (num==1) {


                }

                if (num==2) {

                }


                if (num==3) {


                }


            }


            System.out.print("The number of animals is: " + animalList);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
