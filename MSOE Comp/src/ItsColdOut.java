import java.util.Scanner;

public class ItsColdOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int daynum = 0;
        int noColdDays = 0;
        while (daynum < days) {
            int temp1 = input.nextInt();
            int temp2 = input.nextInt();
            int diff = Math.abs((temp1-temp2));
            if (diff>=15){
                System.out.println("Temperature drop (" + diff + " degrees) on day " + daynum);
            }
            else {
                noColdDays++;
            }
            daynum++;
        }
        if (noColdDays==days) {
            System.out.println("No cold days");
        }
    }
}
/*

8
59
60
45
50
51
45
40
19

 */