public class prog215iclass {  //one vehicle
    private double mygal;
    private int myvehicle;
    private double mymiles;
    private double mympg;


    public prog215iclass(int vehicle, double gal, double miles) {
        myvehicle = vehicle;
        mygal = gal;
        mymiles = miles;
        mympg = 0;
    }

    public void calc() {
        mympg = mymiles/mygal;
    }

    public void setMygal(double gal) { mygal = gal;}
    public void setMyvehicle(int vehicle)  {myvehicle = vehicle;}
    public void setMymiles(double miles) {mymiles = miles;}

    public int getMyvehicle() {return myvehicle;}
    public double getMygal() {return mygal;}
    public double getMymiles() {return mymiles;}
    public double getMympg() {return mympg;}


}
