import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog285b.dat"));

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
