public class cl54bhelper {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int mysum;
    private int myavg;

    public cl54bhelper(int n1, int n2, int n3, int n4) {
        num1=n1;
        num2=n2;
        num3=n3;
        num4=n4;
        mysum = 0;
        myavg = 0;
    }
    public void calc() {
        mysum = num1 +num2 + num3 + num4;
        myavg = mysum/4;
    }
    public int getmysum() {
        return mysum;
    }
    public int getmyavg() {
        return myavg;
    }

}
