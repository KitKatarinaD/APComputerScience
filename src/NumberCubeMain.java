public class NumberCubeMain {
    private static int isReady =18;
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        //Static means ready at compile time
        //i.e. we dont have to make an object to use the method/variable
        //much like all of our math functions
        //always available no matter what
        int[] tosses = new int[numTosses];
        for (int lcv = 0; lcv < numTosses; lcv++)
            tosses[lcv] = cube.toss();
            return tosses;
    }
    public static int getLongestRun(int[] values) {
        int max = 0;
        int maxIndex = -1;
        int current = 0;
        for (int lcv= 0; lcv < values.length - 1; lcv++) {
            if (values[lcv] == values[lcv + 1]) {
                current++;
            }
            else {
                if (current > max) {
                    max = current;
                    maxIndex = lcv - current;
                }
                current = 0;
            }
        }
        if (current > max) {
            max = current;
            maxIndex = values.length - current;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        NumberCube x = new NumberCube();
        int[] y = getCubeTosses(x, 18);
        for (int temp : y) {
            System.out.print(temp + " ");
        }
        System.out.println("\nLongest run: " + getLongestRun(y));
    }



}
