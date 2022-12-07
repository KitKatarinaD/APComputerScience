public class Prog435aClass {
    private double myfactor;
    private String mytype;
    private int mygate;
    private double mytoll;
    private double mycost;


    public Prog435aClass(double factor, int gate) {
        myfactor = factor;
        mygate = gate;
        mytoll = 0;
        mycost = 0;
        mytype = "";
    }

    public void calc() {
        if (myfactor == 1.0) { mytype = "Compact Car";}
        else if (myfactor == 1.3) { mytype = "Small Car";}
        else if (myfactor == 1.6) {mytype = "Mid Size Car";}
        else if (myfactor == 2.0) {mytype = "Full Size Car";}
        else if (myfactor == 2.4) {mytype = "Truck";}
        else if (myfactor == 2.7) {mytype = "16 Wheeler";}

        if (mygate == 1) { mytoll=1.35;}
        else if (mygate == 2) { mytoll=2.00;}
        else if (mygate == 3) { mytoll=2.50;}
        else if (mygate == 4) { mytoll=3.25;}
        else if (mygate == 5) { mytoll=4.10;}
        else if (mygate == 6) { mytoll=4.8;}
        else if (mygate == 7) { mytoll=5.50;}
        else if (mygate == 8) { mytoll=6.00;}

        mycost = mytoll * myfactor;
    }

    public double getMyfactor() {return myfactor;}
    public String getMytype() {return mytype;}
    public int getMygate() {return mygate;}
    public double getMytoll() {return mytoll;}
    public double getMycost() {return mycost;}

//reads in several pairs of data (vehicle type, Gate number) and outputs the
//Name of the vehicle type, the toll, the factor, and total bill for turnpike use.
}
