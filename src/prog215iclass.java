public class prog215iclass {
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



}
