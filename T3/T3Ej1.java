package T3;

import java.util.Scanner;

public class T3Ej1 {
    public static void mostrarEntreDos(int i1, int i2){
        int aux = i1;
        if (i2<i1){
            i1=i2;
            i2=aux;
        }
        System.out.println("numero entre "+i1+" y "+i2);
        for (int i =i1;i<=i2;i++){
            System.out.print(i+", ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        mostrarEntreDos(-10,10);
        System.out.print("introduce dos numero: ");
        int x1 = teclado.nextInt();
        int x2 = teclado.nextInt();
        mostrarEntreDos(x1,x2);

    }
}
