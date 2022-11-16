package Q1;

public class Prog122d {
    public static void main(String [] args){
        int x = -13;
        int y = 0;

        System.out.println("x                           y");
        while (x< 16) {
            x ++;
            y = (int) (Math.pow((double)x, 6.0) - 3.0 * (Math.pow((double)x, 5.0)) - 93.0 * (Math.pow((double)x, 4.0)) + 87.0 * (Math.pow((double)x, 3.0)) + 1596.0 * (Math.pow((double)x, 2)) - 1380.0 * ((double)x) - (2800.0));
            System.out.println(x + "                        " + y);

        }

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=51731:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Q1.Prog122d
x                           y
-12                        1897280
-11                        982800
-10                        453600
-9                        173888
-8                        45360
-7                        0
-6                        -6400
-5                        0
-4                        6048
-3                        7280
-2                        4320
-1                        0
0                        -2800
1                        -2592
2                        0
3                        2240
4                        0
5                        -10800
6                        -32032
7                        -60480
8                        -84240
9                        -78400
10                        0
11                        217728
12                        671840
13                        1496880
14                        2872800
15                        5033600
16                        8276688

Process finished with exit code 0

 */