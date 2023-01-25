package Q2;

import javax.naming.CannotProceedException;
import java.util.Locale;

public class StrInterview2 {
    public static void main(String [] args) {
        String word = "Mary";
        String anagram = "Army";
        word = word.toLowerCase();
        anagram = anagram.toLowerCase();
        if (word.length() != anagram.length()) {
            System.out.println("Not anagrams");
        } else {
            for (int lcv = 0; lcv < word.length(); lcv++) {

                char c = word.charAt(lcv);
                int index = anagram.indexOf(c);

                if (index != -1) {
                    anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());

                } else {
                    System.out.println("Not anagram");
                }
            }


        }
        System.out.println("Are these anagrams?" + anagram.isEmpty());
        //isEmpty is the same as .length

    }

}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51656:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.StrInterview2
Are these anagrams?true

Process finished with exit code 0

 */