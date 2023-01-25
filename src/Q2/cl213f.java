package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class cl213f {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213f.dat"));
            while (input.hasNext()){
                double kwh = input.nextDouble();
                cl213fhelper help = new cl213fhelper(kwh);
                help.calc();
                if (kwh != -999) {
                    System.out.println(help.toString());
                }
            }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=56316:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.cl213f
The number of kwh is: 1338.0	The Cost is: $93.66
The number of kwh is: 9631.0	The Cost is: $1781.55
The number of kwh is: 13561.0	The Cost is: $6824.40

Process finished with exit code 0
 */