import java.util.Scanner;
import java.io.File;
import java.io.IOException;

//public class Prog701g {
//    public static void main(String[] args) {
//        try {
//            Scanner input = new Scanner(new File("data/prog701g.dat"));
//            List<Person> list = new ArrayList<Person>();
//
//            int num = input.nextInt();
//            while (num!=99) {
//                String f = input.next();
//                String l = input.next();
//
//              if (num==1) {
//                double g = input.nextDouble();
//                Person p = new Student(f, l, g);  //the arraylist is objects person, and they have the same methods? so its better to put it as student
//                list.add(p);
//              }else if (num==3) {
//                String fav = input.next();
//                Person p = new Admin(f, l, g);
//                list.add(p);
//              }
//              num = input.nextInt();
//
//            }
//            double tot = 0;
//            int cnt = 0;
//          int totstus = 0;
//          String large = "";
//          String sm = "quifhuihgwruighriwuigggggggggggggggggggghruiwhureihgiurhiugiurghnnhbhjnhujhbhusdfnhuhwjghriuwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwoohruiewwruiwghwgriuwrrrrrrrhhhjjkjkkjhuikhuikhujnhunhuhujrdujcfabafhhhhhhhhhhhhhhjjkajfsbghujbhnjmhjkjiparupsghhhhhhhhhhhdfbrhfjsmjnhwfrbgyuboybgtg j   rurjrtghhwiughugtiwhjhjwpurhguhjhfjbsnm";
//          for (Person x : list) {
//            if (x instanceof Student) {  //instanceof checks to see if person x is student type
//              tot+= ((Student)x).getGPA();
//              cnt++;
//            }
//            if (x instanceof Teacher)
//              totstus += ((Teacher)x).getNumStuds();
//              if (x instanceof Admin)
//                String xstring = ((Admin)x).getFavw();
//
//                if(xstring.length() > large.length())
//                  large = xstring;
//                if (xstring.length() < sm.length())
//                  sm = xstring;
//
//
//          }
//          System.out.printl("Avg student GPA: " + String.format("%.2f", (tot/cnt)));
//          System.out.println("Total num of students taught: " + totstus);
//
//        } catch (IOException e) {
//            System.out.println("Can't find data file!");
//        }
//    }
//}