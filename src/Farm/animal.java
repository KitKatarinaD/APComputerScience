package Farm;
//abstract means unfinished
public abstract class animal {
    private String myname;
    private int myweight;
    private int mynumcorn;
    private int mynumhaybales;


    public animal(String name, int weight, int corn, int hay){
        myname = name;
        myweight = weight;
        mynumcorn = corn;
        mynumhaybales = hay;
    }

    public abstract double value(double corncost, double haycost);

    public String getname() {return myname;}
    public int getweight() {return myweight;}
    public int getnumcorn() {return mynumcorn;}
    public int getnumhaybales() {return mynumhaybales;}

    public double getfeedcost(double corncost, double haycost) {
        return mynumcorn * corncost + mynumhaybales * haycost;
    }


}
