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
    public static void main(String[] args) {
        Picture beach = new Picture ("beach.jpg");
        beach.explore();
        Picture copy = testClearLow(beach);
        copy.explore();


    }
}