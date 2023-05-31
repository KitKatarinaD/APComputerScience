package Prog703s;

public class Linux extends Computer {
    private String myName;
    private int myNumber;
    private int myCode;

    public Linux(String name, int num, int code) {
        super(name, num);
        myCode = code;
    }

    public double getCode() { return myCode; }

}