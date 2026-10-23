public class ColorRGB {
    private int r;
    private int g;
    private int b;

    public ColorRGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public boolean equals(ColorRGB color) {
        boolean iguales= false;
        if ((color.r == r) || (color.g == g) || (color.b == b)){
            iguales = true;
        }
        return iguales;
    }
}
