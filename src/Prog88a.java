// Katarina Dries
//9/12/2022
//Prog88a

public class Prog88a {
    public static void main(String [] args) {
        //Enter number 1-13
        //Enter number 1-20
        //Math.random() * (max - min) + min
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;


        int sum = num1 + num2;
        int dif = num1 - num2;
        int max;
        //The code inside 'if' will only run if condition is true
        if (num1 > num2) {
            max = num1;
        }
        else { // otherwise...
            // (num2 > num1)

    }

        System.out.println("Maximum");
}
