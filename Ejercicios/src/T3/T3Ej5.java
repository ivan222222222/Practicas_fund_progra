package T3;

import java.util.Scanner;

public class T3Ej5 {
    public static long faltorial(int n){
        long resultado=1;
        for (int i=2;i<=n;i++){
            resultado *=i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dato1,dato2;
        System.out.print("introduce dos numero positivos: ");
        dato1 = teclado.nextInt();
        dato2 = teclado.nextInt();
        if (dato1>0 && dato2 >0){
            System.out.println(faltorial(dato1)+faltorial(dato2));
        }else System.out.println("uno de los numero no es positivo");

    }
}
