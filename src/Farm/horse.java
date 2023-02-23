package Farm;

public class horse extends animal{
    private int mynumrides;
    private double myridecost;

    public horse(String name, int weight, int corn, int hay, int rides, double cost){
        super(name, weight, corn, hay);
        mynumrides = rides;
        myridecost = cost;
    }

    public double value(double corncost, double haycost) {
        return mynumrides * myridecost - getfeedcost(corncost, haycost);
    }

    @Override  // this is basically an annotation
    public String getname() {return super.getname() + super.getname(); }
    public int getrides() {return mynumrides;}
    public double getridecost() { return myridecost;}

}
