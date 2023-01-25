package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/Q2.prog215i.txt"));
            ArrayList<prog215iclass> pump = new ArrayList<prog215iclass>();
            while (input.hasNext()) {
                int vehicle = input.nextInt();
                double gal = input.nextDouble();
                double miles = input.nextDouble();
                if (gal != 0 && miles != 0 )
                pump.add(new prog215iclass(vehicle, gal, miles));
            }
            for (prog215iclass car: pump) {
                car.calc();
            }
            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (int lcv = 0; lcv < pump.size(); lcv++){
                System.out.println(pump.get(lcv).getMyvehicle() + "\t" + pump.get(lcv).getMymiles() + "\t" +
                        pump.get(lcv).getMygal() + "\t" +  pump.get(lcv).getMympg());
            }
            int minindx = 0;
            int maxindx = 0;
            double min = pump.get(0).getMympg();
            double max = pump.get(0).getMympg();
            System.out.print("MPG Statistics: \nWorst:");
            for (int i = 0; i < pump.size(); i++) {
                if (pump.get(i).getMympg() < min) {
                    min = pump.get(i).getMympg();
                    minindx = i;
                }
            } System.out.println(pump.get(minindx).getMyvehicle());

            double avg = 0;
            System.out.print("Best:");
            for (int i = 0; i < pump.size(); i++) {
                if (pump.get(i).getMympg() > max) {
                    max = pump.get(i).getMympg();
                    maxindx = i;
                }
            }
            System.out.println(pump.get(maxindx).getMyvehicle());

            for (int lcv = 0; lcv < pump.size(); lcv++) {
                avg += pump.get(lcv).getMympg();
            }
            avg = avg/pump.size();

            System.out.println("Fleet Avg:\t\t" + avg );


            System.out.println("Number of vehicles: \t" + pump.size());



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=53851:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.prog215i
Vehicle	Miles	Gallons	MPG
1005	380.5	15.0	25.366666666666667
1003	240.1	12.0	20.008333333333333
1006	172.3	9.0	19.144444444444446
1008	317.7	14.0	22.692857142857143
1010	390.2	17.0	22.95294117647059
1015	152.1	4.0	38.025
1017	310.0	12.3	25.203252032520325
1020	409.9	17.9	22.899441340782122
MPG Statistics:
Worst:1006
Best:1015
Fleet Avg:		24.536617017134326
Number of vehicles: 	8

Process finished with exit code 0

 */