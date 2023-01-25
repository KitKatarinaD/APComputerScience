package Q2;//Katarina Dries
//Q2.prog213b
//11/7/2022

public class cl213b {
    private  int myQuant;
    private double myPrice;
    private double myAmt;

    public cl213b(int quant){
        myQuant=quant;
        myPrice=0;
        myAmt=0;
    }
    public void calc(){
        if (myQuant > 0 && myQuant < 100) myPrice = 5.59;
        else if (myQuant > 99 && myQuant < 200) myPrice = 5.75;
        else if (myQuant > 199 && myQuant < 300) myPrice = 5.40;
        else if (myQuant >= 300) myPrice = 5.15;
        myAmt = myPrice * myQuant;
    }
    public String toString(){
        return String.format("Price = $" + myPrice + "\nAmount Due = $" + String.format("%.2f", myAmt));
    }

}
