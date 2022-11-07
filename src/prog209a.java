import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog209a {
public static void main(String [] args) {
    try {
        Scanner input = new Scanner(new File("C:\\Users\\dries.k\\IdeaProjects\\AP Computer Science\\data\\prog215a.dat"));

        System.out.println("done!");//dekets
        int a = input.nextInt();
        int num1 = 0;
        int num2 = 0;
        while (input.hasNext()){

            if (a<500) {
                num1++;
            }
            else{
                num2++;
            }
            int sum = num1 + num2;
            System.out.println("The number of numbers less than 500 is " + num1);
            System.out.println("The number of numbers greater than or equal to 500 is " + num2);
            System.out.println("The total number of numbers is " + sum);
        }

    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }



}

}
