package Prog702q;

public class Car extends Vehicle {

    private String myName;
    private int myTires;
    private double myValue;


    public Car(String name, int tires, double value) {
        super(name, tires);
        myValue = value;
    }

    public double getValue() {
        return myValue;
    }
}
