public class helper54c {
    private double pi;
    private double myradius;
    private double myarea;
    private double mycir;

public helper54c (double r) {
    pi = 3.14159;
    myradius = r;
    myarea = 0;
    mycir = 0;
}
public void calc(){
    myarea = Math.pow(myradius, 2)*pi;
    mycir = myradius*2 * pi;

    }

public double getmyarea() {
    return myarea;
}
public double getmycir() {
    return mycir;
}

}

