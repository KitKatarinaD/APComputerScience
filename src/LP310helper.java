public class LP310helper {
    private int myburg;
    private int myfries;
    private int mysodas;
    private double mytotbt;
    private double mytax;
    private double mytotf;

    public LP310helper(int burg, int fries, int sodas) {
        myburg = burg;
        myfries = fries;
        mysodas = sodas;
        mytotbt = 0;
        mytax = 0;
        mytotf = 0;
    }

    public void calc() {
        mytotbt = myburg * 1.69 + myfries * 1.09 + mysodas *0.99;
        mytax = 0.065 * mytotbt;
        mytotf = mytotbt + mytax;
    }

    public double getMytotbt() {return mytotbt;}
    public double getMytax() {return mytax;}
    public double getMytotf() {return mytotf;}

}
