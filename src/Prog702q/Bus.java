package Prog702q;

public class Bus extends Vehicle {
    private String myName;
    private int myTires;
    private String myHometown;

    public Bus(String name, int tires, String hometown) {
        super(name, tires);
        myHometown = hometown;
    }

    public String getHometown() {
        return myHometown;
    }
}