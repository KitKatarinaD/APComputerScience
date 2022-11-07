import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("C:\\Users\\dries.k\\IdeaProjects\\AP Computer Science\\data\\prog215a.dat"));

            System.out.println("done!");//dekets
            int a = input.nextInt();
            int dis = 0;
            double per = 0;
            int tot= 0;
            System.out.println("\t\tLangner Family");
            while (input.hasNext()){
                tot++;
                while (a<20) {
                    dis++;
                }
                while (a<=39 && a>=20){
                    ++;
                }
                while (a>20 && a<39) {

                }

                System.out.println("The number of numbers less than 500 is " + num1);
                System.out.println("The number of numbers greater than or equal to 500 is " + num2);
                System.out.println("The total number of numbers is " + sum);
            }

        }
        catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
    Age  Group  Distribution   Percentage
<20            3                 17.65
        20-39            5                 29.41
        40-59            4                 23.53
        60-79            3                 17.65
        >79            2                 11.76
