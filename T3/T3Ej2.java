package T3;

import java.util.Scanner;

public class T3Ej2 {
    public static int md (int dato){
        int posibleDivisot = dato/2;
        while (dato%posibleDivisot !=0){
            posibleDivisot --;
        }
        return posibleDivisot;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,divisor;
        do {
            System.out.print("introduce un numero entero mayor que 1, 1 para acabar: ");
            numero = teclado.nextInt();
            if (numero >1){
                divisor = md(numero);
                System.out.println("el mayor divisor de "+numero+" es "+divisor);
            }
        }while (numero>1);
    }

}
