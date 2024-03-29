package Q3.SteganographyLab.StegStudentCode;
import java.awt.Color;

/**
 * Clear the lower (rightmost) two bits in a pixel.
 */

public class Steganography {
    public static void clearLow(Pixel p) {
        int r = p.getRed() / 4;
        int g = p.getGreen() / 4;
        int b = p.getBlue() / 4;
        p.setRed(r * 4);
        p.setGreen(g * 4);
        p.setBlue(b * 4);
    }

    public static Picture testClearLow(Picture pic) {
        Picture temp = new Picture(pic);


        for (int r = 0; r < temp.getWidth(); r++) {
            for (int c = 0; c < temp.getHeight(); c++) {
                clearLow(temp.getPixel(r, c));
            }
        }
        return temp;
    }

    /**
     * Set the lower 2 bits in a pixel to the highest to bits in c
     */
    public static void setLow(Pixel p, Color c) {
        int r = p.getRed() / 4;
        int g = p.getGreen() / 4;
        int b = p.getBlue() / 4;


        int rc = c.getRed() / 64;
        int gc = c.getGreen() / 64;
        int bc = c.getBlue() / 64;

        p.setRed(r * 4 + rc);
        p.setGreen(g * 4 + gc);
        p.setBlue(b * 4 + bc);
    }

    public static Picture testSetLow(Picture p, Color c) {
        Picture temp = new Picture(p);
        for (int r = 0; r < temp.getWidth(); r++) {
            for (int i = 0; i < temp.getHeight(); i++) {
                setLow(temp.getPixel(r, i), c);
            }
        }
        return temp;
    }

    /**
     * sets the highest two bits of each pixel's colors
     * to lowest two bits of each pixel's colors
     */
    public static Picture revealPicture(Picture hidden) {
        Picture copy = new Picture(hidden);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] source = hidden.getPixels2D();
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                Color col = source[r][c].getColor();
                int tempr = pixels[r][c].getRed();
                pixels[r][c].setRed(((col.getRed() % 64) * 64) + (tempr * 4 / 4));

                int tempg = pixels[r][c].getGreen();
                pixels[r][c].setGreen(((col.getGreen() % 64) * 64) + (tempg * 4 / 4));

                int tempb = pixels[r][c].getBlue();
                pixels[r][c].setBlue(((col.getBlue() % 64) * 64) + (tempb * 4 / 4));
            }
        }
        return copy;
    }


    //________________________________________________________________________________________
    public static void main(String[] args) {
        Picture beach2 = new Picture("beach.jpg");
        beach2.explore();
        Picture copy2 = testSetLow(beach2, Color.PINK);
        copy2.explore();
        Picture copy3 = revealPicture(copy2);
        copy3.explore();

    }
}