package Q1;

import java.util.Scanner;
public class LP55 {
    public static void main(String[] args) {
        System.out.println("Please enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        String num = input.nextInt() + ""; //turns a number into a string --input.next is turning the number the person puts in into a string

        for (int n = 0; n < num.length(); n++)
            System.out.println(num.substring(n, n+1));

    }
}
