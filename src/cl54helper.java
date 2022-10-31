public class cl54helper {
    private double Myradius;
    private double Mypi;
    private double Myarea;
    private double Mycircum;
    public cl54helper(double radius) {
        Myradius = radius;
        Mypi = 3.14159;
        Myarea = 0;
        Mycircum = 0;
    }
    public void calc() {
        Myarea = Mypi * Math.pow(Myradius, 2);
        Mycircum = Mypi * Myradius * 2;
    }
    public double getMyarea() {
        return Myarea;
    }
    public double getMycircum() {
        return Mycircum;
    }
}




