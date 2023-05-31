package Prog703s;

public class Apple extends Computer {

    private String myName;
    private int myNumber;
    private String myColor;


    public Apple(String name, int number, String color) {
        super(name, number);
        myColor = color;
    }

    public String getColor() { return myColor; }
}