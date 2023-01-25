package Q2;

public class cl213fhelper {
    private double myKwh;
    private double myCost;

    public  cl213fhelper(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }
    public void calc() {
        if (myKwh <= 2000) {
            myCost = myKwh*0.07;
        }
        else if (myKwh > 2000 && myKwh <= 10000) {
            myCost = 2000*0.7 + ((myKwh-2000) * 0.05);
        }
        else if (myKwh > 1000){
            myCost = 2000*0.7 + 0.5 * 8000 + ((myKwh-10000) * 0.4);
        }
        else {
            myCost=0;
        }

    }

    public String toString() {
        return "The number of kwh is: " + myKwh + "\tThe Cost is: $" + String.format("%.2f", myCost);
    }

}
