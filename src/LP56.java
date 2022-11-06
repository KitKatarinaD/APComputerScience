import java.util.Scanner;
public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        //will need to find a math way to do it...cannot change string to int bc not on ap subset
        int yup = input.nextInt();
        int sum = 0;
        int lcv = 0;
        int x = (int) Math.pow(10, lcv);
        // yup % 100 = 92     92/10=9     9 + ( 92 %\10)
        //while (lcv!=yup) { lcv
        while (x < yup) {
        lcv ++;
        }
        lcv--;


        while (lcv > -1){
            yup += Math.floor((double)(yup/x)) + ((double) yup % x);
            lcv--;
        }

       System.out.println(yup);

        }

    }

