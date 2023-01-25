package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/Q2.prog213e.dat"));
            int cnt0 = 0;
            int cnt20 = 0;
            int cnt40 = 0;
            int cnt60 = 0;
            int cnt80 = 0;
            int tot = 0;

            while (input.hasNext() ){
                int age = input.nextInt();
                if (age < 20) {
                    cnt0++;
                }
                else if(age >= 20 && age <40) {
                    cnt20++;
                }
                else if(age >= 40 && age <60) {
                    cnt40++;
                }
                else if(age >= 60 && age <=79) {
                    cnt60++;
                }
                else {
                    cnt80++;
                }
            }
            tot = cnt0 + cnt20 + cnt40 + cnt60 + cnt80;
            double perc0 = (double)cnt0/tot * 100;
            double perc20 = (double) cnt20/tot * 100;
            double perc40 = (double) cnt40/tot * 100;
            double perc60 = (double) cnt60/tot * 100;
            double perc80 = (double) cnt80/tot * 100;

            System.out.println("Age Group\tDistribution\tPercentage\n");
            System.out.printf("<20\t\t\t%d\t\t\t%.2f\n", cnt0, perc0);
            System.out.printf("20-39\t\t%d\t\t\t%.2f\n", cnt20, perc20);
            System.out.printf("40-59\t\t%d\t\t\t%.2f\n", cnt40, perc40);
            System.out.printf("60-79\t\t%d\t\t\t%.2f\n", cnt60, perc60);
            System.out.printf(">79\t\t\t%d\t\t\t%.2f", cnt80, perc80);


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
 /*C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=62392:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.prog213e
         Age Group	Distribution	Percentage

<20			5			21.74
        20-39		5			21.74
        40-59		8			34.78
        60-79		3			13.04
        >79			2			8.70
        Process finished with exit code 0


  */