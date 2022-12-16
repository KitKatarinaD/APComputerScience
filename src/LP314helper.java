public class LP314helper {
    private int myNYA;
    private int myNYM;
    private int myNJA;
    private int myNJM;
    private int myCA;
    private int myCM;
    private int myA;
    private int myM;
    private int mytot;
    private double myAP;
    private double myMP;

    public LP314helper(int NYA, int NYM, int NJA, int NJM, int CA, int CM) {
        myNYA = NYA;
        myNYM = NYM;
        myNJA = NJA;
        myNJM = NJM;
        myCA = CA;
        myCM = CM;
        myA = 0;
        myM  = 0;
        mytot = 0;
        myAP = 0;
        myMP = 0;
    }

    public void calc() {
        myA = myNYA + myNJA + myCA;
        myM = myNYM + myNJM + myCM;
        mytot = myA + myM;
        myAP =(double) myA/mytot * 100;
        myMP =(double) myM/mytot * 100;
    }

    public int getMyA() {
        return myA;
    }

    public int getMyM() {
        return myM;
    }

    public int getMytot() {
        return mytot;
    }
    public double getMyAP() {return myAP;}
    public double getMyMP() {return myMP;}

}
