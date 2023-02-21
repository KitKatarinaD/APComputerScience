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
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int[] freq = new int[26];


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

                    for (int i =0; i < extraword.length(); i++) {
                        String letter = extraword.substring(i, i+1);
                        int letofalphabet= alphabet.indexOf(letter);
                        freq[letofalphabet]++;
                        }


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
            int temp = 0;
            for (int i = 0; i < freq.length; i++) {
                 if (freq[i] > temp) {
                     temp = freq[i];
                 }
            }

            System.out.println("The most common letter of the beeper's words is: " + alphabet.charAt(temp));



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}

/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=53735:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Prog702p.Prog702p
The number of animals is: [Prog702p.Hicca@3f91beef, Prog702p.wallies@1a6c5a9e, Prog702p.beeper@37bba400, Prog702p.Hicca@179d3b25, Prog702p.Hicca@254989ff, Prog702p.Hicca@5d099f62, Prog702p.wallies@37f8bb67, Prog702p.wallies@49c2faae, Prog702p.wallies@20ad9418, Prog702p.wallies@31cefde0, Prog702p.beeper@439f5b3d, Prog702p.beeper@1d56ce6a, Prog702p.beeper@5197848c, Prog702p.Hicca@17f052a3, Prog702p.Hicca@2e0fa5d3]Hicca's name is Billy
Its fur is worth $3.25

Wallie's name is Fred
Wallie has taken 28steps

Beeper's name is Cuccia
Its word is coolbeans

Hicca's name is Murray
Its fur is worth $4.0

Hicca's name is Carly
Its fur is worth $2.58

Hicca's name is Elias
Its fur is worth $3.22

Wallie's name is Katy
Wallie has taken 45steps

Wallie's name is Tanya
Wallie has taken 78steps

Wallie's name is Casey
Wallie has taken 97steps

Wallie's name is Brandon
Wallie has taken 68steps

Beeper's name is Sink
Its word is superdude

Beeper's name is Binge
Its word is attaway

Beeper's name is Break
Its word is done

Hicca's name is Brad
Its fur is worth $2.75

Hicca's name is Lorenzo
Its fur is worth $2.55

The fur sum is 18.35
# of Hiccas is 6

The average steps by Wallies is 63
# of Wallies is 5

The average size of beepers words is 7.25
# of Beepers is 4

The most common letter of the beeper's words is: e

Process finished with exit code 0

 */