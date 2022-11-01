public class cl82ahelper {
    private double mySpdLmt;
    private double myVSpeed;
    private double myfine;

    public cl82ahelper(double sl, double vs) {
        double mySpdLmt = sl;
        double myVSpeed = vs;
        double myfine =0;
    }
    public void calc(){
        myfine = 20.00 + (myVSpeed - mySpdLmt) * 5.00;
    }
    public double getmyfine(){
        return myfine;
    }
}
