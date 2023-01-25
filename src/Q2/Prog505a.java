package Q2;//Katarina Dries
//1/3/2023
//Q2.Prog505a
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505a.dat"));
            List<cl505a> list = new ArrayList<cl505a>();
            while (input.hasNext()) {
                String fname = input.next();
                String lname = input.next();
                int books = input.nextInt();
                cl505a wowser = new cl505a(fname + " " + lname, books);
                list.add(wowser);
            }

            for (int i = 0; i <list.size(); i++) {
                cl505a cur = list.get(i);
                cur.calc();
            }
            for (cl505a x : list) //prints out everything in the Arraylist and calls the toString method.
                System.out.println(x);

            double tot = 0;
            for (cl505a b : list) tot += b.getPoints();
            double avg = tot/list.size();

            int bigPoints = list.get(0).getPoints();
            String bigName = list.get(0).getName();

            for (int lcv = 0; lcv < list.size(); lcv++) {
                cl505a book = list.get(lcv);
                if (book.getPoints() > bigPoints) {
                    bigPoints = book.getPoints();
                    bigName = book.getName();
                }
            }
            System.out.println("\nAvg points:" + avg);
            System.out.println("The winner is: " + bigName);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=62755:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.Prog505a
Sam Summer	4	45
Linda Lazy	2	20
Paul Prodder	5	60
K.C. Master	8	115
Richie Reader	6	75

Avg points:63.0
The winner is: K.C. Master

Process finished with exit code 0

 */
