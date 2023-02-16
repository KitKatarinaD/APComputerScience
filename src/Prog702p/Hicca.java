package Prog702p;

public class Hicca extends animal {
    private double myfur;


    public Hicca(double fur, String word, String name) {
        super(name, word); //calls the constructor from what you extended (animal)
        myfur = fur;

    }

    public double getfur() {return myfur;}
    //you dont need to do the get methods for name and word because they were already inherited


}