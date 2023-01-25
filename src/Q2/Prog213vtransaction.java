package Q2;//Katarina Dries
//12/5/2022
//Prog213v

public class Prog213vtransaction {
    private String myType;
    private double myAmt;


    public Prog213vtransaction(String type, double amt) {
        myAmt = amt;
        myType = type;
    }

    public String getCode() {return myType;}
    public double getAmt () {return myAmt;}

}
