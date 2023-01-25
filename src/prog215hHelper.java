public class prog215hHelper {
    private double myone;
    private double mytwo;
    private double mythree;
    private double myfour;
    private double myfive;
    private double mysix;
    private double myseven;
    private double myeight;
    private double myavg;


    public prog215hHelper(double one, double two, double three, double four, double five, double six, double seven, double eight) {
        myone = one;
        mytwo = two;
        mythree = three;
        myfour = four;
        myfive = five;
        mysix = six;
        myseven = seven;
        myeight = eight;
        myavg = 0;
    }

    public void calc() {
        myavg = (myeight + myseven + mysix + myfive + myfour + mythree + mytwo + myone)/8;
    }

    public double getMyavg() {return myavg;}

    public double getMyeight() {
        return myeight;
    }

    public double getMyseven() {
        return myseven;
    }

    public double getMysix() {
        return mysix;
    }

    public double getMyfive() {
        return myfive;
    }

    public double getMyfour() {
        return myfour;
    }

    public double getMythree() {
        return mythree;
    }

    public double getMytwo() {
        return mytwo;
    }

    public double getMyone() {
        return myone;
    }


}
