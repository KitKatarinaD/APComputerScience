package Prog702p;

public class wallies extends animal{
    private double mysteps;

    public wallies(double steps, String word, String name) {
        super(name, word);
        mysteps = steps;
    }

    public double getSteps() {return mysteps;}



}

