import java.util.ArrayList;
import java.util.Scanner;


public class SallySellsSeashells {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int shellnum = 0;

        System.out.println("How many shells are you entering? ");
         shellnum = input.nextInt();
        ArrayList<Integer> Shellw = new ArrayList<Integer>();
        for(int i = 0; i < shellnum; i++)
        {
            System.out.println("What is the weight of shell " + (i+1));
            Shellw.add(input.nextInt());
        }

        int count = 0;
        for(int i = 0; i < Shellw.size(); i++)
        {
            count += Shellw.get(i);
        }
        int buckets = 0;
        buckets = count / 100;
        if(count %100 > 0)
        {
            buckets += 1;
        }

        System.out.println("The total amount of buckets you need is " + buckets);

    }
}
//bucket holds 100g
//no order has more than 100 shells
//each shell weight on its own line
//