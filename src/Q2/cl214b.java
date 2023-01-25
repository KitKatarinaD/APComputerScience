package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class cl214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog214b.dat"));
            cl214bhelper[] list = new cl214bhelper[100];
            //making a new array of Q2.cl214bhelper objects..... and each Q2.cl214bhelper (object) has the ID, ytdpay, basepay...etc
            int size = 0;
        while (input.hasNext()){
            int ID = input.nextInt();
            double ytdpay = input.nextDouble();
            double basepay = input.nextDouble();
            double shiftCode = input.nextDouble();
            double hrsworked = input.nextDouble();
            //grabbing values from the data file in the correct order.

            cl214bhelper person = new cl214bhelper(ID, ytdpay,basepay, shiftCode, hrsworked);
            //creating a new Q2.cl214bhelper object with each of the variables in the data file
            list[size] = person;
            //put person into the "size" slot in list ---list is the array name
            size++;
            //moves you over to the next slot
        }
        for (int index = 0; index < size; index++) {
            list[index].calc();
        }
        //index 0 is the start of the list and size is the max index (the end of the list)
            //for every index, you call calc on the person at that index

        // for (Q2.cl214bhelper currentperson : list) { if (currentperson != null) System.out.println("..." + currentperson.getMyID)); } ...
        for (int index = 0; index < size; index++) {
            cl214bhelper cur = list[index];
           //grab the Q2.cl214bhelper person from the current index (position) in the list (array)

            System.out.println("Employee number: " + cur.getMyID());
            //getting ID from the current Q2.cl214bhelper person (so from that spot in the list it gets that ID)
            System.out.println("Hours: " + cur.getMyHoursWorked()  + "\t Rate:" + cur.getMytaxrate() + "\t Shift Factor"
             + cur.getMyShiftFactor());
            System.out.println("\t\t Current \t\t Year-To-Date");
            System.out.println("Gross pay: \t" + cur.getMygrosspay() + "\t" + cur.getMyytdPay());
            System.out.println("Withholding: " + cur.getMywholding());
            System.out.println("FICA: " + cur.getMyFICA());
            System.out.println("Net Pay: " + cur.getMyNetPay());
            System.out.println("");
        }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}


/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=63306:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Q2.cl214b
Employee number: 1001.0
Hours: 34.5	 Rate:5.625	 Shift Factor1.25
		 Current 		 Year-To-Date
Gross pay: 	194.0625	1056.1
Withholding: 23.287499999999998
FICA: 11.74078125
Net Pay: 159.03421875

Employee number: 1002.0
Hours: 25.0	 Rate:3.25	 Shift Factor1.0
		 Current 		 Year-To-Date
Gross pay: 	81.25	3970.0
Withholding: 0.0
FICA: 4.9156249999999995
Net Pay: 76.334375

Employee number: 1003.0
Hours: 30.0	 Rate:4.0	 Shift Factor1.0
		 Current 		 Year-To-Date
Gross pay: 	120.0	12485.5
Withholding: 9.6
FICA: 7.26
Net Pay: 103.14

Employee number: 1004.0
Hours: 38.5	 Rate:7.875	 Shift Factor1.5
		 Current 		 Year-To-Date
Gross pay: 	303.1875	15587.4
Withholding: 53.0578125
FICA: 18.34284375
Net Pay: 231.78684375

Employee number: 1005.0
Hours: 40.0	 Rate:6.25	 Shift Factor1.0
		 Current 		 Year-To-Date
Gross pay: 	250.0	17188.5
Withholding: 37.5
FICA: 8.379249999999999
Net Pay: 204.12075

Employee number: 1006.0
Hours: 48.0	 Rate:13.424999999999999	 Shift Factor1.5
		 Current 		 Year-To-Date
Gross pay: 	644.4	19109.4
Withholding: 112.76999999999998
FICA: 0.0
Net Pay: 531.63

Employee number: 1007.0
Hours: 35.0	 Rate:7.5	 Shift Factor1.5
		 Current 		 Year-To-Date
Gross pay: 	262.5	15600.0
Withholding: 39.375
FICA: 15.88125
Net Pay: 207.24375


Process finished with exit code 0

 */