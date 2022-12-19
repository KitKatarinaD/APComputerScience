public class Prog214chelper {
    private double myR;
    private double myP;
    private double myH;
    private double mywash;
    private double mytot;

    public Prog214chelper(double R, double P, double H) {
    myR = R;
    myP = P;
    myH = H;
    mywash = 2.00;
    mytot = 0;
    }

    public void calc() {
      if (myR > 10 || myP || myH)
        mytot = myR + myP + myH + mywash;

    }
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
