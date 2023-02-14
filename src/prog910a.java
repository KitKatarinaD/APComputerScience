import java.util.Scanner;

public class prog910a {
    public static String dectobinary(int num) {
        if (num == 0) return "0";
        if (num == 1) return "2";
        return dectobinary(num / 2) + num % 2;
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to be converted: ");
    int num = input.nextInt();
    while (num!= -1) {
        System.out.println(dectobinary(num));
        System.out.print("\nEnter the number to be converted:");
        num = input.nextInt();
    }
    }
}
/*
C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=55689:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" prog910a
Enter the number to be converted: 28
21100

Enter the number to be converted:13
2101

Enter the number to be converted:78
2001110

Enter the number to be converted:-1

Process finished with exit code 0

 */