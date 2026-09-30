package T3;

import java.util.Scanner;

public class T3Ej4 {
    public static int invertir(int dato){
        int inverso= 0;
        while(dato>0){
            inverso = inverso*10 +dato%10;
            dato /= 10;

        }
        return inverso;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        int numero = teclado.nextInt();
        while (numero>=0 && numero < 10000) {
            System.out.println("el inverso de "+numero+" es "+ invertir(numero));
            System.out.println("Introduce otro numero, negativo para finalizar");
            numero = teclado.nextInt();
        }
    }
}
