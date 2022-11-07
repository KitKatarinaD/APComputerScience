import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215a.dat"));
            cl213b[] list = new cl213b[1000]; //inside bracket specifies how many slots.
            int cnt = 0; //keeps track of how many items you hit
            while (input.hasNext()) {
                int quant = input.nextInt();
                cl213b coolbeans = new cl213b(quant);
                list[cnt] = coolbeans; //first item... always starts counting at 0
                cnt++;
            }
            for (int lcv = 0; lcv <cnt; lcv++){
                list[lcv].calc();
            }
            for (int lcv = 0; lcv<cnt; lcv++) {
                System.out.println(list[lcv].toString());
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}