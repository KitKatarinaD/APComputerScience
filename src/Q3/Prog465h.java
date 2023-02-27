package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465h.dat"));

            for (int i = 0; i < 3; i++) {
                int[][] mat1 = new int[input.nextInt()][input.nextInt()];

                for (int r = 0; r < mat1.length; r++) {
                    for (int c = 0; c < mat1[r].length; c++) {
                        mat1[r][c] = input.nextInt();
                    }
                }
                System.out.println("Original Matrix");
                for (int r = 0; r < mat1.length; r++) {
                    for (int c = 0; c < mat1[r].length; c++) {
                        System.out.print(mat1[r][c] + " ");
                    }
                    System.out.println();
                }


                System.out.println("New matrix: ");
                int x = 0;
                for (int r = 0; r < mat1.length; r++) {
                    for (int c = 0; c < mat1[r].length; c++) {
                        if (mat1[r][c] != 0) {
                            x++;
                        }
                    }
                }


                int[] nums = new int[x];


                int[][] sm1 = new int[nums.length][3];

                for (int r = 0; r < mat1.length; r++) {
                    for (int c = 0; c < mat1[r].length; c++) {
                        if (mat1[r][c] != 0) {
                            sm1[sm1.length - x][0] = r + 1;
                            sm1[sm1.length - x][1] = c + 1;
                            sm1[sm1.length - x][2] = mat1[r][c];
                            x--;
                        }
                    }
                }
                for (int[] row : sm1) {
                    for (int num : row) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }

                if ((sm1.length) == (mat1.length + mat1[0].length)) {
                    System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");
                } else if ((sm1.length) > (mat1.length + mat1[0].length)) {
                    System.out.println("The Original Matrix is Sparse");
                } else {
                    System.out.println("The Original Matrix is Abundant");
                }


            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }/*
        C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=53043:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q3.Prog465h
Original Matrix
0 0 7 0 0 0
0 0 0 0 -8 0
0 0 0 0 0 0
2 0 0 0 0 0
0 0 0 0 0 0
New matrix:
1 3 7
2 5 -8
4 1 2
The Original Matrix is Abundant
Original Matrix
0 2 0 3 0 1
8 0 4 0 1 0
0 3 0 1 0 -7
5 0 9 0 6 0
0 2 0 -1 0 7
New matrix:
1 2 2
1 4 3
1 6 1
2 1 8
2 3 4
2 5 1
3 2 3
3 4 1
3 6 -7
4 1 5
4 3 9
4 5 6
5 2 2
5 4 -1
5 6 7
The Original Matrix is Sparse
Original Matrix
0 0 1 0 0 2
3 0 0 4 0 0
0 0 5 0 0 6
7 0 0 8 0 0
0 0 9 0 0 1
New matrix:
1 3 1
1 6 2
2 1 3
2 4 4
3 3 5
3 6 6
4 1 7
4 4 8
5 3 9
5 6 1
The Original Matrix is Abundant

Process finished with exit code 0
*/
    }
}
