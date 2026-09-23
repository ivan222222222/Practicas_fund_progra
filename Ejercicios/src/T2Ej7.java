import java.util.Scanner;

public class T2Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma=0,numero;
        for (int i=1; i<=15; i++){
            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();
            suma+=numero;
        }
        System.out.println("La suma total es "+suma);
    }
}
