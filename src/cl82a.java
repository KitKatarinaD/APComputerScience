import java.util.Scanner;

public class cl82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        cl82ahelper help = new cl82ahelper(vs);
        System.out.println("Enter the speed limit: ");
        double SpdLmt = input.nextInt();

        System.out.println("Enter the vehicle speed: ");
        int VSpeed = input.nextInt();



        double fine = help.getFine();

        System.out.printf("Fine------------------$%.2f\2", fine);
    }
}
