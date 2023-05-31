package Prog702q;

public class Truck extends Vehicle {

    private String myName;
    private int myTires;
    private double myMileage;

    public Truck(String name, int tires, double mileage) {
        super(name, tires);
        myMileage = mileage;
    }

    public double getMileage() {
        return myMileage;
    }
}