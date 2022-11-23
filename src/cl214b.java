import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class cl214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));
        while (input.hasNext()){
            int ID = input.nextInt();
            double basepay = input.nextDouble();
            double shiftCode = input.nextDouble();
            double hrsworked = input.nextDouble();
            cl214bhelper help = new cl214bhelper();



        }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*Employee number 1001
Hours 34.50  Rate 4.50  Shift Factor 1.25
             Current         Year-to date
Gross Pay    194.06      1056.10
Withholding    23.29
FICA               11.74
Net Pay        159.03

 */