//Prog 122b
//KatarinaDries
//10/2/2022


public class Prog122b {
    public static void main(String [] args) {

        int pay = 4;
        int Hours = 0;

        System.out.println("The Rate of pay is $4 per hour");
        System.out.println(" ");
        System.out.println("Hours:       Pay:" );

        while (Hours < 40 ) {
            Hours ++;
            pay = Hours * 4;
            System.out.println(Hours +"           " + pay);

        }



    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=50776:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Prog122b
The Rate of pay is $4 per hour

Hours:       Pay:
1           4
2           8
3           12
4           16
5           20
6           24
7           28
8           32
9           36
10           40
11           44
12           48
13           52
14           56
15           60
16           64
17           68
18           72
19           76
20           80
21           84
22           88
23           92
24           96
25           100
26           104
27           108
28           112
29           116
30           120
31           124
32           128
33           132
34           136
35           140
36           144
37           148
38           152
39           156
40           160

Process finished with exit code 0

 */