package Q2;//Katarina Dries
//9/28/2022
//String Interview Question 7
import java.util.Locale;
import java.util.Scanner;


public class StrInterview7 {
    public static void  main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a new string: ");
        String mytext = keyboard.nextLine();

        mytext = mytext.toLowerCase(Locale.ROOT).trim();


        int vowelcount = 0;
        int conscount = 0;
        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            char cur = mytext.charAt(lcv);
            if (cur == 'a' || cur == 'e' || cur == 'i' || cur =='o' || cur =='u')
                vowelcount++;
            else if (cur != ' ') conscount++;

        }


        System.out.printf("# Vowels: %d\t\t# Consonants: %d\n", vowelcount, conscount);
    }
}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51251:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.StrInterview7
Enter a new string: hello
# Vowels: 2		# Consonants: 3

Process finished with exit code 0

 */