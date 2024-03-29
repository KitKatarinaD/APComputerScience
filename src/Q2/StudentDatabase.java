package Q2;

import java.util.ArrayList;
import java.util.*;

public class StudentDatabase {
    public static int indexOfStu(ArrayList<Student> db, int id) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getId() == id) index = lcv;
        }
        return index;
    }

    public static void printStu(Student stu) {
        System.out.printf("%s\t%s\t%d\t%f\n",
                stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
    }

    public static int indexOfStu(ArrayList<Student> db, String last) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getLastName().equals(last)) index = lcv;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<Student>();
        while (true) {
            System.out.println("1 - add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for student (by id)");
            System.out.println("4 - Search for student (by last name)");
            System.out.println("5 - modify a student's GPA");
            System.out.println("6 - Remove student (by id)");
            System.out.println("7 - Exit\n\nPlease enter your choice: ");
            int c = input.nextInt();

            if (c == 1) {
                System.out.print("Enter first name: ");
                String first = input.next();
                System.out.print("Enter last name: ");
                String last = input.next();
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();
                Student st = new Student(first, last, id, gpa);
                db.add(st);

            } else if (c==2) {
                System.out.println("First\tLast\tID\tGPA");
                for (Student stu : db) {
                    printStu(stu);
                }
            }else if (c==3) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index != -1) printStu(db.get(index));
                else System.out.println("No student was found with that ID. ");
            }else if (c==4) {
                System.out.print("Enter last name: ");
                String last = input.next();
                int index = indexOfStu(db, last);
                if (index != 1) printStu(db.get(index));
                else System.out.println("No student was found with that last name. ");
            }else if (c==5) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index == -1) {
                    System.out.println("No student was found with that ID.");
                }else {
                    System.out.print("Enter GPA: ");
                    double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA updated successfully!");
                }
            }else if (c==6) {
                System.out.print("Enter student ID: " );
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index == -1) System.out.println("No student was found with that ID.");
                else db.remove(index);
            }else if (c==7) {
                return;
            }
        }



    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=51776:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" Q2.StudentDatabase
1 - add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice:
1
Enter first name: J
Enter last name: D
Enter student ID: 2
Enter GPA: 4
1 - add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice:
2
First	Last	ID	GPA
J	D	2	4.000000
1 - add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice:
3
Enter student ID: 2
J	D	2	4.000000
1 - add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice:
4
Enter last name: D
J	D	2	4.000000
1 - add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice:
5
Enter student ID: 2
Enter GPA: 3.0
GPA updated successfully!
1 - add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice:
6
Enter student ID: 2
1 - add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice:
7

Process finished with exit code 0

 */