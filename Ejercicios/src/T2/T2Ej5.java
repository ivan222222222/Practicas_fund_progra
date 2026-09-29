package T2;

import java.util.Scanner;

public class T2Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,contador=0,b;
        b = (int)(Math.random()*25+1);
        do {
            System.out.print("Introduce un numero entre 1 y 25: ");
            numero = teclado.nextInt();
            if (b>numero){
                System.out.println("El numero es mayor que "+numero);
            }
            if (b<numero){
                System.out.println("El numero es menor que "+numero);
            }
            contador++;
        }while(numero!=b);
        System.out.println("Enhorabuena has acertado el numero en "+contador+" intentos");
    }
}
