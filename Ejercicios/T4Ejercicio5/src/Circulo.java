public class Circulo {
    private Punto centro ;
    private  double radio;
    public Circulo (Punto centro, double radio){
        this.centro = centro;
        this.radio = radio;

    }

    @Override
    public String toString() {
        return "[centro: "+centro+", radio: "+radio+"]";
    }

    public boolean contiene(Punto punto){
        return centro.distancia(punto)<= radio;
    }
}
