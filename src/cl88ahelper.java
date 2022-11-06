public class cl88ahelper {
    private int num1;
    private int num2;
    private int sum;
    private int diff;
    private int prod;
    private int dis;
    private int max;
    private double avg;

    public cl88ahelper(int n1, int n2){
        num1 = n1;
        num2 = n2;
        sum = 0;
        diff = 0;
        prod = 0;
        dis = 0;
        max = 0;
        avg = 0;
    }

    public void calc(){
        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        avg = (double) sum / 2 ;
        dis = Math.abs(diff);
        if (num1 > num2) {
            max = num1;
        }
        else if (num1 < num2){
            max = num2;
        }
        else {
           max = 0;
        }

    }

    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public int getSum() {
        return sum;
    }
    public int getDiff() {
        return diff;
    }
    public int getProd() {
        return prod;
    }
    public int getDis() {
        return dis;
    }
    public double getAvg(){
        return avg;
    }
    public int getMax() {
            return max;
    }

}
