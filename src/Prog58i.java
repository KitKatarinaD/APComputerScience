// Katarina Dries
//9/12/2022
//Prog58i


import java.util.Scanner;

public class Prog58i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount I wish to borrow is: ");
        double p = input.nextDouble();
        //p stands for principle


        System.out.println("The loan rate is: ");
        double r = input.nextDouble();
        //r stands for rate

        System.out.println("The number of months it will take me to pay off the loan is ");
        double m = input.nextDouble();
        //m stands for month

        double s = r/1200;

        double mp = p * s * ((Math.pow(m, (1+s)))/(Math.pow(m, (1+s)) - 1));
        //mp means monthly payment

        System.out.printf("My monthly payments will be $%.2f\n", mp);
        System.out.printf("The total interest paid is $%2f\n", mp * m);
        System.out.printf("The total amount paid is $%2f\n", ((mp * m) + p));
    }

}
/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=59901:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" Prog58i
The amount I wish to borrow is:
7500
The loan rate is:
14.5
The number of months it will take me to pay off the loan is
36
My monthly payments will be $93.10
The total interest paid is $3351.656219
The total amount paid is $10851.656219

Process finished with exit code 0

 */