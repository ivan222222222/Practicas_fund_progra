public class Punto {
    private double x,y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0,0);
    }

    @Override
    public String toString() {
        return '(' + x + ", " + y + ')';
    }
    public double distancia(Punto punto){
        return Math.sqrt(Math.pow(this.x - punto.x,2)+Math.pow(this.y - punto.y,2));
    }
}
