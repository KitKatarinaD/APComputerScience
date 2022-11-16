package Q1;

public class ArrayTest {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int lcv = 0; lcv < 100; lcv++)
            nums[lcv] = lcv + 1;
         //that just populated my array

        for (int lcv = 0; lcv < 100; lcv++)
            System.out.print(nums[lcv] + " ");
        System.out.println();

        char [] hello = "Q1.Hello world!".toCharArray();
        //for-each Loop
        for (char x: hello) {  //for every var x in array) {}
            System.out.print(x);
        }
        System.out.println();

        String[] words = {"Q1.Hello", "world", "wow", "cool", "wowsers", "cool beans"};
        //for (String temp : words;
     //   for (int lcv = 0; lcv< words.length;);
         //   System.out.println(words[lcv] );



        }
    }
