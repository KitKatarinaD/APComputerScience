package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog901a {

    public static void thing(Scanner input) {
        if (!input.hasNext()){return;}
        System.out.println(input.nextLine());
        thing(input);
    }
    public static void thing2(Scanner input2) {
        if (!input2.hasNext()) {input2.close(); return;}
        String temp = input2.nextLine();
        String letters = "";
        for (int i = temp.length(); i--> 1; ) {
            letters += temp.substring(i-1, i);
        }
        thing2(input2);

        System.out.println(letters);

    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog512h.dat"));
            thing(input);

            Scanner input2 = new Scanner(new File("data/prog512h.dat"));
            System.out.println("\nBackwards");

            thing2(input2);



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=60168:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q3.prog901a
Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns the gold
The sun is my great friend
His spending has no end
Hail to the morning sky
Which bright clouds measure high
Hail to you birds whose throats
Would number leaves by notes
Hail to you shady bowers
And you green fields of flowers
Hail to you women fair
That make a show so rare
In cloth as white as milk
Be it calico or silk
Good morning life and all
Things glad and beautiful

Backwards
ufituaeb dna dalg sgnihT
la dna efil gninrom dooG
lis ro ocilac ti eB
lim sa etihw sa htolc nI
rar os wohs a ekam tahT
iaf nemow uoy ot liaH
rewolf fo sdleif neerg uoy dnA
rewob ydahs uoy ot liaH
eton yb sevael rebmun dluoW
taorht esohw sdrib uoy ot liaH
gih erusaem sduolc thgirb hcihW
ks gninrom eht ot liaH
ne on sah gnidneps siH
neirf taerg ym si nus ehT
log eht snwo taht eh tuB
loh gnihton stekcop yM
ufituaeb dna dalg sgnihT
la dna efil gninrom dooG

Process finished with exit code 0
 */
