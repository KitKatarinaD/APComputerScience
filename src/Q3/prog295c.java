package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog295c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/merge1.dat"));
            ArrayList<employee> firstlist = new ArrayList<employee>();
            while (input.hasNext()) {
                int ssn = input.nextInt();
                String Class = input.next();
                String type = input.next();
                int dept = input.nextInt();
                employee em = new employee(ssn, Class, type, dept);
                firstlist.add(em);
            }

            Scanner input2 = new Scanner(new File("data/merge2.dat"));
            ArrayList<employee> secondlist = new ArrayList<employee>();
            while (input.hasNext()) {
                int ssn = input.nextInt();
                String Class = input.next();
                String type = input.next();
                int dept = input.nextInt();
                employee em = new employee(ssn, Class, type, dept);
                firstlist.add(em);
            }

            for (int i = 0; i < firstlist.size(); i++) {

            }
            for (employee e : firstlist) {
                if (e.getMyssn() < )
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
