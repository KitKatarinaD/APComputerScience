public class Prog214chelper {
    private double myR;
    private double myP;
    private double myH;
    private double mywash;
    private double mytot;
    private double mytemp;


    public Prog214chelper(double R, double P, double H) {
    myR = R;
    myP = P;
    myH = H;
    mywash = 2.00;
    mytot = 0;
    mytemp = 0;
    }

    public void calc() { //price of wash
      if (myR >= 10) {
          mytemp = myR - 10;
      }else if (myP >= 10) {

      }else if (myH >= 10){

      }else {
          mytemp = 0;
      }
      //set the temp vsalue to a value and then must replace the stuff underneath this comment
        //with the value of mytemp. you will need to write a loop to take 10% each time of the loop.

          if (myR >= 20 || myP >= 20 || myH >= 20) {
              mywash = 0.00;
          } else {
              for (int lcv = 0; lcv < (myR - 10); lcv ++) {
                  mywash =
              }
              mywash = (myR - 10)
          }
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
