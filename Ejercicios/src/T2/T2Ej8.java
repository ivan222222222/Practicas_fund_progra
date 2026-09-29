package T2;

import java.util.Scanner;

public class T2Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long resultado=1;
        System.out.print("Escriba un numero: ");
        int numero = teclado.nextInt();
        for (int i=numero; i>1; i--){
            resultado*=i;
        }
        System.out.println("El factorial de "+numero+"= "+resultado);
    }
}
