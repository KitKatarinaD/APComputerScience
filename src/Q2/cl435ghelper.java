package Q2;

public class cl435ghelper {
    private int myScore;
    private int myRank;

    public cl435ghelper(int score) {
        myScore = score;
        myRank = 0;
    }

    public int getScore() {return myScore; }
    public int getMyRank() { return myRank;}
    public void setRank(int rank) {myRank = rank; }
    public String toString() {return myScore + "\t" + myRank; }

}
