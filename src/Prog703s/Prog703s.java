package Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog703s.txt "));
            List<Computer> list = new ArrayList<Computer>();
//apple 1, windows 2, linux 3
            while (input.hasNext()) {
                int num =input.nextInt();
                String name = input.next();
                int number = input.nextInt();
                double value = input.nextDouble();

                if (num == 1) {
                    String color = input.next();
                    Computer x = new Apple(name, number, color);
                    list.add(x);
                } else if (num == 2) {
                    double version = input.nextDouble();
                    Computer x = new Windows(name, number, version);
                    list.add(x);
                }else if (num == 3) {
                    int code = input.nextInt();
                    Computer x = new Linux(name, number, code);
                    list.add(x);
                }
            }

            int numGG = 0;
            int num7 = 0;
            int codeEndsIn5 = 0;


            for (Computer temp : list) {
                if (temp instanceof Apple) {
                    if (((Apple) temp).getColor().equals("Green") || ((Apple) temp).getColor().equals("Gold")) {
                        numGG++;
                    }
                }
                if (temp instanceof Linux) {
                    if (((Linux) temp).getCode() % 10 == 5) {
                        num7++;
                    }
                }
                if (temp instanceof Windows) {
                    if (((Windows) temp).getVersion() == 7.0) {
                        codeEndsIn5++;
                    }
                }
            }

            System.out.println("The number of computers that are green or gold is: " + numGG);
            System.out.println("The number of computers running Windows 7.0 is: " + num7);
            System.out.println("The number of computers that have a code that ends in 5 is: " + codeEndsIn5);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }

    }

}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=54822:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Prog703s.Prog703s
The number of computers that are green or gold is: 1
The number of computers running Windows 7.0 is: 4
The number of computers that have a code that ends in 5 is: 2

Process finished with exit code 0

 */