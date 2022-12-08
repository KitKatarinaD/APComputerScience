import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog435a.dat"));
            Prog435aClass[] lot = new Prog435aClass[50];
            int size = 0;
            while (input.hasNext()) {
                int car = input.nextInt();
                int gate = input.nextInt();

                Prog435aClass auto = new Prog435aClass(car, gate);

                lot[size] = auto;
                size++;
            }

            System.out.println("Car Type:\t\tBase Toll\t\tFactor\t\tCost\t\t");

            for (int index=0; index < size; index++) {
                lot[index].calc();
                Prog435aClass cur = lot[index];
                System.out.print(cur.getMytype() + "\t\t");
                System.out.printf("$%.2f\t\t%.2f\t\t$%.2f\n", cur.getMytoll(), cur.getMyfactor(), cur.getMycost());

            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=58515:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog435a
Car Type:		Base Toll		Factor		Cost
Compact Car		$1.35		1.00		$1.35
Small Car		$2.50		1.30		$3.25
Mid Size Car		$4.10		1.60		$6.56
Full Size Car		$5.50		2.00		$11.00
Truck		$2.00		2.40		$4.80
16 Wheeler		$3.25		2.70		$8.78
Compact Car		$4.80		1.00		$4.80
Small Car		$6.00		1.30		$7.80
Mid Size Car		$1.35		1.60		$2.16
Full Size Car		$2.50		2.00		$5.00
Truck		$4.10		2.40		$9.84
16 Wheeler		$5.50		2.70		$14.85
Compact Car		$6.00		1.00		$6.00
Small Car		$1.35		1.30		$1.76
Mid Size Car		$2.00		1.60		$3.20
Full Size Car		$2.50		2.00		$5.00
Truck		$3.25		2.40		$7.80
16 Wheeler		$4.10		2.70		$11.07

Process finished with exit code 0

 */