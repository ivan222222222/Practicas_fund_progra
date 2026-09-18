import java.util.Scanner;

public class T2Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero del 0 al 99999: ");
        int num = teclado.nextInt();
        if (num <10 && num>= 0) {
            System.out.println(num + " tiene 1 cifra");
        } else if (num <100 && num >= 10) {
            System.out.println(num + " tiene 2 cifra");
        } else if (num <1000 && num >= 100) {
            System.out.println(num + " tiene 3 cifra");
        } else if (num < 10000 && num>= 1000) {
            System.out.println(num + " tiene 4 cifra");
        } else if (num <=99999 && num >= 10000) {
            System.out.println(num + " tiene 5 cifra");
        }
        else {
            System.out.println("Numero incorrecto");
        }

    }
}