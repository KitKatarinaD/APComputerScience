import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214c.dat"));
            Prog214chelper[] list = new Prog214chelper[25];
            int index = 0;
            while (input.hasNext()) {
                String type = input.next();
                double gal = input.nextDouble();
                String wash = input.next();
                Prog214chelper help = new Prog214chelper(type, gal, wash);
                list[index] = help;
                index++;
            }
            for (Prog214chelper help : list) {
                help.calc();
                System.out.println("--------------------------------------");
                System.out.println(help.getmytype() + "\t\t\t\t" + help.getMygal() + " gallons @ " + help.getMytypecost() );
                System.out.println("Gasoline\t\t\t\t\t\t" + help.getMygasprice());
                System.out.println("Wash " + help.getmywash() + "\t\t\t\t\t\t" + help.getMywashprice());
                System.out.println("\t\t\t\t\t_________\n\nTotal due: " + help.getMytot() + "\n_____________________________________________");

            }





        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=54496:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Prog214c
--------------------------------------
P				15.0 gallons @ 1.479
Gasoline						22.185000000000002
Wash N						0.0
					_________

Total due: 22.185000000000002
_____________________________________________
--------------------------------------
R				21.4 gallons @ 1.359
Gasoline						29.0826
Wash Y						0.0
					_________

Total due: 29.0826
_____________________________________________
--------------------------------------
H				7.5 gallons @ 1.429
Gasoline						10.717500000000001
Wash Y						0.0
					_________

Total due: 10.717500000000001
_____________________________________________
--------------------------------------
R				17.9 gallons @ 1.359
Gasoline						24.326099999999997
Wash Y						0.5999999999999999
					_________

Total due: 24.926099999999998
_____________________________________________
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Prog214chelper.calc()" because "help" is null
	at Prog214c.main(Prog214c.java:20)

Process finished with exit code 1
 */