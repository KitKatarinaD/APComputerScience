package Q3.SteganographyLab.StegStudentCode;
import java.awt.Color;

/**
 * Clear the lower (rightmost) two bits in a pixel.
 */

public class Steganography {
    public static void clearLow(Pixel p) {
        int r = p.getRed() /4 ;
        int g = p.getGreen() / 4;
        int b = p.getBlue() /4;
        p.setRed(r*4);
        p.setGreen(g*4);
        p.setBlue(b*4);
    }

    public static Picture testClearLow(Picture pic) {
       Picture temp =  new Picture(pic);


        for (int r = 0; r < temp.getWidth(); r++){
            for (int c = 0; c <temp.getHeight(); c++) {
               clearLow(temp.getPixel(r, c));
            }
        }
        return temp;
    }

    /**
     * Set the lower 2 bits in a pixel to the highest to bits in c
     */
    public static void setLow(Pixel p, Color c){
        int r = p.getRed() /4 ;
        int g = p.getGreen() / 4;
        int b = p.getBlue() /4;


        int rc = c.getRed() /64;
        int gc = c.getGreen() /64;
        int bc = c.getBlue() /64;

        p.setRed(r*4 + rc);
        p.setGreen(g*4 + gc);
        p.setBlue(b*4 + bc);
    }

    public static Picture testSetLow(Picture p, Color c){
        Picture temp =  new Picture(p);
        for (int r = 0; r < temp.getWidth(); r++){
            for (int i = 0; i <temp.getHeight(); i++) {
                setLow(temp.getPixel(r, i), c);
            }
        }
        return temp;
    }





    //________________________________________________________________________________________
    public static void main(String[] args) {
        Picture beach2 = new Picture ("beach.jpg");
        beach2.explore();
        Picture copy2 = testSetLow(beach2, Color.PINK);
        copy2.explore();


    }
}