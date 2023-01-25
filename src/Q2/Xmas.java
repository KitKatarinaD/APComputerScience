package Q2;

public class Xmas {
    public static void main(String[] args) {
        int branches = 16;
        int num = 1;
        String[] types = {".", ".", ".", ".",
        "~", "~", "~", "~",
        "'", "'", "'", "'","0"};
        for (int r = branches + 1; r>=1; r--) {
            if (num==1) {
                for (int c = 0; c < r; c++) {
                    System.out.print(" ");}
                    System.out.print("*\n");
                num+= 2;
                }else {
                for (int x = 0; x < r; x++) System.out.print(" ");
                for (int y = 0; y < num; y++) {
                    int indx = (int) (Math.random() * types.length);
                    System.out.print(types[indx]);
                }
                System.out.print("\n");
                num+= 2;
            }
        }
        for (int x = 0; x < branches + 1; x++)
            System.out.print(" ");
        for (int x = 0; x < branches + 1; x++)
            System.out.print(" ");
        System.out.println("|\n\n Happy Holidays from Java!");
    }
}
/*C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=58924:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.Xmas
                 *
                '~.
               '.0.~
              ~00..~.
             ''~..~0~.
            .~.~~~..~.~
           .~~.~~'~'.~~'
          ~~.'0~.~.0~'~.~
         0..'~~''..''.''''
        ~'~.'~'~~~'0.~.~.~~
       ~0''~0~0~'..'.''~~0'~
      ..~'.'..0...''0~''~.~.0
     ..~'~'~.'..'.~''~'..'~.'.
    ~.'.'~'~'.~~~~'0'''..~~'~'~
   0...'~''~~.'.~'..~.'0.''..~..
  ~00.'~..'.'0''~.00~~~'.'~~..'.~
 ''~~~0~.'~~~.~.''0~'~.'~.'.'..'0.
                                  |

 Happy Holidays from Java!

Process finished with exit code 0


 */