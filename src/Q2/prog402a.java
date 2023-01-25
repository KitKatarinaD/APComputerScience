package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prg402a.dat"));
            Prog402aClass[] list = new Prog402aClass[21];
            int size= 0;
            System.out.println("ID\t\tScore\t\tDiff");
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();
                Prog402aClass vector = new Prog402aClass(id, score);
                list[size] = vector;
                size++;
            }
            double tot = 0;
            for (Prog402aClass vector : list) {
                tot = tot + vector.getMyscore(); //gets score from vector "book"
            }
            double avg = tot/size;
            //calculated average of all scores

            for (int index = 0; index < size; index++) {
                list[index].calc(avg);
            }
            for (Prog402aClass vector : list) {
                System.out.print(vector.getMyid() + "\t\t");
                System.out.print(vector.getMyscore() + "\t\t");
                System.out.printf("%.2f\n", vector.getMydiff());
            }
            System.out.printf("Average score: %.2f", + avg);





        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=50007:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.prog402a
ID		Score		Diff
115		257		14.38
123		253		10.38
116		246		3.38
113		243		0.38
112		239		-3.62
104		239		-3.62
110		238		-4.62
218		243		0.38
208		242		-0.62
222		223		-19.62
223		230		-12.62
213		229		-13.62
207		228		-14.62
203		224		-18.62
305		265		22.38
306		262		19.38
311		256		13.38
325		246		3.38
321		245		2.38
323		245		2.38
301		242		-0.62
Average score: 242.62
Process finished with exit code 0

 */


        //read in the data file
        //calculate the avg
        //call calc by passing in the avg---current.calc(avg)