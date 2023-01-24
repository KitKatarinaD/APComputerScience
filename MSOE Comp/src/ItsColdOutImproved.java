import java.util.*;

public class ItsColdOutImproved {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int nocolddays = 0;
        System.out.print("Enter the series: ");
        int days=input.nextInt();
        int[] series=new int[days];
        for (int lcv=0; lcv<days; lcv++) {
            series[lcv]=input.nextInt();
        }
        for (int temp=0; temp<days-1; temp++) {
            if (Math.abs(series[temp+1]-series[temp])>=15) {
                System.out.println("Temperature drop (" + (Math.abs(series[temp + 1] - series[temp])) + " degrees) on day " + (temp + 2));
           nocolddays++;
            }

        }
        if (nocolddays==0) {
            System.out.println("No cold days");
        }
    }
}//8 59 60 45 50 51 45 40 19