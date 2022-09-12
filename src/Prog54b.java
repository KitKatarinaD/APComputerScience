import java.util.Scanner;
// Katarina Dries
//9/12/2022
//Prog54b

public class Prog54b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter 1st value: " );
        int num1 = scan.nextInt();

        System.out.print("Please enter the 2nd value: " );
        int num2 = scan.nextInt();

        System.out.print("Please enter the 3rd value: " );
        int num3 = scan.nextInt();

        System.out.print("Please enter the 4th value: " );
        int num4 = scan.nextInt();

        int sum = num1 + num2 + num3 + num4;
        System.out.println("The sum is: " + sum);

        double avg = sum/4.0;
        System.out.println("The average is: " +  avg);

    }
}
