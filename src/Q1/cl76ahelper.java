package Q1;

public class cl76ahelper {
    private int Mynum;
    private int mult;
    private int Myans;
    private int Mystep2;


    public cl76ahelper (int n) {
        Mynum = n;
        Mystep2 = 0;
        mult = 12345679;
        Myans = 0;
    }
    public void calc() {
        Mystep2 = Mynum * 9;
        Myans = Mystep2 * mult;
    }
    public int getMyans() {
        return Myans;
    }
    public int getMystep2() {
        return Mystep2;
    }

}
