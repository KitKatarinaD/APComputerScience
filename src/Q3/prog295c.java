package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog295c {
    public static void main(String[] args) {
        try {
            Scanner input1 = new Scanner(new File("data/merge1.dat"));
            ArrayList<employee> firstlist = new ArrayList<employee>();

            ArrayList<employee> finallist = new ArrayList<employee>();


            while (input1.hasNext()) {
                String ssntemp = input1.next();
                String[] parts = ssntemp.split("-");
                int ssn = Integer.parseInt(parts[0] + parts[1] + parts[2]);
               String thing = input1.next();
               String Class = thing.substring(0, 1);
               String type = thing.substring(1, 2);
               int dept = Integer.parseInt(thing.substring(2, 3));
                employee em = new employee(ssn, Class, type, dept);
                finallist.add(em);
            }

            Scanner input2 = new Scanner(new File("data/merge2.dat"));
            ArrayList<employee> secondlist = new ArrayList<employee>();
            while (input2.hasNext()) {
                String ssntemp = input2.next();
                String[] parts = ssntemp.split("-");
                int ssn = Integer.parseInt(parts[0] + parts[1] + parts[2]);
                String thing = input2.next();
                String Class = thing.substring(0, 1);
                String type = thing.substring(1, 2);
                int dept = Integer.parseInt(thing.substring(2, 3));
                employee em = new employee(ssn, Class, type, dept);
                finallist.add(em);
            }

            Scanner input3 = new Scanner(new File("data/merge3.dat"));
            while (input3.hasNext()) {
                String ssntemp = input3.next();
                String[] parts = ssntemp.split("-");
                int ssn = Integer.parseInt(parts[0] + parts[1] + parts[2]);
                String thing = input3.next();
                String Class = thing.substring(0, 1);
                String type = thing.substring(1, 2);
                int dept = Integer.parseInt(thing.substring(2, 3));
                employee em = new employee(ssn, Class, type, dept);
                finallist.add(em);
            }

            Scanner input4 = new Scanner(new File("data/merge3.dat"));
            while (input4.hasNext()) {
                String ssntemp = input4.next();
                String[] parts = ssntemp.split("-");
                int ssn = Integer.parseInt(parts[0] + parts[1] + parts[2]);
                String thing = input4.next();
                String Class = thing.substring(0, 1);
                String type = thing.substring(1, 2);
                int dept = Integer.parseInt(thing.substring(2, 3));
                employee em = new employee(ssn, Class, type, dept);
                finallist.add(em);
            }

            //copy and paste bubble sort
            int x = 1;
            while (finallist.get(x-1).getMyssn() > finallist.get(x).getMyssn()) {
                for (int i = 1; i < finallist.size() - 1; i++) {

                    if (finallist.get(i).getMyssn() < finallist.get(i - 1).getMyssn()) {
                        finallist.add(i - 1, finallist.get(i));
                        finallist.set(i + 1, finallist.get(i));

                    }
                }
                x++;
            }

            System.out.println("social sec#\tClass\tType\tDept");
            for (employee em : finallist) {
                System.out.println(em.getMyssn() + "\t" + em.getMyClass() + "\t"
                + em.getMytype() + "\t" + em.getMydept());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
