
import java.util.Scanner;

public class prog54ccl {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double radius = input.nextDouble();
    helper54c wow = new helper54c(radius);
    wow.calc();

    double area = wow.getmyarea();

    double circumferance = wow.getmycir();
        System.out.println("The area is: " + area);

    }
}
