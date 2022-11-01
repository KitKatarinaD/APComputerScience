import java.util.Scanner;

public class cl82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit: ");
        double SpdLmt = input.nextInt();

        System.out.println("Enter the vehicle speed: ");
        int VSpeed = input.nextInt();
        cl82ahelper help = new cl82ahelper(SpdLmt, VSpeed);
        help.calc();
        double fine = help.getmyfine();

        System.out.printf("Fine------------------$%.2f\2", fine);
    }
}
