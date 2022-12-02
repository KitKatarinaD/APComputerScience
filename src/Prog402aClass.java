public class Prog402aClass {
    private int myid;
    private int myscore;
    private double mydiff;

    public Prog402aClass(int id, int score) {
        myid = id;
        myscore = score;
        mydiff = 0;
    }

    public void calc(double avg) {
        mydiff = myscore - avg;
    }





}
