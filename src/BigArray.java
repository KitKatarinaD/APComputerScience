public class BigArray {
    public static void main(String[] args) {
        /*
        Print the Array from the beginning to the end
Print the Array from the beginning to the end using a for-each loop
What number is in the middle of the Array?
What is the average of the first, last and middle numbers?
Find the smallest and the largest number in the Array
Switch the largest with smallest number. Print the list
Create a new random from 1 to 10 and insert it in the middle slot. Print the numbers.
Add 10 to every number in the List. Print all.
Replace the 3rd element in the array with 5 and print the number that was ousted (only use one method to complete this.)
What numbers are in the 50s?
What numbers are multiples of 4?
         */
    int[] array = new int[19];
    for (int lcv=0; lcv<array.length; lcv++) {
        array[lcv] = (int)(Math.random() * (91 - 20) + 20);
        }
    //1.
    for(int lcv = 0; lcv < array.length; lcv++) {
        System.out.print(array[lcv]+ " ");
    }
    System.out.println();
    //2.
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();
        //3.
        System.out.println("The middle number is " + array[array.length / 2]);
        //4.
        double avg = array[0] + array[array.length - 1] + array[array.length / 2];
        System.out.println("Average of the first, middle, and last numbers is " + (avg/3));
        //5
        int smallest =array[0];
        int largest =array[0];
        for (int num : array) {
            if (num<smallest){
                smallest=num;
            }
            if (num>largest)
                smallest=num;
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
        //6.
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == smallest) {
                array[lcv] = largest;
            }
            else if (array[lcv] == largest)
                array[lcv] = smallest;
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        //7.
        int randNum = (int) (Math.random() * 10 + 1);
        array[array.length / 2] = randNum;
        for (int x : array)
            System.out.print(x + " ");
        System.out.println();
        //8.
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] +=10;
        }
    for (int x : array) System.out.print(x + " ");
    System.out.println();
    //9.
        int mythird = array[2];
        array[2]=5;
        System.out.println("The number that was ousted is " + mythird);
    //10.
        for (int num : array) {
            if (num>= 50 && num<=59) {
                System.out.println(num + " ");
            }
        }
        //11.
        for (int lcv = 0 ; lcv < array.length; lcv++) {
            if (array[lcv] % 4 == 0) {
                System.out.println(array[lcv] + " ");
            }
        }
        System.out.println();
        //12.
        boolean sixty = false;
        for (int temp : array) {
            if (temp == 60) {
                sixty = true;
            }
        }
        System.out.println("Is 60 in the list? " + sixty);

        //13.
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] != array[array.length - 1 - lcv]) {
                same = false;
            }
        }
        System.out.println("Is the array palindromic? " + same);
        //14.
        double avg = 0;
        for (int x : array)
            avg += x;
        avg /= array.length;
        int count = 0;
        for (int x : array)
            if (x>avg) count++;
        System.out.printf("There are %d numbers greater than the average\n", count);
        //15.
        int evens = 0;
        for (int num : array)
            if (num % 2 == 0 ) {
                evens ++;
            }
        System.out.printf("There are %d even numbers \n", evens);
        //16.
        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array2[lcv] = array[array.length - 1 - lcv];
        }
        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();

        //17.
        int[] shiftarray = circularShiftRight();
        for (int num : shiftarray)
            System.out.print(num + " ");
        System.out.println();

        //18.
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while ( temp > 0) {
                int n = temp % 10;
                temp/=10;
                digitsum += n;
            }

            sum += digitsum;


        }
        System.out.println("Sum of all digits of all elements = " + sum);


    }

    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 0; lcv< arr.length; lcv++)
            shifted[lcv] = arr[lcv];


        for (int lcv = 0; lcv< shifted.length - 1; lcv++)
            shifted[lcv + 1] = arr[lcv];
        shifted[0] = temp;
        return shifted;
    }

}

/*
C:\Users\dries.k\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=58451:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\dries.k\IdeaProjects\AP Computer Science\out\production\AP Computer Science" BigArray
70 35 86 34 27 51 85 84 44 22 52 86 31 77 56 34 26 65 57
70 35 86 34 27 51 85 84 44 22 52 86 31 77 56 34 26 65 57
The middle number is 22
Average of the first, middle, and last numbers is 49.666666666666664
The smallest number is 22
The largest number is 86
70 35 22 34 27 51 85 84 44 86 52 22 31 77 56 34 26 65 57
70 35 22 34 27 51 85 84 44 3 52 22 31 77 56 34 26 65 57
80 45 32 44 37 61 95 94 54 13 62 32 41 87 66 44 36 75 67
The number that was ousted is 32
54
80
44
32
44
36


Process finished with exit code 0
 */