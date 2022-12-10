public class clLP48 {
    private final int myA;
    private final int myC;
    private final int myM;
    private int myx0; //seed

    public clLP48(int a, int c, int m, int x0){
        myA = a;
        myC = c;
        myM = m;
        myx0 = x0;
    }

    public int nextInt() {
        myx0 = (myA * myx0 + myC) % myM;
        return myx0;
    }

    public String toString() {
        return "(" + myA + " " + myx0 + " + " + myC + ") % " + myM + " = " + this.nextInt();

    }


}
