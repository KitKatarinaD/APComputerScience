package Q2;

public class test3 {
    public static void main(String [] args) {
        String text = "beautiful beach";
        for (int lcv = text.length(); lcv -->0;) { //says start at length, and subtract 1, then check if its greater than 0
            String chr = text.substring(lcv, lcv + 1); //start is inclusive, end is exclusive
            if (chr.equals("a") || chr.equals ("e") || chr.equals("i")
                    || chr.equals("o") || chr.equals("u"))
                System.out.print(chr);
            else System.out.print(" ");
        }
        System.out.println();

    }
}
//ae u i uae
/*C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=59426:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.test3
  ae   u i uae

Process finished with exit code 0


 */