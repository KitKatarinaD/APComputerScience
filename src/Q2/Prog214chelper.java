package Q2;

public class Prog214chelper {
    private String mytype;
    private double mygal;
    private double mywashprice;
    private double mytot;
    private double mytemp;
    private double mytypecost;
    private String mywash;
    private double mygasprice;


    public Prog214chelper(String type, double gal, String wash) {
    mytype = type;
    mywash = wash;
    mywashprice = 2.00;
    mytot = 0;
    mytemp = 0;
    mygal = gal;
    mytypecost = 0;
    mygasprice = 0;
    }
                            //when 20 or more gallons purchased, car wash is free
    public void calc() { //price of wash  is reduced by 10% for every gallon after the 10th-- temp is how many times the loop is run and 10% is taken off

//wash price:
        if (mywash.equals("Y")) {
            if (mygal >= 20) {
                mytemp = 0;
            }else if (mygal >= 10) {
                mytemp = Math.floor(mygal - 10);
            }else {
                mytemp = 0;
            }
            if (mytemp > 0) {
               mywashprice = 2*(1-(mytemp * 0.1));
            }else {mywashprice = 0;}

        }else{mywashprice = 0;}

        //price of gas:
        if (mytype.equals("P")) {
            mytypecost = 1.479;
        }else if (mytype.equals("R")) {
            mytypecost = 1.359;
        }else {
            mytypecost = 1.429;
        }


        mytot = mygal*(mytypecost) + mywashprice;
        mygasprice = mygal * (mytypecost);
    }

    public double getMygal() {return mygal;}
    public String getmytype() {return mytype;}
    public double getMytypecost() {return mytypecost;}
    public double getMywashprice() {return mywashprice;}
    public String getmywash() {return mywash;}
    public double getMytot() {return mytot;}
    public double getMygasprice() {return mygasprice;}



    /*
    A service station with a car wash sells three grades of gasoline:
     regular unleaded at $1.359 per gallon,
     premium at $1.479 per gallon, and high octane at $1.429 per gallon
      A car wash normally costs $2.00, but the station offers a
      10% reduction on the price of a wash for every full gallon of
      gasoline purchased in the excess of the first 10 gallons.
       When 20 or more gallons are purchased, the car wash is free.
       Write a program that reads the number of gallons purchased by a
       customer and a character (R, P, or H) indicating the grade of
        gasoline purchased.  The program should print the cost of the
         gasoline and the price of a wash, read another character
          indicates whether or not the customer wants a car wash,
          and then print the total charges in the form of an invoice

     */





}
