import java.util.*;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the record: ");
        while (input.hasNext()) {
            int countwin = input.nextInt();
            int countlose = input.nextInt();

            int totalgame = countwin + countlose;
            int magicnum = totalgame - countwin - countlose + 1;
            if (magicnum >= 0) {
                System.out.println(magicnum);
            } else {
                System.out.println("eliminated from playoff contention");
            }
        }
    }
}
/*
88 56
75 71
73 70
76 68
65 78
0 0
 */
