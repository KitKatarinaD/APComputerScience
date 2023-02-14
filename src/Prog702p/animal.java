package Prog702p;

public class animal implements names {
    private String myname;
    private String myword;


    public animal(String name, String word) {
        myname = name;
        myword = word;
    }

    public String getName(){
        return myname;
    }

    public String getWord(){
        return myword;
    }


}