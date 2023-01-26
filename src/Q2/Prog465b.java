package Q2;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465b.dat"));
            int[][] mat = new int[3][4];

            for (int r= 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }
            for (int r= 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println("Numbers less than 100: ");
            System.out.println();
            System.out.println("Row\t\tColumn");


            for (int r= 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    if (mat[r][c] < 100) {
                        System.out.println((r+1) + "\t\t" + (c+1));
                    }
                }
            }






        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=64266:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.Prog465b
100 195 182 225
83 125 235 67
129 42 100 750
Numbers less than 100:

Row		Column
2		1
2		4
3		2

Process finished with exit code 0
 */