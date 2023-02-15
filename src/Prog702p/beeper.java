package Prog702p;

public class beeper extends animal {
    private String myextraword;

    public beeper(String extraword, String word, String name) {
        super(word, name);
        myextraword = extraword;
    }

    public String getextraword() {return myextraword;}



}
