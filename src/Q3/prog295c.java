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
            for (int lcv = 0; lcv <finallist.size(); lcv++){
                for (int lcv2 = 0; lcv2 <finallist.size()-1; lcv2++){
                    if (finallist.get(lcv2).getMyssn() > finallist.get(lcv2+1).getMyssn()){
                        employee temp = finallist.get(lcv2);
                        finallist.set(lcv2, finallist.get(lcv2+1));
                        finallist.set(lcv2+1, temp);
                    }
                }
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
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=58053:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q3.prog295c
social sec#	Class	Type	Dept
1	A	B	1
111111111	A	B	1
111111111	A	B	1
111111111	A	B	1
123456789	C	F	5
222222227	D	L	9
222222227	D	L	9
222222227	D	L	9
321012345	A	B	1
321012345	A	B	1
321012345	A	B	1
357864219	C	F	5
357864219	C	F	5
357864219	C	F	5
411529485	D	L	9
411529485	D	L	9
411529485	D	L	9
432233489	A	B	1
514981234	A	B	1
514985555	C	F	5
514985555	C	F	5
514985555	C	F	5
521968743	C	F	5
521968743	C	F	5
521968743	C	F	5
522778765	C	F	5
522778766	C	F	5
522778767	C	F	5
525252525	A	B	1
525252525	A	B	1
525252525	A	B	1
531459260	C	F	5
538111234	D	L	9
538111234	D	L	9
538111234	D	L	9
539121235	D	L	9
539121235	D	L	9
539121235	D	L	9
540131236	D	L	9
540131236	D	L	9
540131236	D	L	9
541141237	C	F	5
541141237	C	F	5
541141237	C	F	5

Process finished with exit code 0

 */