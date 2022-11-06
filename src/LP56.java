import java.util.Scanner;
public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        //will need to find a math way to do it...cannot change string to int bc not on ap subset
        int yup = input.nextInt();
        int sum = 0;
        int lcv = 0;
        int x = 0;

        while (x < yup) {
            x = (int) Math.pow(10, lcv);
            lcv ++;
        }
        lcv--;
        x = (int) Math.pow(10, lcv);

        while (lcv > -1){
            x = (int) Math.pow(10, lcv);
            sum += (int) (Math.floor((double)(yup/x)) );
            yup = (int) Math.floor((double) yup % x);
            lcv--;

        }

       System.out.println(sum);

        }

    }

    /*
    C:\Users\katar\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=55944:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\katar\IdeaProjects\APComputerScience\out\production\AP Computer Science" LP56
Enter a positive integer:
892
19

Process finished with exit code 0

     */
