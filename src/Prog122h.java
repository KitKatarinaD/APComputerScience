//Katarina Dries
//Prog122h
//10/2/2022

public class Prog122h {
    public static void main(String [] args) {
        System.out.println("Number       Square        Square Root         Cube          4th Root");
        int num = 0;
        int sq = 0;
        double sqrt = 0;
        int cb = 0;
        double frth = 0;

        while (num < 20){
            num ++;
            sq = (int) Math.pow((double) num, 2.0);
            sqrt = Math.sqrt((double)num);
            cb = (int) Math.pow((double) num, 3.0);
            frth = Math.pow((double) num, 0.25);

            System.out.println(num + "           " + sq + "           " + sqrt + "      "+ cb + "       " + frth);







        }

    }
}
/*
C:\Users\16087\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\lib\idea_rt.jar=51969:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\16087\Desktop\APComputerScience\out\production\AP Computer Science" Prog122h
Number       Square        Square Root         Cube          4th Root
1           1           1.0      1       1.0
2           4           1.4142135623730951      8       1.189207115002721
3           9           1.7320508075688772      27       1.3160740129524924
4           16           2.0      64       1.4142135623730951
5           25           2.23606797749979      125       1.4953487812212205
6           36           2.449489742783178      216       1.5650845800732873
7           49           2.6457513110645907      343       1.6265765616977856
8           64           2.8284271247461903      512       1.681792830507429
9           81           3.0      729       1.7320508075688772
10           100           3.1622776601683795      1000       1.7782794100389228
11           121           3.3166247903554      1331       1.8211602868378718
12           144           3.4641016151377544      1728       1.8612097182041991
13           169           3.605551275463989      2197       1.8988289221159418
14           196           3.7416573867739413      2744       1.9343364202676694
15           225           3.872983346207417      3375       1.9679896712654303
16           256           4.0      4096       2.0
17           289           4.123105625617661      4913       2.0305431848689306
18           324           4.242640687119285      5832       2.0597671439071177
19           361           4.358898943540674      6859       2.087797629929844
20           400           4.47213595499958      8000       2.114742526881128

Process finished with exit code 0

 */