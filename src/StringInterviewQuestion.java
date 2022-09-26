import java.util.Locale;

public class StringInterviewQuestion {
    public static void main(String [] args) {
        String inputStr = "Morning" ;
        inputStr = inputStr.toLowerCase();

        for (int lcv = 0; lcv < inputStr.length(); lcv ++) {
            char c = inputStr.charAt(lcv);
            if (inputStr.indexOf(c) == inputStr.lastIndexOf(c)) {
                System.out.println("First non-repeating character is: " + c);
                break;
            }

        }

    }

}

/*C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51680:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" StringInterviewQuestion

        First non-repeating character is: m

        Process finished with exit code 0
*/
