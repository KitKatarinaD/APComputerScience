public class Record {
    private int magicNum = 0;
    private int Wins = 0;
    private int losses = 0;
    private String name;
    private boolean leading = false;
    public Record()
    {
         magicNum = 0;
         Wins = 0;
         losses = 0;
         name = " ";
         leading = false;
    }

    public Record(String n, int w, int l)
    {
        magicNum = 0;
        Wins = w;
        losses = l;
        name = n;
        leading = false;
    }



}
