package Q2;

public class Prog435aClass {
    private int mycar;
    private double myfactor;
    private String mytype;
    private int mygate;
    private double mytoll;
    private double mycost;


    public Prog435aClass(int car, int gate) {
        mycar = car;
        mygate = gate;
        mytoll = 0;
        mycost = 0;
        mytype = "";
    }

    public void calc() {
        if (mycar==1) { mytype = "Compact Car"; myfactor = 1.0;}
        else if (mycar==2) { mytype = "Small Car"; myfactor = 1.3;}
        else if (mycar==3) {mytype = "Mid Size Car"; myfactor = 1.6;}
        else if (mycar==4) {mytype = "Full Size Car"; myfactor = 2.0;}
        else if (mycar==5) {mytype = "Truck"; myfactor = 2.4;}
        else if (mycar==6) {mytype = "16 Wheeler"; myfactor = 2.7;}

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
