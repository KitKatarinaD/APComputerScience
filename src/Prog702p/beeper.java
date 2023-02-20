package Prog702p;

public class beeper extends animal {
    private String myextraword;

    public beeper(String name, String word, String extraword) {
        super(word, name);
        myextraword = extraword;
    }

    public String getextraword() {return myextraword;}



}
