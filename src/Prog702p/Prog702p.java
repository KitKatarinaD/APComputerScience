package Prog702p;

import java.io.*;
import java.util.*;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            ArrayList<animal> animalList = new ArrayList<animal>();
            int num = input.nextInt();
            int numhiccas = 0;
            int numwallies = 0;
            int numbeepers = 0;
            double fursum = 0;
            int stepsum = 0;
            double avgwsize = 0;

            while (num!=99) {
                String name = input.next();
                String word = input.next();


                if (num==1) {
                    double fur = input.nextDouble();
                    animal a = new Hicca(name, word, fur);
                    animalList.add(a);
                }

                else if (num==2) {
                    int steps = input.nextInt();
                    animal b = new wallies(name, word, steps);
                    animalList.add(b);
                }
                else if (num==3) {
                    String extraword = input.next();
                    animal c = new beeper(name, word, extraword);
                    animalList.add(c);
                }
                num=input.nextInt();

            }


            System.out.print("The number of animals is: " + animalList);



            for (animal a: animalList){
                if (a instanceof Hicca) {
                    double fur = ((Hicca)a).getfur();
                    System.out.println("Hicca's name is " + ((Hicca)a).getName());
                    System.out.println("Its fur is worth $" + fur );
                    System.out.println();
                    numhiccas ++;
                    fursum += fur;
                }if (a instanceof beeper){
                    String extraword = ((beeper)a).getextraword();
                    System.out.println("Beeper's name is " + ((beeper)a).getName());
                    System.out.println("Its word is " + extraword);
                    System.out.println();
                    numbeepers++;
                    avgwsize += extraword.length();
                }if (a instanceof wallies){
                    int steps = ((wallies)a).getSteps();
                    System.out.println("Wallie's name is " + ((wallies)a).getName());
                    System.out.println("Wallie has taken " + steps + "steps");
                    System.out.println();
                    numwallies++;
                    stepsum += steps;
                }


            }

            System.out.println("The fur sum is " + fursum);
            System.out.println("# of Hiccas is " + numhiccas);
            System.out.println();
            System.out.println("The average steps by Wallies is " + stepsum/numwallies);
            System.out.println("# of Wallies is " + numwallies);
            System.out.println();
            System.out.println("The average size of beepers words is " + avgwsize/numbeepers);
            System.out.println("# of Beepers is " + numbeepers);
            System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
