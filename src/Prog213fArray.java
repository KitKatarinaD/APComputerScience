import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215a.dat"));
            cl213f[] list = new cl213f[1000];
            int cnt = 0;

            while (input.hasNext()) {
                int kwh = input.nextInt();

                cl213f yikes = new cl213f(kwh);
                list[cnt] = yikes;
                cnt++;
            }

            for (int lcv = 0; lcv < cnt; lcv++)
                list[lcv].calc();
            for (int lcv = 0; lcv < cnt; lcv++)
                list[lcv].calc();

        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
