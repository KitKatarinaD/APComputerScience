import java.util.Scanner;


public class SallySellsSeashells {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the shell weights: ");

        int[] weights=new int[100];
        int count=1;
        int countless=0;
        for (int lcv=0; lcv<count; lcv++) {
            int we=input.nextInt();
            weights[lcv]=we;
            count++;
        }
        for (int lcv=0; lcv<count; lcv++) {
            if (weights[lcv]<100) {
                countless++;
            }
        }
        System.out.println(countless);

    }
}
//bucket holds 100g
//no order has more than 100 shells
//each shell weight on its own line
//