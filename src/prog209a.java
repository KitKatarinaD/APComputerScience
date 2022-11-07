import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog209a {
public static void main(String [] args) {
    try {
        Scanner input = new Scanner(new File("C:\\Users\\dries.k\\IdeaProjects\\AP Computer Science\\data\\prog215a.dat"));

        int num1 = 0;
        int num2 = 0;
        while (input.hasNext() ){
            int a = input.nextInt();
            if (a<500) {
                num1++;
            }
            else{
                num2++;
            }


        }
        int sum = num1 + num2;
        System.out.println("The number of numbers less than 500 is " + num1);
        System.out.println("The number of numbers greater than or equal to 500 is " + num2);
        System.out.println("The total number of numbers is " + sum);
    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }



}

}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=50747:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" prog209a
The number of numbers less than 500 is 192
The number of numbers greater than or equal to 500 is 208
The total number of numbers is 400

Process finished with exit code 0


 */