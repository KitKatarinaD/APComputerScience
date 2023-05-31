package Prog702q;

public class Vehicle implements Names {
    private String myName;
    private int myTires;


    public Vehicle(String name, int tires) {
        myName = name;
        myTires = tires;
    }

    public String getName() {
        return myName;
    }


    public int getTires() { return myTires; }
}