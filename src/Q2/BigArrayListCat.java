package Q2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class BigArrayListCat {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats.add(new Cat(name, weight, age, cost));
            }
            //1.
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
            }
            //2.
            System.out.println("\n2. The third cat is named: " + cats.get(2).getName());

            //3.
            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());

            //4.
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal")) {
                    cats.remove(lcv);
                }
            }

            //5.
            cats.add(1, new Cat("Angel", 3.6, 1, 25.99));
            //6.
            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));

            //7.
            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
            }

            //8.
            Cat third = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);
            //9.
            Cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            //10.
            System.out.println("\n10. The current cat names are: ");
            for (Cat c : cats)
                System.out.print(c.getName() + "\t");
            System.out.println();

            //11.
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getCost() < 26) {
                    cats.remove(lcv);
                    lcv--;
                }
            }
            System.out.println("The costs of the remaining cats are: ");
            for (Cat c : cats)
                System.out.print(c.getCost() + " ");
            System.out.println();

            //12;
            System.out.println("\n12. The cats being put on a diet are: ");
            for (Cat cat: cats) {
                if (cat.getWeight() > 15)
                    System.out.print(cat.getName() + "\t");

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51135:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.BigArrayListCat
1. All the cats:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Panda	14.3	6	15.03
Rascal	21.1	21	0.0
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	17.2	10	37.57

2. The third cat is named: Rascal

3. The updated weight is: 27.2

7. The updated list is:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Angel	3.6	1	25.99
Panda	14.3	6	15.03
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	27.2	10	37.57
Gimpy	14.3	10	29.99

10. The current cat names are:
Inky	Blacky	Sugar	Angel	Taffy	Toby	Gimpy	Panda
The costs of the remaining cats are:
35.79 26.89 33.25 56.89 37.57 29.99

12. The cats being put on a diet are:
Inky	Sugar	Taffy	Toby
Process finished with exit code 0
 */