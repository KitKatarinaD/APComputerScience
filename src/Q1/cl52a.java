package Q1;

//Katarina Dries
//Q1.Prog52a
//10/17/2022
public class cl52a  {
    //private
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    /**
     *
     * @param l length
     * @param w width
     */


    //constructor: sets up private data
    public cl52a(int l, int w) {
        myLen = l;
        myWid = w;
        myArea = 0;
        myPerim = 0;

    }
    public void setStuff () {
        myArea =myWid * myLen;
        myPerim = 2 * myWid + 2 * myLen;
        // return; // a void method does not return anything-- the "empty return" is implicit
    }
    //Accessors: returns private data

    /**
     * Returns the area (length * width)p]
     * @return the calculated area after calling setStuff()
     */
    public int getArea() {return myArea; }
    public int getPerim() { return myPerim; }

    public String toString() {
        return String.format("Area: %s\nPerimeter: %s", myArea, myPerim);

    }
    //Easy Print Method
    public void print() {
        System.out.println(this.toString());

    }
}
/*Class:
*Private data
* constructors
* Modifiers (mutators)
* accessors
 */