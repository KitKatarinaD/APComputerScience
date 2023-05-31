package Prog703s;

public class Windows extends Computer {

    private String myName;
    private int myNumber;
    private double myVersion;

    public Windows(String name, int number, double version) {
        super(name, number);
        myVersion = version;
    }

    public double getVersion() { return myVersion; }
}