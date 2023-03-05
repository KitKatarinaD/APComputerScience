package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            int[][] table = new int[6][3];
            while (input.hasNext()){
               int sex = input.nextInt();
               int grade = input.nextInt();

               table[grade-1][sex-1]++;
               table[grade-1][2]++;
               table[5][sex-1]++;
               table[5][2]++;
            }

            System.out.println("Grade    M  F  Total");
            System.out.println("A\t\t" + Arrays.toString(table[0]));
            System.out.println("B\t\t" + Arrays.toString(table[1]));
            System.out.println("C\t\t" + Arrays.toString(table[2]));
            System.out.println("D\t\t" + Arrays.toString(table[3]));
            System.out.println("F\t\t" + Arrays.toString(table[4]));
            System.out.println("_________________________");
            System.out.println("Totals\t" + Arrays.toString(table[5]));



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
/*C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=61225:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q3.prog477a
Grade    M  F  Total
A		[2, 4, 6]
B		[4, 4, 8]
C		[4, 7, 11]
D		[2, 3, 5]
F		[3, 0, 3]
_________________________
Totals	[15, 18, 33]

Process finished with exit code 0

 */