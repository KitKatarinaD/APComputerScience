package Q3;

import java.util.Scanner;

public class prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection = 9;
       while (selection !=0) {
           System.out.println("0) Quit\n1)Encode Date\n2)Decode Date");
           System.out.print("Select an option: ");
           selection = input.nextInt();

           if (selection == 0) {
               return;
           }
           if (selection == 1) {
               System.out.print("Print the date to want to encode: \nMonth: ");
               int Month = input.nextInt();
               int Day = input.nextInt();
               int Year = input.nextInt();

           }

       }
    }

    public int decode(){
return -1;
    }

    public String encode(){
return "";
    }
}
