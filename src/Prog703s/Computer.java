package Prog703s;

public class Computer implements Names {
    private String myName;
    private int myNumber;


    public Computer(String first, int number) {
        myName = first;
        myNumber = number;
    }

    public String getName() {
        return myName;
    }


    public int getNumber() { return myNumber; }

}