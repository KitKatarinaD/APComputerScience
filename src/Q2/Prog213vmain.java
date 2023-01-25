package Q2;

import java.io.*;
import java.util.*;

public class Prog213vmain {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213v.dat"));
            ArrayList<Prog213vtransaction> list = new ArrayList<Prog213vtransaction>();

            double balance  = input.nextDouble();
            Prog213vBank wow = new Prog213vBank(balance);

            String code = input.next();
            while (!(code.equals("E"))) {
                double amt = input.nextDouble();
                Prog213vtransaction fred = new Prog213vtransaction(code, amt);
                list.add(fred);
                code = input.next();

            }

            for (int lcv = 0; lcv< list.size(); lcv++){
                wow.calc(list.get(lcv));
            }

            System.out.println("The final balance is: $" + wow.getAmt());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57774:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.Prog213vmain
The final balance is: $219.15

Process finished with exit code 0

 */