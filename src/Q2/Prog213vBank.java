package Q2;

public class Prog213vBank {
    private double myAmt;

    public Prog213vBank(double amt) {
        myAmt = amt;
    }
    public  double getAmt() { return myAmt;}

    public void calc(Prog213vtransaction thing) {
        if (thing.getCode().equals("C")) {
            if (thing.getAmt() > this.getAmt())
                myAmt = this.getAmt() - 10;
            else {
                myAmt -= thing.getAmt();
            }
        }else if (thing.getCode().equals("S")) {
            myAmt -= thing.getAmt();
        }else if (thing.getCode().equals("D")) {
            myAmt += thing.getAmt();
        }
    }

}
