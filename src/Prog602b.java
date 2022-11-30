import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog602b {
        public static void main(String[] args) {
            try {
                Scanner input = new Scanner(new File("data/prog602b.dat"));
                ArrayList<InternetCustomer> list = new ArrayList<InternetCustomer>();

                while (input.hasNext()) {
                    int id = input.nextInt();
                    double hours = input.nextDouble();
                    int code = input.nextInt();
                    InternetCustomer fred = new InternetCustomer(id, hours, code);
                    list.add(fred);
                    //will put it at the end of the list and add it to the list
                }
                for (int lcv = 0; lcv < list.size(); lcv++) {
                    InternetCustomer current = list.get(lcv);
                    current.setCharge();
                }
                System.out.println("Account+\t\tHours\t\tCode\t\tAmount Due");
                for (InternetCustomer me : list) {
                    System.out.println(me.getAcc() + "\t\t" + me.getMyHours() + "\t\t" +
                            me.getCode() + "\t\t" + me.getCharge());
                }


            } catch (IOException e) {
                System.out.println("Can't find data file!");
            }
        }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61638:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog602b
Account+		Hours		Code		Amount Due
1825		3.25		0		200.0
14063		17.06		1		661.8
17185		7.93		1		396.5
19111		12.0		2		700.0
20045		5.0		1		250.0
21352		5.84		0		242.0
22841		27.9		2		1087.0
23051		1.55		2		350.0
29118		15.02		0		550.6

Process finished with exit code 0
 */