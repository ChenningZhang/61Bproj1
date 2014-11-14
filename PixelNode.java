/* PixelNode.java */


public class PixelNode {

    private short red;
    private short green;
    private short blue;
    private int runLengths;
    public PixelNode prev;
    public PixelNode next;

    public PixelNode() {
        red = (short)0;
        green = (short)0;
        blue = (short)0;
        runLengths = 0;
        prev = null;
        next = null;
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

    public int getRunLengths() {
        return runLengths;
    }

    public void setNode(short r, short g, short b, int rL) {
        red = r;
        green = g;
        blue = b;
        runLengths = rL;
    }

    public void setRunLengths(int rL) {
	runLengths = rL;
    }

    public boolean eq(PixelNode node) {
	if (this.red == node.red && this.green == node.green && this.blue == node.blue) return true;
	else return false;
    }

}
