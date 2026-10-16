public class PruebasCirculo {
    public static void main(String[] args) {
        Punto origen = new Punto();
        Punto punto = new Punto(5,15);
        System.out.println(origen.toString()+"  "+punto.toString());
        System.out.println("Distancia "+punto.distancia(origen));
        System.out.println();
        Circulo circulo = new Circulo(origen,5);
        System.out.println(circulo);
        if (circulo.contiene(punto)){
            System.out.println("El punto "+punto+" esta dentro del circulo "+circulo);
        }

        Punto punto1 = new Punto(2,2);
        if (circulo.contiene(punto1)){
            System.out.println("El punto "+punto1+" esta dentro del circulo "+circulo);
        }
    }
}
