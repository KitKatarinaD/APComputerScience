package Q2;//Katarina Dries
//1/3/2023
//Q2.Prog505a

/**
 * The Book Class for Q2.Prog505a
 */
public class cl505a {
    private String myName;
    private int myBooks;
    private int myPoints;

    public cl505a(String name, int books) {
        myName = name;
        myBooks = books;
        myPoints = 0;
    }
    public void calc() {
        if (myBooks <=3) {
            myPoints = myBooks * 10;
        }else if (myBooks <= 6)
            myPoints = (myBooks - 3) * 15 + 30;
        else
            myPoints = (myBooks - 6) * 20 + 30 + 45;

    }

    public String getName() { return myName;}
    public int getBooks() { return myBooks;}
    public int getPoints() {return myPoints;}

    public String toString() {
        return myName + "\t" + myBooks + "\t" + myPoints;
    }



}
