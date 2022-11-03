public class cl82ahelper {
    private double mySpdLmt;
    private double myVSpeed;
    private double myfine;

    public cl82ahelper(double sl, double vs) {
        mySpdLmt = sl;
        myVSpeed = vs;
        myfine =0;
    }
    public void calc(){

        myfine = (double) (myVSpeed - mySpdLmt) * 5.00 + 20.00;
    }
    public double getmyfine(){
        return myfine;
    }
}
