/* Pixel.java */

public class Pixel {

    private short red;
    private short green;
    private short blue;

    public Pixel() {
        red = (short)0;
        green = (short)0;
        blue = (short)0;
    }

    public short getRed() {
        return red;
    }

    public short getGreen() {
        return green;
    }

    public short getBlue() {
        return blue;
    }

    public void setColor(short r, short g, short b) {
        red = r;
        green = g;
        blue = b;
    }
}
