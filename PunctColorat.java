public class PunctColorat extends Punct {
    private String c;

    public PunctColorat(int x, int y, String c) {
        super(x, y);
        this.c = c; 
    }

    public String getC() {
        return c;
    }
}