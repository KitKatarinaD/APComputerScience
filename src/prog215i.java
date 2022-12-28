import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog215i.dat"));

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
