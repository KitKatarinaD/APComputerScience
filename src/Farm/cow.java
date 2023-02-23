package Farm;

public class cow extends animal{
    private double mymilk;
    public final double MILK_PRICE_LB = 0.20; //final means it doesn't change

    public cow(String name, int weight, double milk, int corn, int hay) {
        super(name, weight, corn, hay);
        mymilk = milk;
    }

    public double value(double corncost, double haycost) {
        return mymilk*MILK_PRICE_LB - getfeedcost(corncost, haycost);

    }

    public double getmilk() {return mymilk;}
    public double getmilkprice() {return MILK_PRICE_LB;}

}
